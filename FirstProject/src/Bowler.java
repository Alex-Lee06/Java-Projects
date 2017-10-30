/**
 * Write a description of class Bowler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bowler
{
    // instance variables - replace the example below with your own
    private String fullName;
    private int age;
    private int score1, score2, score3;
    

    /**
     * Constructor for objects of class Bowler
     */
    public Bowler()
    {
        fullName = null;
        age = 0;
        score1 = 0;
        score2 = 0;
        score3 = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calcAverage(double average )
    {
        average = (score1 + score2 + score3) / 3;
        
        return average;
    }
    
    public String getName ( )
    {
        return fullName;
    }
    
    public int getFirstScore ( )
    {
        return score1;
    }
    
    public int getSecondScore ( )
    {
        return score2;
    }
    
    public int getThirdScore ( )
    {
        return score3;
    }    
}
