package lab02;
import java.util.Scanner;
public class Task04 {
  public static void main (String [] args){  
  Scanner sc=new Scanner (System.in);
  int even=0;
  int [] num=new int[20];
  for (int i=0;i<num.length;i++){
    num[i]=sc.nextInt();
  }
  for (int j=num.length-1;j>=0;j--){
    if(num[j]%2==0){
    System.out.print(num[j]+" ");
     }
  }
}
}  