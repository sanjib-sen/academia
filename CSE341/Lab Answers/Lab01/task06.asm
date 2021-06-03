                                                .MODEL SMALL
 
.STACK 100H

.DATA 

A DW 12H
B DW 26H
C DW 36H

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

;1  A = B - A
MOV AX,A
MOV BX,B
SUB BX,AX  
MOV A,BX

;2  A = -(A + 1) ;  (Currently A=14)
INC A
NEG A

;3  C = A + (B + 1); use inc
MOV A,13H ;Declaring Positive A for Better understanding
INC B     ;B becomes 27 from 26
MOV AX,B
ADD AX,A
MOV C,AX

;4  A = B – (A – 1); use dec
DEC A
MOV AX,B
SUB AX,A
MOV A,AX


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 