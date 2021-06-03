package lab01;
import java.util.Scanner;
public class Lab04 {
    public static void main(String[] args) {
        Scanner sks=new Scanner(System.in);
        int count=sks.nextInt();
        for (int i=1;i<=count;i++){
              for (int j=1;j<=count-i;j++){  
                System.out.print(" ");
                }
              for (int num=1;num<=i;num++){
                System.out.print(num);
              }
              System.out.println();
            }
        }
    }