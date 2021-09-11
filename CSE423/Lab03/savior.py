from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

def draw_circle(x, y):
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()

def midPointCircleDraw(x_centre, y_centre, r):
    x = r
    y = 0

    draw_circle(x + x_centre, y + y_centre)


    if (r > 0):
        draw_circle(x + x_centre, -y + y_centre)
        draw_circle(y + x_centre, x + y_centre)
        draw_circle(-y + x_centre, x + y_centre)


    P = 1 - r

    while x > y:
        y += 1
        if P <= 0:
            P = P + 2 * y + 1


        else:
            x -= 1
            P = P + 2 * y - 2 * x + 1





        draw_circle(x + x_centre, y + y_centre)
        draw_circle(-x + x_centre, y + y_centre)
        draw_circle(x + x_centre, -y + y_centre)
        draw_circle(-x + x_centre, -y + y_centre)
        draw_circle(y + x_centre, x + y_centre)
        draw_circle(-y + x_centre, x + y_centre)
        draw_circle(y + x_centre, -x + y_centre)
        draw_circle(-y + x_centre, -x + y_centre)



def drawCircle():
    midPointCircleDraw(120,120, 100)
    midPointCircleDraw(170,120, 50)
    midPointCircleDraw(120,170, 50)
    midPointCircleDraw(70,120, 50)
    midPointCircleDraw(120,70, 50)


def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 0.0, 0.0)
    # call the draw methods here
    drawCircle()
    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()