package main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sks=new Scanner (System.in); 
      double a=sks.nextDouble();
      double b=sks.nextDouble();
      double c=sks.nextDouble();
      double d=sks.nextDouble();
      
     double avg=(a*2+b*3+c*4+d)/10;
     if (avg>=7.0){
      System.out.printf("Media: %.1f%nAluno aprovado.%n",avg);
     } 
    else if (avg>=5.0 && avg<=6.9){
        System.out.printf("Media: %.1f%nAluno em exame.",avg);
        double e=sks.nextDouble();
        avg=(avg+e)/2;
        if (avg>=5.0){
        System.out.printf("Nota do exame: %.1f%nAluno aprovado.%nMedia final: %.1f%n",e,avg);
        }
     }
    else if (avg<=5.0){
      System.out.printf("Media: %.1f%nAluno reprovado.%n",avg);
     }
            }
}
