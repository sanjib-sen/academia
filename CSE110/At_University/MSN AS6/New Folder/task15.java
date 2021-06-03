import java.util.Scanner;
public class task16{
    public static void main (String args []){
        Scanner sks=new Scanner(System.in);
        System.out.println("Give a number");
        int n=sks.nextInt();
        int y=1, m=2,n=3;
        for(int q=1;q<=n;q++){
            y=y+m/n;
            m+=1;
            n+=2;
        }
        
        System.out.println(y);
    }
}