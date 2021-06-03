package lab01;
import java.util.Scanner;
public class Lab07 {
    public static void main(String[] args) {
        Scanner sks=new Scanner(System.in);
        int row=sks.nextInt();
        int col=sks.nextInt();
        
        int i=1;
        for (;i<=row;i++){
            if (i==1 || i==row){
             for (int j=1;j<=col;j++){
              System.out.print(j);
             }
             System.out.println();
            }
            else{ 
            System.out.print(1);
            for (int j=2;j<=col-1;j++){
            System.out.print(" ");
            }
            System.out.println(col);
            }
          }
        }
}