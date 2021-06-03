import java.util.Scanner;
public class Task11{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]= new int[10];
   a[0]=sks.nextInt();
   for (int i=1;i<10;i++){
    a[i]=sks.nextInt();
    for (int p=0;p<i;p++){
      if (a[i]==a[p]){
          System.out.print("Enter a different Number");
          System.out.println();
            i--;
      }
    } 
   }
       System.out.println();
  }
}