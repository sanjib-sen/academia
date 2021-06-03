import java.util.Scanner;
public class sanjibtask9
{
public static void main (String []args)
{
 System.out.println("Enter the first number:");
 Scanner sks=new Scanner(System.in);
 double num1=sks.nextDouble();
 System.out.println("Enter the Second Number");
 double num2=sks.nextDouble();
 
if (num1>num2)
{
  System.out.println(num1-num2);
}
else 
{
 System.out.println(num2-num1);
}  
}
}