import java.util.Scanner;
import java.lang.Math;

public class sanjibtask29
{
  public static void main(String []args) 
  {
   Scanner parker=new Scanner(System.in);
   System.out.println("Take X");
   int x=parker.nextInt();
   System.out.println("Take Y");
   int y=parker.nextInt();
   System.out.println("Take Z");
   int z=parker.nextInt();
   double s=(x+y+z)/2;
   double area =Math.sqrt(s*(s-x)*(s-y)*(s-z));
   System.out.println("The area is: " + area);
  }

}