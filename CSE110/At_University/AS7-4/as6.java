import java.util.Scanner;
public class as6{
  public static void main(String []args){
   Scanner maragechi=new Scanner(System.in);
   int input=maragechi.nextInt();
   for (int i=1;i<=input;i++){
     for (int j=1;j<=i;j++) {
       System.out.printf("%d",j);
     }
   System.out.printf("\n");
   }
  }
}
  