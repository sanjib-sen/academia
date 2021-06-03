import java.util.Scanner;
public class Task12 {
  public static void main (String []args){
  Scanner sks=new Scanner(System.in);
  int inp=sks.nextInt();
  int tmp=inp;
  int k=1;
  for (int i=-1;i<=inp*2-2;i+=2){
    for (int j=1;j<=tmp-1;j++){
    System.out.print(" ");
    }
    tmp-=1;
    for (;k<=i+2;k++){
    System.out.print("*");
    }
    System.out.println();
  }
  
  }
}