
public class converter {
	StringBuilder original; //declares a stringbuilder for original
	   String convertedSentence; //declares a string for the converted sentence
	   
	   /**
	    * This is the default constructor it will set the
	    * fields to null
	    */
	   public converter( )
	   {
	       original = null; //sets original to null
	       convertedSentence = null; //sets convertedSentnece to null
	   }
	   /**
	    * This is the overload constructor that sets
	    * them equal to eatch other it is used to be
	    * called into the Driver program
	    * 
	    * @param line
	    */
	   public converter(StringBuilder line)
	   {
	       original = new StringBuilder(line);
	       convertedSentence = new String(line);

	       convert(original);
	   }

	   /**
	    * This will check to see if the number is a double digit or not if
	    * it is a double digit the value will not be changed if it is a 
	    * single digit it will be changed accordingly
	    * @param StringBuilder line
	    */
	   public void convert(StringBuilder line)
	   {      
	       StringBuilder temp = new StringBuilder();// creates a reference variable for string builder
	              
	       for(int i = 0; i < line.length(); i++)
	       {
	           char number = line.charAt(i);
	          
	           if(Character.isDigit(number))
	           {
	               boolean singleNumber = true; // if the number is a single digit than it returns true
	              
	               if((i + 1) < line.length())
	               {
	                   char nextNumber = line.charAt(i + 1);
	                  
	                   if(Character.isDigit(nextNumber))
	                       singleNumber = false; // if the number is not a single digit than it returns false
	               }
	              
	               if((i - 1) >= 0)
	               {
	                   char prevNumber = line.charAt(i - 1);//starts checking at -1 in the sentence
	                  
	                   if(Character.isDigit(prevNumber))
	                       singleNumber = false;
	               }
	                              
	               if(singleNumber)//if the numerical value is a single digit than the value will be changed in this if statement
	               {
	                   if(number == '0')
	                       temp.append("zero");//if there is any 0 number it will change to zero
	                   else if(number == '1')
	                       temp.append("one");//if there is any 1 number it will change to one
	                   else if(number == '2')
	                       temp.append("two");//if there is any 2 number it will change to two
	                   else if(number == '3')
	                       temp.append("three");//if there is any 3 number it will change to three
	                   else if(number == '4')
	                       temp.append("four");//if there is any 4 number it will change to four
	                   else if(number == '5')
	                       temp.append("five");//if there is any 5 number it will change to five
	                   else if(number == '6')
	                       temp.append("six");//if there is any 6 number it will change to six
	                   else if(number == '7')
	                       temp.append("seven");//if there is any 7 number it will change to seven
	                   else if(number == '8')
	                       temp.append("eight");//if there is any 8 number it will change to eight
	                   else if(number == '9')
	                       temp.append("nine");//if there is any 9 number it will change to nine                  
	               }
	               else
	                   temp.append(number);
	           }
	           else
	           {
	               temp.append(number);
	           }//end of if statement
	       }
	      
	       char firstChar = temp.charAt(0);
	      
	       if(Character.isLowerCase(firstChar))//if the first letter of a sentence is lower case than it will be set to upper case
	           temp.replace(0, 1, Character.toUpperCase(firstChar) + "");
	      
	       convertedSentence = temp.toString();
	   }
	   
	   /**
	    * @ return convertedSentence
	    */
	   public String getConvertedString()
	   {
	       return convertedSentence; // returns the convertedSentence
	   }
	  
	   /**
	    * changes it to a string
	    * @ return convertedSentence
	    */
	   
	   public String toString()
	   {
	       return convertedSentence; // returns the convertedSentence
	   }
	
}
