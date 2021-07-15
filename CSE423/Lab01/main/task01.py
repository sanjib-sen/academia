from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
from random import randint


def drawpoint(x, y):
    glPointSize(5.0)
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()

def drawpoints():
    for _ in range(50):
        drawpoint(randint(10,490),randint(10,490))
    glFlush()

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
    drawpoints()
    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"Lab01 Task01: 50 Random points")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()
