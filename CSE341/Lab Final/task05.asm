.MODEL SMALL

 
.STACK 100H

.DATA 
count DW 0D
newline DB 0AH,0DH,"Please Enter the Length of the String: $"
newline1 DB 0AH,0DH,"Please Enter the String: $"
new DB 0AH,0DH,"$"

.CODE

vowelproc PROC
INC BL
RET
vowelproc ENDP

 
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

MOV BL, 0

MOV CX, count
input: 
MOV AH, 1
INT 21H
CMP AL, 'a'
JE vowel
CMP AL, 'e'
JE vowel
CMP AL, 'i'
JE vowel
CMP AL, 'o'
JE vowel
CMP AL, 'u'
JE vowel
back: 
Loop input
JMP next

vowel:
CALL vowelproc
JMP back

next:

LEA DX, new
MOV AH, 9
INT 21H

MOV BH, 0
SUB count, BX
MOV DX, count
ADD DX, 30H 
MOV AH, 2
INT 21H

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN



