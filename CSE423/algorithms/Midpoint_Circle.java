public class Midpoint_Circle {

    public static void main(String[] args) {
        int Ecount = 0, SECount=0;
        // TODO Auto-generated method stub
        int x, y, d;

        //change here
        int radius= 237;


        //d = x^2 + y^2 -r^2
        //d = 1*1 + (radius-0.5)*(radius-0.5)-(radius*radius);
        d=1-radius;

        x = 0;

        y = 237;



        System.err.println("X"+"             Y"+"                d"+"               Pixel" + "               Count");

        //change here
       System.out.print((x)+"             "+(y)+"             "+d+"                                     ");


        int Start_Number = 0;
        while (x < y) {

            Start_Number++;
            System.out.print(Start_Number+"             ");

            if (d < 0) {

                //choose E
                System.out.println("             ");

                d = d + 2*x + 3;

                x = x + 1;

                //change here
                System.out.print((x)+"             "+(y)+"             "+d +"             E                       ");
                Ecount++;

            }

            else {

                //choose SE
                System.out.println("               ");
                d = d + (2*x)-(2*y)+5;

                x = x + 1;

                y = y - 1;

                //change here
                System.out.print((x)+"             "+(y)+"             "+d+"             SE                      ");
                SECount++;
            }

        }

        System.out.println("\nLast Pixel and Last Co-ordinates (x, y) will be discarded");
        System.out.println("Total SE: "+SECount+ " Total E: "+Ecount);
    }

}