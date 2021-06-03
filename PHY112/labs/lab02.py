def calculate_I(R, V):
    I = (V/R)
    I*=1000
    I = round(I, 1)

    print("For V:", float(V), "and R:", R, "; I=", I)
    #print(I)

def doLab02():
    print("Ques 01: \n\n")
    R = 290
    for V in range(1,10):
        calculate_I(R,V)

    print("\n\n Ques 02: \n\n")

    R = 535
    for V in range(1,10):
        calculate_I(R,V)

    print("\n\n Ques 03: \n\n")

    V = 3.4
    for R in range(100,1100, 100):
        calculate_I(R,V)