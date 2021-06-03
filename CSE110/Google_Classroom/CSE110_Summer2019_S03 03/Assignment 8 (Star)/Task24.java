import java.util.Scanner;
public class Task24{
  public static void main(String []args){
  Scanner sks=new Scanner (System.in);
  int inp=sks.nextInt();
  int m=inp;
  for(int i=1;i<=m;i++){
    System.out.print(i);
  }
  for(int i=m-1;i>0;i--){
    System.out.print(i);
  }
  System.out.println();
  }
}