/**
 * 
 * @author 
 *
 */
public class Class {
	/*
	 * 3 fields to store whole numbers
	 */
	int first_factor;
	int second_factor;
	int product;
	/*
	 * This is a simple constructor that sets the fields to 0.
	 */
	public Class()
	{
		first_factor = 0;
		second_factor = 0;
		product = 0;
	}
	
	/**
	 * This creates a constructor and sets the fields to normal variables to be used by the program.
	 * 
	 * @param first_factor
	 * @param second_factor
	 */
	public Class(int first_factor, int second_factor)
	{
		this.first_factor = first_factor;
		this.second_factor = second_factor;
	}
	
	public void setFirst(int first_factor)
	{
		first_factor=first_factor;
	}
	public void setSecond(int second_factor)
	{
		second_factor = second_factor;
	}
	/**
	 * This method will be called for the recrusion for russian peasant multiplcation. NO LOOP IS IMPLEMENTED. It calls itself back.
	 * @param first_factor
	 * @param second_factor
	 * @return product
	 */
	public int russian_peasant(int first_factor, int second_factor)
	{
        if (first_factor == 1) {
            return second_factor;
        }    
		
        product = russian_peasant(first_factor / 2, second_factor * 2);// this implements the recrusion
        if ((first_factor % 2) != 0) {
           product += second_factor;
        }
        return product;
		
	}

}
