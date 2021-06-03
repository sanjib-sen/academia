import java.util.Scanner;
public class task17{
    public static void main (String args []){
        Scanner sks=new Scanner(System.in);
        int sum=0;
        for (int num=1;num<=600;num+=1){
            if (num%7==0){
                if (num%9==0){
                  sum+=num;
                }
            }
        }
        System.out.println(sum);
    }
}