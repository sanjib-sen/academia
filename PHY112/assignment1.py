import math
q1 = -44
q2 = 41
q3 = 27
a = 20*math.pow(10,-9)
e = -1.60217662*math.pow(10,-19)

q1*=e
q2*=e
q3*=e



k = 8.987*math.pow(10,9)

r1 = a
r2 = a

print(a,e,k)
force_1  = ((k*q1*q3)/(math.pow(r1,3)))*(a/2) + ((k*q3*q2)/(math.pow(r1,3)))*(-a/2)
force_2  = ((k*q1*q3)/(math.pow(r1,3)))*((math.sqrt(3)*a)/2) + ((k*q3*q2)/(math.pow(r1,3)))*((math.sqrt(3)*a)/2)
print(force_1, force_2)