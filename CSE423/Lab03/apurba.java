import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

import javax.swing.JFrame;

public class Lab03 implements GLEventListener {

    private GLU glu;

    @Override
    public void display(GLAutoDrawable drawable) {

        final GL2 gl = drawable.getGL().getGL2();

        Midpoint_Circle(gl, 0, 0, 50);
        Midpoint_Circle(gl, 25, 0, 25);
        Midpoint_Circle(gl, -25, 0, 25);
        Midpoint_Circle(gl, 0, -25, 25);
        Midpoint_Circle(gl, 0, 25, 25);


    }

    @Override
    public void dispose(GLAutoDrawable arg0) {
        //method body
    }

    @Override
    public void init(GLAutoDrawable gld) {
        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glViewport(-100, -50, 50, 100);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-100.0, 100.0, -100.0, 100.0);
    }


    @Override
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
        // method body
    }


    public float[] convertToZone_M(float[] coordinate, int zone) {
        float X = coordinate[0];
        float Y = coordinate[1];
        float x;
        float y;
        float[] coordinate2 = new float[2];

        if (zone == 0) {
            x = Y;
            y = X;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;

        } else if (zone == 1) {
            x = X;
            y = Y;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;

        } else if (zone == 2) {
            x = -X;
            y = Y;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;

        } else if (zone == 3) {
            x = -Y;
            y = X;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;

        } else if (zone == 4) {
            x = -Y;
            y = -X;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;

        } else if (zone == 5) {
            x = -X;
            y = -Y;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;

        } else if (zone == 6) {
            x = X;
            y = -Y;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;


        } else if (zone == 7) {

            x = Y;
            y = -X;
            coordinate2[0] = x;
            coordinate2[1] = y;
            return coordinate2;

        }

        return coordinate2;
    }


    public void Midpoint_Circle(GL2 gl, float xCenter, float yCenter, float r) {

        gl.glPointSize(1.0f);
        gl.glColor3d(1, 0, 0);

        gl.glBegin(GL2.GL_POINTS);
        float x;
        float y;
        float x_1;
        float y_1;
        float d = 1 - r;
        float[] coordinate = new float[2];
        float[] coordinate_2 = new float[2];
        x = 0;
        y = r;
        gl.glVertex3f(x + xCenter, y + yCenter, 0);

        while (x < y) {

            if (d < 0) {
                d = d + (2 * x) + 3;
                x = x + 1;
            } else {
                d = d + (2 * x) - (2 * y) + 5;
                x = x + 1;
                y = y - 1;
            }

            coordinate[0] = x;
            coordinate[1] = y;

            coordinate_2 = convertToZone_M(coordinate, 0);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);

            coordinate_2 = convertToZone_M(coordinate, 1);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);

            coordinate_2 = convertToZone_M(coordinate, 2);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);

            coordinate_2 = convertToZone_M(coordinate, 3);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);

            coordinate_2 = convertToZone_M(coordinate, 4);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);

            coordinate_2 = convertToZone_M(coordinate, 5);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);

            coordinate_2 = convertToZone_M(coordinate, 6);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);

            coordinate_2 = convertToZone_M(coordinate, 7);
            x_1 = coordinate_2[0];
            y_1 = coordinate_2[1];
            gl.glVertex3f(x_1 + xCenter, y_1 + yCenter, 0);
        }
        gl.glEnd();
    }

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Lab03 l = new Lab03();
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame("ID: 19301086");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }//end of main
}//end of classimport javax.media.opengl.GL2;