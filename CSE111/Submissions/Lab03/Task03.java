package lab03;
import java.util.*;
public class Task03 {
    public static void main(String[] args) {
       Scanner sks=new Scanner(System.in);
       String get=sks.nextLine();
       int b=get.length();
      // char a[]=new char [b];
       for (int i=0;i<get.length();i++){
       //    a[i]=get.charAt(i);
           System.out.println(get.charAt(i)+" : "+(get.codePointAt(i)));
       }
    }
}
