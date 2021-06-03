import math

pie = 3.1416
e = -1.602 * 10 ** -19
k = 8.987 * 10 ** 9
e0 = 8.854 * 10 ** -12
uC = 10 ** -6
nC = 10 ** -9
mm = 10 ** -3
cm = 10 ** -2

def distance_2(x1, y1, x2, y2):
    return math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))

def distance_3(x1, y1, z1, x2, y2, z2):
    return math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2) + ((z2 - z1) ** 2))
def ln(num):
    return math.log(num, math.e)
def inverse(num):
    return 1 / num
