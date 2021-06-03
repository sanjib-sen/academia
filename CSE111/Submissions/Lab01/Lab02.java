package lab01;
import java.util.Scanner;
public class Lab02 {
     public static void main(String[] args) {
        Scanner sks=new Scanner(System.in);
           int row=sks.nextInt();
           int col=sks.nextInt();
           for (int i=1;i<=row;i++){
             for (int j=1;j<=col;j++){
                 System.out.print(j);
             }
             System.out.println();
        }   
    }
}
