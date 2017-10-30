import java.util.*;
/*
 * This program will be creating a Russian Peasant Multiplication using 2 factors and 1 product.
 * First we will use a loop to do the calculations for the Russian Peasant Multiplication.
 * Second we will use recursion to do the Russian Peasant Multiplication by calling itself.
 * We use the column that will be divided by 2 to mark out and figure out the remaining numbers to add.
 */

public class Driver {
	public static void main(String ars[])
	{
		int first_factor;
		int second_factor;
		int checker;
		int product = 0;
		char user_method;
		char one_method;
		Scanner sc = new Scanner(System.in);
		Class main = new Class();
		
		System.out.println("Please the first factor number. (Only a whole number)");
		first_factor = sc.nextInt();
		main.setFirst(first_factor);
		System.out.println("Please enter the second factor number. (Only a whole number)");
		second_factor = sc.nextInt();
		main.setSecond(second_factor);
		System.out.println("Would you like to run both methods? (y or n)");
		user_method = sc.next().charAt(0);

		if(user_method == 'y' || user_method == 'Y')
		{
			System.out.println(main.russian_peasant(first_factor, second_factor));

				while(second_factor > 0)
				{

					if ((second_factor % 2) != 0)
						{
							product += first_factor;
						}
					first_factor = first_factor*2;
					second_factor = second_factor/2;
				}

			System.out.println("Answer using a loop: " + product);
			
		}

			if(user_method == 'n' || user_method == 'N')
			{
				System.out.println("Which method would you like to use?");
				System.out.println("Insert L for nonrecusive and R for recursive.");
				one_method = sc.next().charAt(0);
				if(one_method == 'L' || one_method == 'l')
				{

						while(second_factor > 0)
						{

							if ((second_factor % 2) != 0)
								{
									product += first_factor;
								}
							first_factor = first_factor*2;
							second_factor = second_factor/2;
						}

					System.out.println("Answer using a loop: " + product);
				}
				else
					if(one_method == 'R' || one_method == 'r')
					{
						System.out.println(main.russian_peasant(first_factor, second_factor));

					}


			}

	}
}
