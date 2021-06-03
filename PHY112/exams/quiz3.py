import math

pie = 3.1416
e = -1.602 * 10 ** -19
k = 8.987 * 10 ** 9
e0 = 8.854 * 10 ** -12
u = 10 ** -6
n = 10 ** -9
mm = 10 ** -3
cm = 10 ** -2

def ln(num):
    return math.log(num, math.e)


#Potential of surface of a solid conducting sphere :
def potential_sphere(Q, r):
    V = Q / (4 * pie * e0 * r)
    return V

#Capacitance of a solid conducting sphere :
def capacitance_sphere(Q, V): # Here V = Potential of surface of a solid conducting sphere; potential_sphere_method.
    C = Q/V
    return C

# formula for parallel plate capacitor.Where the Area, length and permittivity is given by  A,d,ϵ  respectively
def parallel_plate_capacitor(A, d):
    C = e0*(A/d)
    return C

# Two long coaxial hollow cylinder of radius  a and b with  b>a  with charge density λ.

# Magnitude of the Electric field at  r:
def magnitude_cylinder(lamb, r):
    E = lamb/(2*pie*e0*r)
    return E

#Find the absolute value of the potential difference between the cylinders
def pot_def_cylinder(a, b, lamb):
    dV = -(lamb*ln(b/a))/(2*pie*e0)
    return dV

#Find the capacitance of the system with length  L
def cap_cylinder(a,b,L):
    C = (2*pie*e0*L)/ln(b/a)
    return C

#energy density of a capacitor
def energy_density_capacitor(E):
    u = ((E**2)*e0)/2
    return u


print(energy_density_capacitor(3))
