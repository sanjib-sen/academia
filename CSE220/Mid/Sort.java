import java.util.Scanner;
public class Sort{
    public static void main(String []args){
    int a[] ={1 ,7, 5 ,2, 3, 4, 5 , 2 , 4, 4};
    int b = max(a);
        System.out.println(b);
    }


    public static int max (int[]a){
        for (int i = 0;i < a.length; i++){
            for (int j = 0; j<a.length-i-1; j++){
                int temp =0;
                if (a[j+1]>a[j]){
                     temp= a[j+1];
                    a[j+1]=a[j];
                    a[j] =temp;
                }
            }
        }
        int max =a[1];
        int i=0;
            while (a[i]==a[i+1]){
                i++;
            continue;
        }
        max =i+3;
        return max;
    }
}