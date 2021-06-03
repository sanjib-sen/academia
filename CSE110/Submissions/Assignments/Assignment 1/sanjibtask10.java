import java.util.Scanner;
public class sanjibtask10
{
 public static void main (String []args)
 {
   System.out.println("Enter a number");
   Scanner sks=new Scanner(System.in);
   int num=sks.nextInt();
    if (num!=0)
   { if (num%2==0) 
 {
   System.out.println("The number is even");
 }
 else
 {
 System.out.println("The number is odd");
 }
    }
  if(num==0)
 {
  System.out.println("The given number is neither even nor odd");
 }
 
  
 }
}