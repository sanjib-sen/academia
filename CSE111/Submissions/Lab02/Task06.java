package lab02;
import java.util.Scanner;
public class Task06 {
  public static void main (String [] args){  
  Scanner sc=new Scanner (System.in);
  int num=sc.nextInt();
  int sum=0;
   for (int i=1;i<=num;i++){
       if (i%2!=0){
         i=i*i;
       }
       else {
        i=-i*i;
       }
      sum+=i; 
  }
   System.out.println(sum);
  }
  }