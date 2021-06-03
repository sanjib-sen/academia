import java.util.Scanner;
public class Task3{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   for (int i=0;i<10;i++){
    a[i]=sks.nextInt();
   }
   for (int p=9;p>=1;p--){ 
   System.out.print(a[p]+",");
   }
   System.out.println(a[0]+".");
  }
}