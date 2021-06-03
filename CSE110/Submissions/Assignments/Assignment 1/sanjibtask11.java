import java.util.Scanner;
public class sanjibtask11
{
  public static void main (String []args) {
    Scanner sanju=new Scanner(System.in);
    System.out.println("Input the first number");
    int num1=sanju.nextInt();
    System.out.println("Input the 2nd number");
    int num2=sanju.nextInt();
    System.out.println("Input the 3rd number");
    int num3=sanju.nextInt();
    System.out.println("Input the 4th number");
    int num4=sanju.nextInt();
    System.out.println("Input the 5th number");
    int num5=sanju.nextInt();
    
  int sum=(num1+num2+num3+num4+num5);
  int avg=(sum/5);  
    System.out.println("The Average is: " + avg);
  }
}
