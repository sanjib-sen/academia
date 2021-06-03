import java.util.Scanner;
public class Task20{
  public static void main(String []args){
  Scanner sks=new Scanner (System.in);
  int inp=sks.nextInt();
  String space=" ";
  int m=1;
  for (int i=1;i<=inp;i++,m+=2){
    int j=1;
    for (;j<=inp-i;j++){
     System.out.print(" ");
    }
    if (i==1){
    System.out.println("*");
    }
    else if (i==inp){
      for(int s=1;s<=m;s++){
       System.out.print("*");
      }
      System.out.println();
    }
    else {
    System.out.println("*"+space+"*");
      space+="  ";
    }
   }
  }
}