import java.util.Scanner;
public class Task23{
  public static void main(String []args){
  Scanner sks=new Scanner (System.in);
  int inp=sks.nextInt();
  String space=" ";
  String space2=" ";
  int m=1;
  for (int i=1;i<=inp;i++,m+=2){
    int j=1;
    for (;j<=inp-i;j++){
     System.out.print(" ");
    }
    if (i==1){
    System.out.println(1);
    }
    else {
    System.out.println(1+space+m);
      space+="  ";
    }
   }
   m-=4;
    for (int i=1;i<=inp-1;i++,m-=2,space2+=" "){
     System.out.print(space2);
     space="";
     for (int r=1;r<m-1;r++){
       space+=" ";
     }
     if (i!=inp-1){
      System.out.println(1+space+m);
     }
     else  {
     System.out.println(1);
     }
   }
  }
}