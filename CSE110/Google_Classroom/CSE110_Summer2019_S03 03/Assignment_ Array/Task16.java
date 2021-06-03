import java.util.Scanner;
public class Task16{
  public static void main(String [] args) {
   Scanner sks=new Scanner(System.in);
   int a[]=new int[5];
   for (int b=0;b<5;b++){
   a[b]=sks.nextInt();
   }
   for (int j=0;j<4;j++){
     for (int i=0;i<4;i++){
         if(a[i]>a[i+1]){
         int tmp= a[i];
         a[i]=a[i+1];
         a[i+1]=tmp;
    }
   
    }        
   }
            for (int p=4;p>=0;p--){
         System.out.print(a[p]+" ");
         }
            System.out.println();
  }
}