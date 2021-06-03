.MODEL SMALL
 
.STACK 100H

.DATA 

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

MOV AX,13H
MOV BX,AX





;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 