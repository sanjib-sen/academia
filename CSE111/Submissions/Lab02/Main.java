import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sks=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Which positioned numbers you want to sort?Even, Odd or All?");
        String s=sks.nextLine();
        for (int i=0;i<a.length;i++){
            a[i]=sks.nextInt();
        }
        int p=0,j=0,k=0,m=0;
         if (s.equals("Even")) {
             k = 1;
             p = 5;
             m = 1;
         }
        else if (s.equals("Odd")) {
             k = 0;
             p = 5;
             m = 1;
         }
        else if(s.equals("All")) {
            m = 2;
            p=10;
        }
        int e[] = new int[p];
        if (m==1) {
           for (; j < e.length; j++, k += 2) {
               e[j] = a[k];
           }
        }
        else if(m==2){
            for(int x=0;x<e.length;x++){
                e[x]=a[x];
            }
        }
        for (int i=0;i<e.length;i++){
            for (int r=0;r<e.length-1;r++){
                if (e[r]<e[r+1]){
                    int temp= e[r];
                    e[r]=e[r+1];
                    e[r+1]=temp;
                }
            }
        }
        p=0;j=0;k=0;m=0;
        if (s.equals("Even")) {
            k = 1;
            m = 1;
        }
        else if (s.equals("Odd")) {
            k = 0;
            m = 1;
        }
        else if(s.equals("All")) {
            m = 2;
        }
        if(m==1) {
            for (; j < e.length; j++, k += 2) {
                a[k] = e[j];
            }
        }
        else if(m==2){
            for(int x=0;x<e.length;x++){
                a[x]=e[x];
            }
        }
        for (int w=0;w<a.length;w++){
            System.out.print(a[w]+" ");
        }
    }
}