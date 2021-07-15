from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
from random import randint
from math import sqrt

def drawtriangles(x1, x2, y1, y2, z1, z2):
    glBegin(GL_TRIANGLES)
    glVertex2f(x1, x2)
    glVertex2f(y1, y2)
    glVertex2f(z1, z2)
    glEnd()

def drawbox(x1, y1, x2, y2):
    glBegin(GL_LINES)
    glVertex2f(x1, y1)
    glVertex2f(x1, y2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(x1, y1)
    glVertex2f(x2, y1)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(x2, y2)
    glVertex2f(x2, y1)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(x2, y2)
    glVertex2f(x1, y2)
    glEnd()

def drawpoints(x, y):
    glPointSize(5.0)
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()

def drawhouse():
    drawtriangles(10, 350, 100, 490, 490, 350) #roof
    drawbox(10,10, 490, 350) # main house
    drawbox(20, 10, 100, 300) # door
    drawbox(120, 100, 250, 250) # window 1
    drawbox(280, 100, 450, 250) # window 2
    drawpoints(85, 120) # doorknob
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
    drawhouse()
    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"Lab 01 Task 02: Building House")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()
