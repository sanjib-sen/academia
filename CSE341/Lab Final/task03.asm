.MODEL SMALL

 
.STACK 100H

.DATA 
sum1 DB 0D
sum2 DB 0D
count DW 0D
newline DB 0AH,0DH,"Please Enter the Number of Digits of the Number: $"
newline1 DB 0AH,0DH,"Please Enter the Number: $"
prompt1 DB 0AH,0DH,'NO$'
prompt2 DB 0AH,0DH,'YES$'

.CODE


 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here 

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
input: 
MOV AH, 1
INT 21H
SUB AL, 30H
MOV AH, 0
PUSH AX 
Loop input


MOV BL, 1
MOV CX, count

Looping:

POP AX
ADD sum1, AL
MUL BL
ADD sum2, AL

MOV AL, BL
MOV BL, 10
MUL BL
MOV BL, AL

LOOP Looping

MOV AH, 0
MOV AL, sum2
MOV BL, sum1

DIV BL
CMP AH, 0
JE yes

LEA DX, prompt1
MOV AH, 9
INT 21H
JMP ended

yes:
LEA DX, prompt2
MOV AH, 9
INT 21H

ended:

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN



