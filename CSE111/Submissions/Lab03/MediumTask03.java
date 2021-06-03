package lab03;
import java.util.*;
public class MediumTask03 {
    public static void main(String[] args) {
       Scanner sks=new Scanner(System.in);
       String get=sks.nextLine();
       String get1=sks.nextLine();
       int a[]=new int[get.length()];
       for(int i=0;i<get.length();i++){
          a[i]=(int)get.charAt(i);
       }
       for (int i=0;i<get.length();i++){
         System.out.print((char)a[i]);
         }   
        System.out.print(" ");
       int b[]=new int[get1.length()];
       for(int i=0;i<get1.length();i++){
          b[i]=(int)get1.charAt(i);
       }
       for (int i=0;i<get1.length();i++){
         System.out.print((char)b[i]);
         }   
    }
}    