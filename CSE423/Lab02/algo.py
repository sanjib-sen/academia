def find_zone(x1, y1, x2, y2):
    zone = 0
    dy = y2 - y1
    dx = x2 - x1
    if (abs(dx) > abs(dy)):
        if (dx >= 0 and dy >= 0):
            zone = 0
        elif (dx <= 0 and dy >= 0):
            zone = 3
        elif (dx <= 0 and dy <= 0):
            zone = 4
        elif (dx >= 0 and dy <= 0):
            zone = 7
    else:
        if (dx >= 0 and dy >= 0):
            zone = 1
        elif (dx <= 0 and dy >= 0):
            zone = 2
        elif (dx <= 0 and dy <= 0):
            zone = 5
        elif (dx >= 0 and dy <= 0):
            zone = 6
    return zone


def converted_zone_0(zone, X, Y):
    conv_dict = {1:[X,Y],
                2:[Y,-X],
                3:[-X,Y],
                4:[-X,-Y],
                5:[-Y,-X],
                6:[-Y,X],
                7:[X,-Y],
                8:[X,Y]
                }
    return conv_dict[zone]


def original_zone(zone, X, Y):
    conv_dict = {1:[Y,X],
                2:[-Y,X],
                3:[-X,Y],
                4:[-X,-Y],
                5:[-Y,-X],
                6:[Y,-X],
                7:[X,-Y],
                8:[X,Y]
                }
    return conv_dict[zone]


def midpoint_line(x1, y1, x2, y2):
    zone  = find_zone(x1, y1, x2, y2)
    converted_zone1 = converted_zone_0(zone, x1, y1)
    converted_zone2 = converted_zone_0(zone, x2, y2)

    x1 = converted_zone1[0]
    y1 = converted_zone1[1]
    x2 = converted_zone2[0]
    y2 = converted_zone2[1]

    dx = x2 - x1
    dy = y2 - y1
    d = 2 * dy - dx
    nE = 2 * (dy - dx)
    e = 2 * dy
    x = x1
    y = y1

    while (x <= x2):
        x+=1
        if (d <=0 ):
            d = d + e

        else:
            d = d + nE
            y+=1
        OriginalZone = original_zone(zone, x, y)
        print(OriginalZone[0], OriginalZone[1])


def draw():
    midpoint_line(-10, 31, -40, 31) #Upper Line
    midpoint_line(-10, -30, -10, 30) #Right Line
    midpoint_line(-10, 0, -40, 0) #Middle Line
    midpoint_line(-10, -30, -40, -30) #Lower Line
    midpoint_line(-41, 30, -41, -29) #Left Line

draw()