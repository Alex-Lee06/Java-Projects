/**
This program will be used for class creation, method creation, pretty much all the basics.

**/

import java.util.*;                     //Library
import java.io.*;

public class sumArray
{
  int i;                          //global variables
  int j;
  int sum;
public sumArray()                 //constructor, initialize global
{
  i = 0;
  j = 0;
  sum=0;
}
public sumArray(int k, int j, int sum)      //overload constructor
{
  i = k;
  this.j = j;
  this.sum = sum;
}
public void seti(int k)
{
   i = k;
}
public void setj()
{
j = j;
}
public int geti()
{
  return i;
}
public int getj()
{
  return j;
}
public void  setsum()
{
  sum = k + j;
}
public int getsum()
{
  return sum;
}

public static void main(String [] args)
{
  int k = 0;
  int j = 0;
  int sum = 0;

  scanner input= new scanner(system.in);    //scanner is used for user input
  sumArray sum = new sumArray();
  system.out.println("What is you dang on first number?");

  k = input.nextInt();         //used to store the user input
  sum.seti(i);              //used to set the k in the class to the i in the main
  System.out.println("What is your dang on second number");

  j = input.nextInt();
  sum.setj(j);
  System.out.println(sum.getsum());
}
}
