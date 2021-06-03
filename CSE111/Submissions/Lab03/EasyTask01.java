package lab03;
import java.util.*;
public class EasyTask01 {
    public static void main(String[] args) {
       Scanner sks=new Scanner(System.in);
       String get=sks.nextLine();
       int a[]=new int[get.length()];
       for(int i=0;i<get.length();i++){
          a[i]=(int)get.charAt(i);
       }
       for (int i=0;i<a.length;i++){
        for (int j=0;j<a.length-1;j++){
          if (a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
       }
     for (int i=0;i<get.length();i++){
         System.out.print((char)a[i]);
     }
        System.out.println();
}
}    
