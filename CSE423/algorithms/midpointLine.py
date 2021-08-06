import matplotlib.pyplot as plt
def zoneFinder(dx, dy):
  #print(dx, dy)
  if dx>=0 and dy>=0:
    if abs(dx)>=abs(dy):
      return 0
    else:
      return 1
  if dx<=0 and dy>=0:
    if abs(dx)>=abs(dy):
      return 3
    else:
      return 2
  if dx<=0 and dy<=0:
    if abs(dx)>=abs(dy):
      return 4
    else:
      return 5
  if dx>=0 and dy<=0:
    if abs(dx)>=abs(dy):
      return 7
    else:
      return 6
def convertToZone0(x1,y1,x2,y2,zone):
  if zone == 0:
    return x1, y1, x2, y2
  elif zone == 1:
    return y1, x1, y2, x2
  elif zone == 2:
    return y1, -x1, y2, -x2
  elif zone == 3:
    return -x1, y1, -x2, y2
  elif zone == 4:
    return -x1, -y1, -x2, -y2
  elif zone == 5:
    return -y1, -x1, -y2, -x2
  elif zone == 6:
    return -y1, x1, -y2, x2
  elif zone == 7:
    return x1, -y1, x2, -y2
  return x1,y1,x2,y2
def originalZone(x, y, zone):
  if zone == 0:
    return x, y
  if zone == 1:
    return y, x
  if zone == 2:
    return -y, x
  if zone == 3:
    return -x, y
  if zone == 4:
    return -x, -y
  if zone == 5:
    return -y, -x
  if zone == 6:
    return y, -x
  if zone == 7:
    return x, -y
def printPoint(x, y):
  print(x,y,"zone 0")
  print(y,x,"zone 1")
  print(-y,x,"zone 2")
  print(-x,y,"zone 3")
  print(-x,-y,"zone 4")
  print(-y,-x,"zone 5")
  print(y,-x,"zone 6")
  print(x,-y,"zone 7")
def midPointLine(x1,y1,x2,y2):
  dx = x2-x1
  dy = y2-y1
  # print (dx, dy)
  zone = zoneFinder(dx,dy) #comment out this line for not considering 8 way symmetry
  print("Zone = ",zone)
  # print(x1,y1,x2,y2)
  x1, y1, x2, y2 = convertToZone0(x1,y1,x2,y2,zone)  #comment out this line for not considering 8 way symmetry
  print("value after converting to zone 0", x1,y1,x2,y2)
  x_=[]
  y_=[]
  x0_=[]
  y0_=[]
  D_=[]
  dx = x2-x1
  dy = y2-y1
  D = 2*dy-dx
  print("D =",D)
  D_ += [D]
  dNE = 2*(dy-dx)
  print("dNE =",dNE)
  dE = 2*dy
  print("dE =",dE)
  x = x1
  y = y1
  while x<=x2:
    a = x
    b = y
    x0_+=[x]
    y0_+=[y] 
    # printPoint(a,b) # NEWS!!! tor zone bair korar method. Ek kaam kor. arekta notebook khuila edit kor. eikhane edit korte jhamela hoite pare :3 
    a,b = originalZone(a, b, zone)  #comment out this line for not considering 8 way symmetry
    x_+=[a]
    y_+=[b]
    x = x+1
    if D>0:
      y = y+1
      D = D + dNE
    else:
      D = D + dE
    D_ += [D]
 
  plt.scatter(x_,y_)
  plt.show()
  print("(x', y') \t D \t (x , y)")
  for a, b, d, p, q in zip(x0_, y0_, D_, x_, y_):
    print("(",a,",",b,") \t",d,"\t (",p,",",q,")" )
 
 
midPointLine(10,5,20,10)