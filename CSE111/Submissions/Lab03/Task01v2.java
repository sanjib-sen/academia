package lab03;
import java.util.*;
public class Task01v2 {
    public static void main(String[] args) {
       Scanner sks=new Scanner(System.in);
       int p=sks.nextInt();
       for(int s=1;s<=p;s++)
       {  
           String get=sks.next();
           System.out.println(get.length());
       }

    }
}
