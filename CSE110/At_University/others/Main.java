import java.util.Scanner;
public class Main{
  public static void main(String []args){
  Scanner sks=new Scanner(System.in);
  int inp=sks.nextInt();
  String [] a=new String[inp];
  String space="";
  for(int i=0;i<a.length;i++){
    String str="";
  
    if (i==0||i==a.length-1){
      for (int j=1;j<a.length-i;j++){
    str+="_";
    }
    for (int j=1;j<=inp;j++){
      str+="*";
    }
    }
    else{
       for (int j=1;j<a.length-i;j++){
    str+="_";
       }
     str+="*";
         for (int j=1;j<=a.length-2;j++){
    str+="_";
       }
    str+="*";
    }
   str+=space;
   a[i]=str;
   space+="_";
  }
  
  for (int k=0;k<a.length;k++){
   System.out.println(a[k]);
  }
  }
}