package lab02;
import java.util.Scanner;
public class Task06v2 {
  public static void main (String [] args){  
  Scanner sc=new Scanner (System.in);
  int a[]={0,0,0,0,0,0,0,0,0,0};
  for (int i=1;i<=15;i++){
    int num=sc.nextInt();
     a[num]++;
  }
   for (int j=0;j<a.length;j++){
     if (a[j]!=0){
      System.out.println(j+" has appeared "+a[j]+" time(s)" );
     }
   }
  }
  

}