.MODEL SMALL


 
.STACK 100H

.DATA 
NID	DB	8	dup(?)
newline DB 0AH,0DH,"$"

.CODE


print1 PROC
    
LEA DX, newline
MOV AH, 9
INT 21H
 
MOV SI, 0
printloop:
MOV DL, NID[SI]
ADD DL, 30H
MOV AH, 2
INT 21H
INC SI
CMP SI, 8
JNE printloop
RET

print1 ENDP


 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here  


MOV CX, 8
INPUT:
MOV AH, 1
INT 21H
SUB AX, 30H
PUSH AX
LOOP INPUT   

MOV SI, 7


COPY: 
POP DX
MOV NID[SI], DL
DEC SI 
CMP SI, -1D
JNE COPY

CALL print1

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN



