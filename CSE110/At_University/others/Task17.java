/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author 19301101
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sks=new Scanner(System.in);
  int x=sks.nextInt();
  int a[]=new int [x];
  for (int i=0;i<a.length;i++){
   a[i]=sks.nextInt();
  }
  for (int p=0;p<a.length-1;p++){
    for (int s=0;s<a.length-1;s++){
      if (a[s]>a[s+1]){
       int temp=a[s];
       a[s]=a[s+1];
       a[s+1]=temp;
      }
    }
  }
  for (int e=0;e<x;e++){
  System.out.print(a[e]+" ");
  }
  System.out.println();
  
  if (a.length%2==0){
    int m1=(a.length/2);
    int m2=m1+1;
    double med=(a[m1-1]+a[m2-1])/2;
    System.out.println(med);
  } 
  
  else if (a.length%2!=0) {
    int m=(a.length+1)/2;
     System.out.println(a[m-1]);
  }
    }
    
}
