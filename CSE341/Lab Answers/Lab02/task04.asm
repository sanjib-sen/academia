.MODEL SMALL
 
.STACK 100H

.DATA 
prompt DB "Please insert a Character: $"
prompt2 DB 0AH,0DH,"Please insert an Uppercase Letter: $"
prompt3 DB 0AH,0DH,"The sum of the numbers is: $"
num DB 0H

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

LEA DX, prompt2
MOV AH, 9
INT 21H
MOV AH, 1
INT 21H

MOV BL,AL

MOV DL, 0AH
MOV AH, 2
INT 21H

ADD BL, 20H
LEA DL, BL
MOV AH, 2
INT 21H 

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 