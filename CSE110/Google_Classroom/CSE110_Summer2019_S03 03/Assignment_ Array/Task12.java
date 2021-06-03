import java.util.Scanner;
public class Task12{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   a[0]=sks.nextInt();
   int max=a[0];
   for (int i=1;i<10;i++){
    a[i]=sks.nextInt();
      if (a[i]>max){
    max=a[i];
    } 
   }
       System.out.println(max);
  }
}