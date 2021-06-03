import java.util.Scanner;
public class task15{
    public static void main (String args []){
        Scanner sks=new Scanner(System.in);
        System.out.println("Give a number");
        int n=sks.nextInt();
        int y=0;
        for(int q=1;q<=n;q++){
            if(q%2!=0){ 
            y=y+q*q*q;
            
            }else{
            y=-1*(y+q*q*q);
            }
        }
        System.out.println(y);
    }
}