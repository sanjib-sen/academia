import java.util.Scanner;
public class Task11{
  public static void main(String []args){
  Scanner sks=new Scanner(System.in);
  int inp=sks.nextInt();
  int temp=inp;
  for (int i=1;i<=inp;i++){
    for(int space=1;space<temp;space++){
         System.out.print(" ");
    }
     for (int row=temp;row<=inp;row++){
     System.out.print(row);
     }
     System.out.println();
     temp-=1;
  } 
  }
}