import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[]args) throws IOException
	{
		
		String fileName = "C:/Users/Alex Lee/Desktop/data.txt";
		String userFile = null;
//        FileReader file = new FileReader(fileName);
        
//        Scanner sc = new Scanner(file);

        System.out.print("What is the path to your program? ");
        Scanner input = new Scanner(System.in);
//        userFile = input.nextLine();
        FileReader file = new FileReader(input.nextLine());
        input = new Scanner(file);
        while(input.hasNextLine()){
            String line = input.nextLine();          
            
            StringBuilder myStringBuilder = new StringBuilder(line);
       
            converter myConverter = new converter(myStringBuilder);// ctreates a reference variable for Converter
            
            //uses the methods from the class program
            //outfile.println(myConverter.getConvertedString());
            System.out.println(myConverter.getConvertedString());  
        }

        input.close();
        //sc.close();
	}
}
