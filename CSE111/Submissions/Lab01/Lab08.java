package lab01;
import java.util.Scanner;
public class Lab08 {
    public static void main(String[] args) {
        Scanner sks=new Scanner(System.in);
        int num=sks.nextInt();
        int i=1;
        for (;i<=num;i++){
          System.out.print(1);

           if (i!=1 && i!=num){
            for (int j=1;j<=i-2;j++){
              System.out.print(" ");
              }
                System.out.print(i);}
           else if(i==num){
             for (int j=2;j<=num;j++){
             System.out.print(j);
             }
           }           
           System.out.println();
          }
        }
}