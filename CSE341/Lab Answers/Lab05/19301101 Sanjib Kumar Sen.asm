.MODEL SMALL
 
.STACK 100H

.DATA 
prompt db "Enter Password: $"
newline DB 0AH,0DH,"$"

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here  



;Task 01
;Write a count-controlled loop to display a row of 80 stars.

MOV CX,80   
START:
MOV DL, "*"
MOV AH, 2
INT 21H
loop START                





;Task 02
;Write a sequence of instructions to do each of the following:
;a. Put the sum of 1 + 4 + 7+ .. + 148 in AX.
;b. Put the sum 100 + 95 + 90 + ... + 5 in AX. 
;a.
MOV AX, 0
MOV BX, 1
START2:
ADD AX, BX
ADD BX, 3

CMP BX, 148
JNE LOOP START2

;b.
MOV AX, 0
MOV BX, 100
START3:
ADD AX, BX
SUB BX, 5

CMP BX, 5
JNE LOOP START3
               
               
               

;Task 03
;Read a five character password and overprint it by executing a carriage return and
;displaying five X's. You need not store the input characters anywhere.  

MOV BX,0   
START:
MOV AH, 1
INT 21H
MOV DL, 13
MOV AH, 2
INT 21H
INC BX
MOV CX, BX

STAR:
MOV DL, "*"
MOV AH, 2
INT 21H

LOOP STAR
CMP BX, 5
JNE START




;Task 04
;The following algorithm may be used to carry out multiplication of two positive numbers
;M and N by repeated addition.
;Initialize product to 0
;REPEAT
;add M to product
;decrement N
;UNTIL N equals 0
;Write a sequence of instructions to multiply AX by BX, and put the product in CX. You
;may ignore the possibility of overflow.

MOV CX, 0
MOV AX, 5
MOV BX, 7
REPEAT:
ADD CX, AX
DEC BX
CMP BX,0
JNE REPEAT       
                    
            
            
                      
                      

;Task 05
;Write a program to display the extended ASCII characters (ASCII codes 80h to FFh).
;Display 10 characters per line, separated by blanks. Stop after the extended characters
;have been displayed once.         

MOV BL, 10
MOV BH, 80H
        
Line:        
LEA DX, newline
MOV AH, 9
INT 21H
MOV BL, 10

sameline:
CMP BL, 0
JE Line
CMP BH, 0FFH
JE ENDED
MOV DL, " "
MOV AH, 2
INT 21H
MOV DL, BH
MOV AH, 2
INT 21H
INC BH
DEC BL
LOOP sameline

ENDED:       



;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 