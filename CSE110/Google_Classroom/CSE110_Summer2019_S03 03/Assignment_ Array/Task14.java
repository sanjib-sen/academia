import java.util.Scanner;
public class Task14{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   a[0]=sks.nextInt();
   int max=a[0],min=a[0],locmax=0,locmin=0;
   for (int i=1;i<10;i++){
    a[i]=sks.nextInt();
      if (a[i]>max){
    max=a[i];
     locmax=i;
    }
      if (a[i]<min) {
      min=a[i];
      locmin=i;
      }
   }   
       System.out.println("Smallest number "+min+" was found at location "+locmin);
       System.out.println("Largest number "+max+" was found at location "+locmax);
  }
}