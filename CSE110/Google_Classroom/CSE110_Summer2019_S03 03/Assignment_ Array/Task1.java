import java.util.Scanner;
public class Task1{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[3];
   int sum=0;
   for (int i=0;i<3;i++){
    a[i]=sks.nextInt();
    sum+=a[i];
   }
   System.out.print(sum+",");
   System.out.print(a[0]+","+a[1]+","+a[2]+".");
  }
}