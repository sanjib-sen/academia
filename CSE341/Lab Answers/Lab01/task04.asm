                           .MODEL SMALL
 
.STACK 100H

.DATA 

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

; Let's Substract a Smaller Number from a Large Number.

MOV AX,9999H
MOV BX,33H
SUB AX,BX

; So, AL 66, AH 99. Works Fine.
; Let's try the opposite.

MOV AX,33H
MOV BX,9999H
SUB AX,BX

; So, AX Becomes 669A Which is very different than what should
;   We get after substracting 33H from 9999H
;   Maybe it's because the AX Register doesn't have enough room/
;   bits for allocating the 2's prime negative number which is
;   FFFF FFFF FFFF 669A

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 