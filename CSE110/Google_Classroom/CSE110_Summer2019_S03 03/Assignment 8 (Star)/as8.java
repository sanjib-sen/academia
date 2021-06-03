import java.util.Scanner;
public class as8{
  public static void main(String []args){
    Scanner maragechi=new Scanner(System.in);
    int input=maragechi.nextInt();
    String space=" ";
    int p=1;
    int alukhabo=input;
    for (int i=1;i<=input;i++){
      for (;p<=alukhabo-1;p++){
        System.out.print(" ");
      } for (int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
      p=1;alukhabo-=1;
    }
    
  }
}
