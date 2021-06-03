import java.util.Scanner;
public class task14{
    public static void main (String args []){
        Scanner sks=new Scanner(System.in);
        System.out.println("Give a number");
        int n=sks.nextInt();
        int y=0;
        for(int q=1;q<=n;q++){
            y=y+q*q*q;
            
        }
        System.out.println(y);
    }
}