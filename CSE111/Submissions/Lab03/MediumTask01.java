package lab03;
import java.util.*;
public class MediumTask01 {
    public static void main(String[] args) {
       Scanner sks=new Scanner(System.in);
       String get=sks.nextLine();
       int a[]=new int[get.length()];
       for(int i=0;i<get.length();i++){
          a[i]=(int)get.charAt(i);
       }
      for(int j=0;j<get.length();j++){   
       for (int i=0;i<=j;i++){
         System.out.print((char)a[i]);
       }
        System.out.println();
      }   
    }
}    