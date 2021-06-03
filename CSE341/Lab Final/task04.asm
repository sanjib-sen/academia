.MODEL SMALL

 
.STACK 100H

.DATA 
arr2	db	5	dup(?)

.CODE


 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here 

; Input
MOV CX, 5
MOV SI, 0
MOV AH, 1
    
START21:
INT 21H
MOV arr2[SI], AL
INC SI

LOOP START21

MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h

MOV BL, 4                  
first:
CMP BL, -1
JE end
DEC BL

MOV BH, 3
MOV SI, 0
MOV DI, 1

second:
CMP BH, -1
JE first
DEC BH


MOV AL, arr2[SI]
MOV AH, arr2[DI]

CMP AL,AH
JG change
JNG nochange

change:
MOV DL, arr2[SI]
MOV DH, arr2[DI]
MOV arr2[SI], DH
MOV arr2[DI], DL

INC SI
INC DI
JMP second

nochange:
INC SI
INC DI
JMP second

end: 
mov cx,5
mov ah,2
mov si,0
print:
mov dl,arr2[si]
int 21h
add si,1
loop print

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN



