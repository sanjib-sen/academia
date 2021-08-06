class MIDPOINTLINE
{

    public static void main (String[] args)
    {
    int X1 = 26, Y1 =71, X2 = 79, Y2 = 10;
    midPoint(X1, Y1, X2, Y2);
    }
    //midPoint function for line generation
    static void midPoint(int X1, int Y1,
      int X2, int Y2)
    {
    // calculate dx & dy
    int dx = X2 - X1;
    int dy = Y2 - Y1;

    // initial value of decision
    // parameter d
    int d=2*dy-dx;
    int ie = 2*dy;
    int ine =2*(dy-dx);
    System.out.println("d init:"+d+"     incE:"+ie+"     inNE:"+ine);
    int x=X1,y=Y1;
    //System.out.print("x:"+x +",  y:" + y +"                d:"+d+ "\n");

    // iterate through value of X
    while (x <= X2)
    {

    // E or East is chosen
        if (d <=0){System.out.println("x:"+x +",  y:" + y +"                d:"+d+ "      E");
        d = d +ie;
        x++;
        }
    // NE or North East is chosen
    else
        {System.out.println("x:"+x +",  y:" + y +"                d:"+d+ "         NE");
        d += ine;
         x++;y++;
            }

        // Plot intermediate points
        // putpixel(x,y) is used to print
        // pixel of line in graphics

        }
    }



}