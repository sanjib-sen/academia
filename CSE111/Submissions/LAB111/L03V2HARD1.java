import java.util.Scanner;

public class L03V2HARD1 {
    public static void main(String[] args) {
        Scanner sks=new Scanner (System.in);
        String num=sks.nextLine(); int count=0;
        for (int i=0;i<num.length();i++){
            count+=Character.getNumericValue(i);
        }
        if (count%3==0){
            System.out.println("Divisible by 3");
        }
        else {
            System.out.println("Not divisible by 3");
        }
    }
}
