import java.util.Scanner;
public class sanjibtask24 {
  public static void main (String[]args ){
  System.out.println("Enter a number:");
  Scanner bolod=new Scanner (System.in);
  Double num1=bolod.nextDouble();
  System.out.println("Enter an operator:");
  char op=bolod.next().charAt(0);
  System.out.println("Enter another number:");
  double num2=bolod.nextDouble();
  switch (op){
    case '+': 
   {System.out.println(num1+num2);}
   break;
    case '-':
    {System.out.println(num1-num2);} 
    break;
    case '*':   
    {System.out.println(num1*num2);}
   break;
    case '/':
   {System.out.println(num1/num2);}
   break;
    
      
  }
  }
}