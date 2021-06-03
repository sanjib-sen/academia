import math
a = 0.020
while a<=0.1:
    print("For 'r' = ",a, "log(r) = ",math.log(a,10))
    print("For 'r' = ",a, "1/r^2 = ",1/(a**2))
    a+=0.010

print("\nDone with Part 1. Making this friendly for Microsoft Word Table:\n" )
a = 0.020
print("log(r):\n")
while a<=0.1:
    print(math.log(a,10).__round__(3))
    a+=0.010

print("\n1/r^2\n")
a = 0.020
while a<=0.1:
    print((1/(a**2)).__round__(2))
    a+=0.010


print("Part 2: ")

lst = [ 641.968,
314.564 ,
139.806 ,
 78.641,
 50.330,
 34.952,
25.679,
19.660,
15.564,
12.583
]

lst2 = [366.839, 
179.751,
79.889, 
44.938, 
28.760, 
19.972,
14.674,
11.234,
8.877,
7.190]

for a in lst2:
    print("For 'Fe' = ",a, "log(Fe) = ",math.log(a,10))


print("\nDone with Part 1. Making this friendly for Microsoft Word Table:\n" )
for a in lst2:
    b = (math.log(a,10)).__round__(3)
    print(b)