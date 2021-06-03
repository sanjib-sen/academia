import java.util.Scanner;

public class L03V2HARD4 {
    public static void main(String[] args) {
        Scanner sks=new Scanner (System.in);
        int num=sks.nextInt();
        String strng=sks.next();
        String lm="";
        for(int i=0;i<strng.length();i++) {
            lm+=Character.toString((strng.codePointAt(i))+num);
        }
        System.out.println(lm);
    }
}
