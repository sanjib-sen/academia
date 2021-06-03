package lab01;
import java.util.Scanner;
public class Lab06 {
    public static void main(String[] args) {
        Scanner sks=new Scanner(System.in);
        int count=sks.nextInt();
        int i=1;
        for (;i<=count;i++){
              for (int j=1;j<=count-i;j++){  
                System.out.print(" ");
                }
              for (int num=1;num<=2*i-1;num++){
                System.out.print(num);
              }
              System.out.println();
            }
        i-=2;
        for (;i>=0;i--){
            for (int j=1;j<=count-i;j++){  
                System.out.print(" ");
                }
              for (int num=1;num<=2*i-1;num++){
                System.out.print(num);
              }
              System.out.println();
             }
        }
    }