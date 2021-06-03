.MODEL SMALL
 
.STACK 100H

.DATA 
prompt DB "Please insert a character.$"
.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

LEA DX, prompt
MOV AH, 9
INT 21H
MOV AH, 1
INT 21H
MOV DL,AL ;Input Goes to al
MOV ah,2  
INT 21h

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 