import java.util.Scanner;
public class Task2{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   for (int i=0;i<10;i++){
    a[i]=sks.nextInt();
   }
   int one=sks.nextInt();
   System.out.println(a[one]);
  }
}