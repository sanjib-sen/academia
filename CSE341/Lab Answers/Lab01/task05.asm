                               .MODEL SMALL
 
.STACK 100H

.DATA 


.CODE 
MAIN PROC 

; initialize DS
 
MOV DS,AX 
 
; enter your code here

ADD AH, 33H
ADD AL, 23H

ADD AL, AH
ADD DL, AL
SUB DL, AH
SUB AL, DL
ADD DH, AL
SUB DH, DL
SUB AH, DH
;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN
