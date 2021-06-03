package lab03;
import java.util.*;
public class EasyTask03 {
    public static void main(String[] args) {
       Scanner sks=new Scanner(System.in);
       String get=sks.nextLine();
       int a[]=new int[get.length()];
       for(int i=0;i<get.length();i++){
          a[i]=(int)get.charAt(i)-1;
       }
            for (int i=0;i<get.length();i++){
         System.out.print((char)a[i]);
     }
        System.out.println();
    }
}    