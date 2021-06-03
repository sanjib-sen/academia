package lab03;
import java.util.*;
public class Task04 {
    public static void main(String[] args) {
       Scanner sks=new Scanner(System.in);
       String get=sks.nextLine();
       int b[]=new int[255];
       for(int i=0;i<get.length();i++){
          b[((int)get.charAt(i))-65]++;  
       }
       for(int j=0,k=65;j<=26;j++,k++){
        System.out.println((char)k+" which is "+k+" was found "+(b[j])+" times");
       }
}
}    
