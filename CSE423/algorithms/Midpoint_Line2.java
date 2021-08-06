// Java program for Mid-point
// line generation
class Midpoint_Line2
{
    // midPoint function for line generation
    static void midPoint(int X1, int Y1,
                         int X2, int Y2)
    {
        // calculate dx & dy
        int dx = X2 - X1;
        int dy = Y2 - Y1;

        // initial value of decision
        // parameter d
        int d = dy - (dx/2);
        int x = X1, y = Y1;

        // Plot initial given point
        // putpixel(x,y) can be used to
        // print pixel of line in graphics
        System.out.print(x +"," + y + "\n");

        // iterate through value of X
        int count1 = 0, count2 = 0;
        while (x < X2)
        {
            x++;

            // E or East is chosen
            if (d < 0) {

                d = d + dy;
                System.out.print(x + "," + y + "  E\n");
                count1++;
            }

                // NE or North East is chosen
            else
            {
                d += (dy - dx);
                y++;
                System.out.print(x +"," + y + "  NE\n");
                count2++;
            }

            // Plot intermediate points
            // putpixel(x,y) is used to print
            // pixel of line in graphics

        }

        System.out.println("Total E = " + count1);
        System.out.println("Total NE = " + count2);
    }

    // Driver code
    public static void main (String[] args)
    {
        int X1 = 28, Y1 = 14, X2 = 56, Y2 = 28;
        midPoint(X1, Y1, X2, Y2);
    }
}