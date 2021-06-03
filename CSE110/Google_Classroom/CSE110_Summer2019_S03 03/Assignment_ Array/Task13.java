import java.util.Scanner;
public class Task13{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   a[0]=sks.nextInt();
   int max=a[0],loc=0;
   for (int i=1;i<10;i++){
    a[i]=sks.nextInt();
      if (a[i]>max){
    max=a[i];
     loc=i;
    } 
   }
       System.out.println("largest number "+max+" was found at location "+loc);
  }
}