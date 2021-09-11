from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *


def convertToZone_M(coordinate, zone):
    X = coordinate[0]
    Y = coordinate[1]

    if (zone == 0):
        x = Y
        y = X
        coordinate2 = [x,y]
        return coordinate2

    elif (zone == 1):
        x = X
        y = Y
        coordinate2 = [x,y]
        return coordinate2

    elif (zone == 2):
        x = -X
        y = Y
        coordinate2 = [x,y]
        return coordinate2

    elif (zone == 3):
        x = -Y
        y = X
        coordinate2 = [x,y]
        return coordinate2

    elif (zone == 4):
        x = -Y
        y = -X
        coordinate2 = [x,y]
        return coordinate2

    elif(zone == 5):
        x = -X
        y = -Y
        coordinate2 = [x,y]
        return coordinate2

    elif (zone == 6):
        x = X
        y = -Y
        coordinate2 = [x,y]
        return coordinate2


    elif (zone == 7):

        x = Y
        y = -X
        coordinate2 = [x,y]
        return coordinate2
    return None


def midPointCircleDraw(xCenter,  yCenter,  r):
    glBegin(GL_POINTS)
    d = 1 - r
    coordinate = []
    coordinate_2 = []
    x = 0
    y = r
    glVertex3f(x + xCenter, y + yCenter, 0)
    while (x < y):
        if (d < 0):
            d += (2 * x) + 3
            x += 1
        else:
            d += (2 * x) - (2 * y) + 5
            x += 1
            y -= 1

        coordinate = [x,y]

        coordinate_2 = convertToZone_M(coordinate, 0)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)

        coordinate_2 = convertToZone_M(coordinate, 1)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)

        coordinate_2 = convertToZone_M(coordinate, 2)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)

        coordinate_2 = convertToZone_M(coordinate, 3)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)

        coordinate_2 = convertToZone_M(coordinate, 4)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)

        coordinate_2 = convertToZone_M(coordinate, 5)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)

        coordinate_2 = convertToZone_M(coordinate, 6)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)

        coordinate_2 = convertToZone_M(coordinate, 7)
        x_1 = coordinate_2[0]
        y_1 = coordinate_2[1]
        glVertex3f(x_1 + xCenter, y_1 + yCenter, 0)
    glEnd()






    



def draw():
    midPointCircleDraw(120,120, 100)
    midPointCircleDraw(170,120, 50)
    midPointCircleDraw(120,170, 50)
    midPointCircleDraw(70,120, 50)
    midPointCircleDraw(120,70, 50)
    glFlush()



    
def iterate():
    glViewport(50, 100, 500, 500)
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
    draw()
    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"Lab 03: Drawing Figure for ID: 19301101")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()

