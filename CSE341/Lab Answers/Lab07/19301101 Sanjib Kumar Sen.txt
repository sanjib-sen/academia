.MODEL SMALL
 
.STACK 100H

.DATA
count DW 0D
count2 DW 0D 
newline DB 0AH,0DH,"Please Enter the Length of the String: $"
newline1 DB 0AH,0DH,"Please Enter the String: $"    
newline2 DB 0AH,0DH,"Please Enter the number of the digits of the number: $"
newline3 DB 0AH,0DH,"Please Enter the Number: $" 
arr DW 10 dup(0)
new DB 0AH,0DH
uni DW "Unique$"
nouni DW "Not Unique$"
count4 DW 0D    
newline5 DB 0AH,0DH,"Please Enter String: $"
Boro DB 0
Borocount DB 1D        


.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here


;1.  Input a number. Find all the factors of that number and store them in stack.

MOV AH, 1
INT 21H
MOV AH, 0
SUB AL, 30H
MOV BL, AL

MOV BH, AL

looping:
MOV AX, 0  
MOV AL, BL
DIV BH

CMP AH, 0
JE fact
here:
DEC BH
CMP BH, 0
JNE looping
JMP ended

fact:
MOV DL, BH
MOV DH, 0
PUSH DX
INC count
JMP here


ended:

MOV DL, new
MOV AH,2
INT 21H

MOV CX, count
anoloop:
POP DX
ADD DL, 30H
MOV AH, 2
INT 21H
LOOP anoloop



;2. Input a string and reverse it using stack.

LEA DX, newline
MOV AH, 09H
INT 21H

MOV AH, 1
INT 21H
SUB AL, 30H
MOV AH, 0
MOV count, AX
MOV CX, AX 


LEA DX, newline1
MOV AH, 09H
INT 21H


MOV CX, count
input:
MOV AH,1
INT 21H
MOV AH, 0
PUSH AX
Loop input

MOV DL, new
MOV AH, 2
INT 21H

MOV CX, count
output:
POP DX
MOV AH,2
INT 21H
Loop output



;3. Input a number and check whether all the digits of that number are unique or not.




LEA DX, newline2
MOV AH, 09H
INT 21H

MOV AH, 1
INT 21H
SUB AL, 30H
MOV AH, 0
MOV count2, AX
MOV CX, AX 


LEA DX, newline3
MOV AH, 09H
INT 21H


MOV CX, count2
input1:
MOV AH,1
INT 21H
MOV AH, 0
PUSH AX
Loop input1

MOV DL, new
MOV AH, 2
INT 21H


MOV CX, count2
output1:
POP DX
MOV SI, DX
MOV BL, arr[SI]
CMP BL, 31H
JE nouniq
MOV arr[SI], 31H
loop output1

LEA DX, uni
MOV AH, 9
INT 21H  
JMP ended

nouniq:
LEA DX, nouni
MOV AH, 9
INT 21H

ended:


;4. Input a number. Starting from 1 to that number find all the prime numbers.


MOV AH, 1
INT 21H
MOV AH, 0
SUB AL, 30H

MOV Boro, AL

MOV DL, new
MOV AH, 2
INT 21H

boroloop:
MOV count, 0H
INC Borocount 
MOV BL, Borocount

MOV BH, BL

looping:
MOV AX, 0  
MOV AL, BL
DIV BH

CMP AH, 0
JE fact
here:
DEC BH
CMP BH, 0
JNE looping
JMP ended

fact:
MOV DL, BH
MOV DH, 0
INC count
JMP here


ended:

CMP count, 2H
JLE prime

MOV AH, Boro
CMP Borocount, AH
JNE boroloop
JMP ended2

prime:
MOV DL, BL
ADD DL, 30H
MOV AH, 2
INT 21H
MOV DL, ' '
MOV AH, 2
INT 21H

MOV AH, Boro
CMP Borocount, AH
JNE boroloop

ended2:


;5. Write a program that lets the user type some text, consisting of words separated by
;blanks, ending with a carriage return, and displays the text in the same word order as
;entered, but with the letters ·in each word reversed.


LEA DX, newline5
MOV AH, 09H
INT 21H

MOV count4, 0

input4:
INC count4
MOV AH,1
INT 21H
MOV AH, 0
CMP AL, 0DH
JE next
PUSH AX
JMP input4



next:


MOV DL, new
MOV AH, 2
INT 21H


MOV CX, count4
output4:
POP DX
MOV AH, 2
INT 21H
LOOP output4


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 