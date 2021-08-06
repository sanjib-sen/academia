import java.util.Scanner;
public class DDAQuiz {

     public static void DDA( float x1, float y1, float x2, float y2, int p) {
          
          float xVar= 0;
          float yVar = 0;
          float dx = x2-x1;
          float dy = y2-y1;
          float m = dy/dx;
          System.out.println("Slope : " +m);
          m =Math.abs(m);
          int endpoint;
          if( m <1 || m==1 ) {
               endpoint = Math.round(Math.abs(dx)); 
               if(dx>0) {
                    xVar = 1;
               }
               else {
                    xVar = -1;
               }
               if(dy>0) {
                    yVar =m;
               }
               else {
                    yVar = -1*m;
               }
               
          }
          else{
               endpoint = Math.round(Math.abs(dy));
               if(dx<0) {
                    xVar = -1*(1/m);
               }
               else {
                    
                    xVar = (1/m);
               }
               if(dy<0) {
                    yVar = -1;
               }
               else {
                    yVar = 1;
               }
          }
          
          for(int i=1; i<=endpoint; i++) {
               p=p+1;
               x1 = x1+xVar;
               y1 = y1+yVar;
               System.out.print("Cordinates are : ");
               System.out.print(x1);
               System.out.println(" "+y1);
          }
           System.out.println("total point "+p);
     }
     
     
     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          //DDA(178,60,94,156);
          System.out.print(" Enter Cordinates of x1 : ");
          int x_1=sc.nextInt();
          System.out.print(" Enter Cordinates of y1 : ");
          int y_1=sc.nextInt();
          System.out.print(" Enter Cordinates of x2 : ");
          int x_2=sc.nextInt();
          System.out.print(" Enter Cordinates of y2 : ");
          int y_2=sc.nextInt();
          int point = 0;
          DDA(x_1,y_1,x_2,y_2,point);
         
     }
}