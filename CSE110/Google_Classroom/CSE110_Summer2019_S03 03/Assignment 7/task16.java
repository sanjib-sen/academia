import java.util.Scanner;
public class task16{
    public static void main (String args []){
        Scanner sks=new Scanner(System.in);
        System.out.println("Give a number");
        int n=sks.nextInt();
        double y=1, m=2,p=3;
        for(int q=1;q<n;q++){
            y=y+m/p;
            m+=1;
            p+=2;
        }
        
        System.out.println(y);
    }
}