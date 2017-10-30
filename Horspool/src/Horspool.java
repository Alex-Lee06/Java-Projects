/**
* First, write the code to create the shift table.
* Second, write the code to do the searching using the shift table.
* Third write a driver that allows the user to enter text (could be nonsense or a real sentence.
* Then allow the user to enter the pattern to find in the text.
* The result of whether the pattern was found or not and if found, at what starting position of the text.
* Loop to allow the user to enter another text and pattern pair.
 * @author
 *
 */

public class Horspool  {
	   
	   public static int alphabet_size=256;    
	   public static int table[]=new int[alphabet_size];
/**
 * Boyer–Moore–Horspool preprocesses the pattern to produce a table containing, for each symbol in the alphabet, 
 * the number of characters that can safely be skipped. (for an alphabet of 256 symbols, i.e., bytes):
 * This is preprocessing to make the algorithm run faster.	   
 * @param pattern
 */
	public void shifttable(String pattern) {
	  
	 int setLength;
	 char p[] = pattern.toCharArray();
	 setLength = pattern.length();
	  
	 for (int i = 0; i < alphabet_size; i++)
	    table[i] = setLength;
	 for (int k = 0; k < setLength; k++)
	    table[p[k]] = setLength - 1 - k;
	}
	
	/**
	 * To search for the patterns we created a horspool method.
	 *
	 * @param source
	 * @param pattern
	 * @return
	 */
	public int horspool(String source,String pattern)
	  {
	      int k;
	      int setLength;
	      int position;
	      char s[] = source.toCharArray();
	      char p[] = pattern.toCharArray();
	      setLength = pattern.length();
	      
	      for(int i = setLength - 1; i < source.length();)
	        {
	           k=0;
	            while((k<setLength) && (p[setLength-1-k] == s[i-k]))
	              k++;
	           if(k==setLength) 
	     {   position = i  - setLength + 2;
	               return position;
	     } 
	           else
	               i += table[s[i]];
	        }
	        return -1;
	  } 
}