import matplotlib.pyplot as plt 
x_=[]
y_=[]
def printCirclePoint(x, y, a, b, x_, y_):
  x_ += [x+a,y+a,y+a,x+a,-x+a,-y+a,-y+a,-x+a]
  y_ += [y+b,x+b,-x+b,-y+b,-y+b,-x+b,x+b,y+b]
  
 
  print(x,y," = x`, y`")
  print(-x+a,-y+b,"x,y")
  print(-x,-y," = FDx, FDy")
  
 #CHANGE CONDITIONS ACCODRDING TO YOUR ZONE.
 
 
def MidPointCircle(r, a, b, x_, y_):
  d = 1 - r
  print(d, " = d")
  x = 0
  y = r
  printCirclePoint(x,y,a,b, x_, y_)
  print("  ......................  ")
  while x<y:
    if d<0:
      d = d+2*x+3
      x = x+1
    else:
      d = d+2*x-2*y+5
      x = x+1
      y = y-1
    print(d, " = d")
    printCirclePoint(x,y,a,b, x_, y_)
    print("......................  ")
 
MidPointCircle(15, 170, -108, x_, y_)
plt.scatter(x_,y_)
plt.show()