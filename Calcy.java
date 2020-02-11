import java.util.*;
import java.lang.*;
import java.io.*;
class Calculator
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter numbers");
      int s1=sc.nextInt();
      int s1=sc.nextInt();
      System.out.println("Choose an operation ");
      System.out.println("1.Addition");
      System.out.println("2.Multiplication");
      System.out.println("3.Subtraction");
      System.out.println("4.Division");
      int c=sc.nextInt();
      switch(c)
      {
          case 1: int sum=s1+s1;
                   System.out.println("Sum of "+s1+" and "+s2+" is "+sum);
                   break;
          case 2: int sub=num1-num2;
                   System.out.println("Difference of "+s1+" and "+s2+" is "+sub); 
                   break;
          case 3: int multi=num1*num2;
                   System.out.println("Product of "+s1+" and "+s2+" is "+multi); 
                   break; 
          case 4: int div=num1/num2;
                   System.out.println("Division of "+s1+" and "+s2+" is "+div);       
                   break;
          default:  System.out.println("Nothing");
                     break;                           
      }
    }
}