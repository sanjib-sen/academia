import java.util.Scanner;
public class Task12remhalf {
  public static void main (String []args){
  Scanner sks=new Scanner(System.in);
  int inp=sks.nextInt();
  int tmp=inp,k=9;

    for (int j=k;j>=1;j-=2){
        for (int i=1;i<inp-1;i++){
      for (int m=1;m<=j;m++){
       System.out.print("*");
      }    System.out.println();
    }
    System.out.println();
  }
  }
}  