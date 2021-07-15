from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *


def drawline(x, y):
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()


def DDA(x1, y1, x2, y2):
    difference_x = x2 - x1
    difference_y = y2 - y1
    total_steps = abs(max(difference_x, difference_y))
    step_x = difference_x / total_steps
    step_y = difference_y / total_steps
    a = x1
    b = y1
    for i in range(total_steps):
        drawline(round(a), round(b))
        a += step_x
        b += step_y


def Dashed_DDA(x1, y1, x2, y2):
    difference_x = x2 - x1
    difference_y = y2 - y1
    total_steps = abs(max(difference_x, difference_y))
    step_x = 5*(difference_x / total_steps)
    step_y = 5*(difference_y / total_steps)
    a = x1
    b = y1
    for i in range(int(total_steps/5)):
        drawline(round(a), round(b))
        a += step_x
        b += step_y


def drawH():
    DDA(200, 200, 200, 400)
    Dashed_DDA(300, 200, 300, 400)
    Dashed_DDA(200, 300, 300, 300)
    glFlush()



def myInit():
    glClearColor(255, 255, 0.0, 0.0)
    glPointSize(1.0)
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)

    
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
    drawH()
    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"Lab 01 Task 03: Building H for ID: 19301101")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()
