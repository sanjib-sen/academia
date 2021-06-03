import java.util.Scanner;
public class Task7{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   for (int i=0;i<10;i++){
    a[i]=sks.nextInt();
   }
   for (int p=9;p>=0;p--){ 
     if (a[p]%2==0){
      System.out.println(a[p]);
     p=-34;
     }
   }
  }
}