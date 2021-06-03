                                     .MODEL SMALL
 
.STACK 100H

.DATA 
prompt4 DB "Please insert a Character: $"
prompt5 DB 0AH,0DH,"Please insert an Uppercase Letter: $"
num DB 0H

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here
             
; (a)             
LEA DX, prompt4
MOV AH, 9
INT 21H
MOV AH, 1
INT 21H

LEA DL, AL
MOV AH, 2
INT 21H

SUB AX,AX
SUB DX,DX

; (b)

LEA DX, prompt5
MOV AH, 9
INT 21H
MOV AH, 1
INT 21H

ADD AL, 20H
LEA DL, AL
MOV AH, 2
INT 21H 

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 