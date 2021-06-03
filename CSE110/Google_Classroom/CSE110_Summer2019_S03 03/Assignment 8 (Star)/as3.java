import java.util.Scanner;
public class as3{
  public static void main(String []args){
   Scanner maragechi=new Scanner(System.in);
   int input=maragechi.nextInt();
   int input1=maragechi.nextInt();
   for (int i=1;i<=input;i++){
     for (int j=1;j<=input1;j++) {
       System.out.printf("*");
     }
   System.out.printf("\n");
   }
  }
}
  