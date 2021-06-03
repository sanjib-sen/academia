import java.util.Scanner;
public class Task25 {
  public static void main(String []args){
  Scanner sks=new Scanner (System.in);
  int inp=sks.nextInt();
  int m=1;
  for (int i=1;i<=inp;i++,m+=1){
    int j=1;
    for (;j<=inp-i;j++){
     System.out.print(" ");
    }
   for(int t=1;t<=m;t++){
   System.out.print(t);
  }
   for(int t=m-1;t>0;t--){
   System.out.print(t);
  }
  System.out.println();
   }
  }
}