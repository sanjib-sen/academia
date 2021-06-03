import java.util.Scanner;
public class Tas18 {

    public static void main(String []args){
  Scanner sks=new Scanner(System.in);
  int a []=new int [15];
  int c []=new int [10];
  for (int in=0;in<a.length; in++){
   a[in]=sks.nextInt();
  } 
  for (int in=0;in<a.length;in++){
    for (int b=0;b<=9;b++){
      if (b==a[in]){
       c[b]+=1;
      }
    }
  }
  for (int p=0;p<c.length;){
    System.out.print(c[p]+" ");
  } 
    }
    
}
