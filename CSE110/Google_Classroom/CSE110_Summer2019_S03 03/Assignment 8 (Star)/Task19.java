import java.util.Scanner;
public class Task19{
  public static void main(String []args){
  Scanner sks=new Scanner (System.in);
  int inp=sks.nextInt();
  String space="";
  String space2="";
  for (int i=1;i<=inp;i++){
    int j=1;
    for (;j<=inp-i;j++){
     System.out.print(" ");
    }
    if (i==1){
    System.out.println(inp);
    }
    else if (i==inp){
      for(int s=1;s<=inp;s++){
       System.out.print(s);
      }
      System.out.println();
    }
    else {
    System.out.println(j+space+inp);
      space+=" ";
    }
   }
  }
}