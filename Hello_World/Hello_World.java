/**
This program will be used for class creation, method creation, pretty much all the basics.

**/

import java.util.*;
import java.io.*;

public class Hello_World{
// this area is for you to create methods and contructors and overload contructors
public int number;
public double decimalNumber;
public String words;
public char letter;

public Hello_World(){// contructors initializes variable
number = 0;
decimalNumber = 0.00;
words = null;
letter = '\0';
}// end of contructor

public Hello_World(int number, double decimalNumber, String words, char letter){// overload constructor needs parameters this makes it overloaded you will be using this to call to main
  this.number = number;
  this.decimalNumber = decimalNumber;
  this.words = words;
  this.letter = letter;
}//end of overload constructor

public void setNumber(){//
  number = 100;
}

public int getNumber(){
  return number;
}


  public static void main(String args[]){
    Hello_World hello = new Hello_World();// creates an object for Hello_World making it named hello now.
    int number = 100;
    int alex = 1;// int no decimal points only whole numbers.
    double hi = 1;// double will always have a decimal point.
    float hey = 1;// does the same thing as double but floats can not h  System.out.println(array[]);  System.out.println(array[]);  System.out.println(array[]);old as many numbers as doubles;
    String take = null;// null means nothing you want to initialize it with null always initialize it with something
    String red = "initialized";// Strings are used to hold worlds are a combination of letters.
    char characters = 'Q';// Char = characters this can only hold 1 character.  You need to use '' and not "".
    int array[] = {1,2,3,4,5};// initialize array, all arrays begin with element 0 not 1
      // System.out.println("Hello, World");
      System.out.println(alex);
      // System.out.println(hi);
      // System.out.println(hey);
      // System.out.println(take);
      // System.out.println(red);
      // System.out.println(characters);
      // for(int i = 0; i<5; i++)
      // {
      //   System.out.println(array[i]);
      // }// end of for loop
      hello.setNumber();
      System.out.println(hello.getNumber());




    }//end of main
// this area is for you to create methods and contructors and overload contructors
}// end of class
