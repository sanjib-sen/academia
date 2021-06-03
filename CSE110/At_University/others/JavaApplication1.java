import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
    Scanner sks=new Scanner(System.in);
    int sum=0;
    for (int i=1;i<=20;i++){
    int num=sks.nextInt();
    sum+=num;
    System.out.print(sum+",");
    }
    }
    
}
