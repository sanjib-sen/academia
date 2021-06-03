import java.util.Scanner;

public class L03V2HARD3 {
    public static void main(String[] args) {
        Scanner sks=new Scanner (System.in);
        String strng=sks.nextLine();
        String lm="";
        for(int i=0;i<strng.length();i++){
            if (((int)strng.charAt(i))>=97){
                lm+=Character.toString((int)strng.charAt(i));
            }
          //  System.out.println(lm);
            if(((int)strng.charAt(i))<97) {
                lm+=Character.toString((int)strng.charAt(i));
                String newlm = L03V2.reverse(lm);
                System.out.print(newlm);
                lm = "";
            }
        }
        System.out.println();
    }
}
