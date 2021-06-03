.MODEL SMALL
 
.STACK 100H

.DATA 

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

MOV AL,37H
MOV AH,32H
ADD AL,AH



;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 