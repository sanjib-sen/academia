                                                                 .MODEL SMALL
 
.STACK 100H

.DATA 


.CODE 
MAIN PROC 

; initialize DS
 
MOV DS,AX 
 
; enter your code here


; (Left Portion) ADD (1+2)

MOV AL, 1
ADD AL, 2  

; SUB (3-1)

MOV AH, 3
SUB AH, 1

; MUL (1+2)*(3-1)

MOV BL, AH
MUL BL 

; DIVIDE By 5

MOV BX, 5
DIV BX   

; Storing the result in CX

MOV CX, AX

; (Right Portion) MUL (1*2)

MOV AL, 1
MOV BL, 2
MUL BL

; Storing the result in BX

MOV BX, AX 

; Clearning AX

SUB AX, AX

; ADD (3+2)

ADD AX, 3
ADD AX, 2

; SUB (3+2) - (1*2)

SUB AX, BX

; Adding All

ADD AX, CX

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN
