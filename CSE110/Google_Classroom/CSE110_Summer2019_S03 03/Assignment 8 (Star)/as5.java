import java.util.Scanner;
public class as5{
  public static void main(String []args){
   Scanner maragechi=new Scanner(System.in);
   int input=maragechi.nextInt();
   for (int i=1;i<=input;i++){
     for (int j=1;j<=i;j++) {
       System.out.printf("*");
     }
   System.out.printf("\n");
   }
  }
}
  