.MODEL SMALL


 
.STACK 100H

.DATA 
count DW 0D
mainc DW 0D
new DB 0AH,0DH,"$"

.CODE


printstar PROC
MOV count, CX
SUB count, 30H    
looping:
MOV DL, ' '
MOV AH, 2
INT 21H
DEC count
CMP count, 0
JNE looping

MOV mainc, 0D
star:
MOV DL, '*'
MOV AH, 2
INT 21H
INC mainc
CMP mainc, BX
JNE star

RET
printstar ENDP


 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

MOV AH, 1
INT 21H

MOV DL, AL
MOV DH, 0D
MOV CX, DX
MOV mainc, DX
MOV BX, 1
lines:

LEA DX, new
MOV AH, 09H
INT 21H
CALL printstar
DEC CX
INC BX
CMP CX, 30H
JNE lines



;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN



