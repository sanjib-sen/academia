.MODEL SMALL
 
.STACK 100H

.DATA 
prompt db '**********',0DH,0AH,'$' 

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

LEA DX, prompt
MOV AH, 9
INT 21H
INT 21H
INT 21H
INT 21H
INT 21H
INT 21H
INT 21H
INT 21H
INT 21H
INT 21H

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 