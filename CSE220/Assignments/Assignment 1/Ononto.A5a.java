import java.util.Scanner;

public class OnontoA5a {

    static void printPattern(int n, int i,int j) 
    { 


        
        if (j>n) 
            return ;

          


     
        if (i <=j) 
        { 
            System.out.print ( ” " +i); 


              


            
            printPattern(n, i+1,j ); 

            
        }  


          

else
        { 


            
            System.out.println( ); 


              


          
            printPattern(n ,1,j+1); 
        } 
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n, 1, 1);

    }
}