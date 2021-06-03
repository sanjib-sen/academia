import java.util.Scanner;
public class javaapplication1{
  public static void main(String []args){
  Scanner sks=new Scanner(System.in);
  int inp=sks.nextInt();
  int temp=inp;
  for (int i=-1;i<=inp*2-2;i+=2){
    for(int space=1;space<=temp-1;space++){
         System.out.print(" ");
    }
     for (int row=1;row<=i+2;row++){
     System.out.print("*");
     }
     System.out.println();
     temp-=1;
  } 
  }
}