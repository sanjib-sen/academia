 package lab02;
import java.util.Scanner;
public class Task03 {
  public static void main (String [] args){  
  Scanner sc=new Scanner (System.in);
  int a[]=new int[10];
  for (int i=0;i<a.length;i++){
   a[i]=sc.nextInt();  
  }
  for (int j=0;j<a.length;j++){
    for (int i=0;i<a.length-1;i++){
       if (a[i]>a[i+1]){
        int temp=a[i];
        a[i] = a[i+1];
        a[i+1]=temp;
       }
    }
  }
 for (int i=a.length-1;i>=0;i--){
     System.out.print(a[i]+" ");
 } 
  
}
}