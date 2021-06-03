import java.util.Scanner;
public class Task9{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   int count=0;
   for (int i=0;i<10;i++){
    a[i]=sks.nextInt();
   }
   int one=sks.nextInt();
   for (int p=0;p<=9;p++){ 
     if (a[p]==one){
      count=1;
     p=34;
     }
     }
   if (count==1){
     System.out.println("Yes");}
   else{ 
     System.out.println("No");
     }
  }
}