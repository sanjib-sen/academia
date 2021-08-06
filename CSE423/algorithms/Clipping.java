public class Clipping {

    static void CalculateOutcode(int x, int y) {
        int x_min = 43;
        int x_max = 362;
        int y_min = 0;
        int y_max = 766;
        int bit0;
        int bit1;
        int bit2;
        int bit3;
        if (x < x_min) {
            bit0 = 1;
        } else {
            bit0 = 0;
        }
        if (x > x_max) {
            bit1 = 1;
        } else {
            bit1 = 0;
        }
        if (y < y_min) {
            bit2 = 1;
        } else {
            bit2 = 0;
        }
        if (y > y_max) {
            bit3 = 1;
        } else {
            bit3 = 0;
        }
        System.out.print(bit3);
        System.out.print(bit2);
        System.out.print(bit1);
        System.out.print(bit0);
        System.out.println();

    }

    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        CalculateOutcode(-157, 277);
        CalculateOutcode(210, 308);

    }
}
public class CyrusBeck {

    static void Calculate(double x0, double y0, double x1, double y1) {
        double x_min = 0;
        double x_max = 300;
        double y_min = 0;
        double y_max = 200;
        double P1 = x1 - x0;
        double P0 = y1 - y0;
        double a = x0 - x_max;
        double Ni_x ;
        double Ni_y;
        Ni_x = -1;
        Ni_y = 0;
        int tE, tL;
        if (P1 == P0) {
            System.out.println("It is a point");
        } else {
            tE = 0;
            tL = 1;
        }
        System.out.println("Ni=(" + Ni_x + "," + Ni_y + ")");
        double Ni_D = 0;
        //if(Left)


       Ni_D = (Ni_x * P1) + (Ni_y * P0);
       if (Ni_D < 0) {
            System.out.println("PE");

        } else {
            System.out.println("PL");
        }
        System.out.println("Value of Ni.D is: " + Ni_D);
        double NLeft,NRight, NTop, NBottom;

        NLeft = (-(x0 - x_min)) / (x1 - x0);
        NRight = (-(x0 - x_max)) / (x1 - x0);
        NTop = (-(y0 - y_max)) / (y1 - y0);
        NBottom = (-(y0 - y_min)) / (y1 - y0);
        if (Ni_D != 0) {
            System.out.println("Left: "+NLeft);
            System.out.println("Right: "+NRight);
            System.out.println("Bottom: "+NBottom);
            System.out.println("Top: "+NTop);
        }

        if (Ni_D < 0) {
            System.out.println("PE");

        } else {
            System.out.println("PL");
        }

    }

    public static void main(String[] args) {
        Calculate(50, -125, -100, 225);
    }
}