                                     .MODEL SMALL
 
.STACK 100H

.DATA 
prompt DB "Please insert a Number: $"
prompt2 DB 0AH,0DH,"Please insert another Number: $"
prompt3 DB 0AH,0DH,"The sum of the numbers is: $"
num DB 0H

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
MOV BL, AL

LEA DX, prompt2
MOV AH, 9
INT 21H 
MOV AH,1  
INT 21H
MOV BH, AL

ADD BH, BL
             
LEA DX, prompt3
MOV AH, 9
INT 21H

SUB BH, 030H
LEA DL, BH
MOV AH, 2
INT 21H


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 