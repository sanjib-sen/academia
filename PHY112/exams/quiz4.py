import math

pie = 3.1416
e = -1.602 * 10 ** -19
k = 8.987 * 10 ** 9
e0 = 8.854 * 10 ** -12
umicro = 10 ** -6
nano = 10 ** -9
milli = 10 ** -3
centi = 10 ** -2

mUnot = (12.566370614356 * 10 ** -7)

def magnitude(x, y, z):
    return math.sqrt((x ** 2) + (y ** 2) + (z ** 2))

def ln(num):
    return math.log(num, math.e)


def radius_R(m, v, q, B):
    return (m * v) / (q * B)


def angular_frequency_w(V, R):
    return V / R

def magnetic_field_at_position_r(q, vxr_component, r, magnitude_r):
    return (mUnot*q*vxr_component)/(4*pie*magnitude_r**3)


print((mUnot*42*milli)/(2*pie*2.828427))