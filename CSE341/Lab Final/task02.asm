.MODEL SMALL

Maximum MACRO A1, A2, A3
MOV BL, A1
MOV BH, A2
MOV AL, A3

CMP BL, AL
JNG alboro2
MOV CH, BL
MOV CL, AL
JMP here2

alboro2:
MOV CH, AL
MOV CL, BL

here2:
CMP BH, CH
JNG bhlower2
MOV CH, BH

bhlower2:
CMP BH, CL
JNL print2
MOV CL, BH

print2:
LEA DX, prompt19
MOV AH, 09
INT 21H
MOV DL, CH
ADD DL, 30H
MOV AH, 2
INT 21H

ENDM
 
.STACK 100H

.DATA 
NID	DB	8	1,2,4,5,6,7,8,9
arr2 DB 3  0,0,0
newline DB 0AH,0DH,"$"
prompt19 DB 0AH,0DH,'Maximum number is: $'
prompt20 DB 0AH,0DH,'Minimum number is: $'

.CODE


Minimum PROC

CMP BL, AL
JNG alboro
MOV CH, BL
MOV CL, AL
JMP here

alboro:
MOV CH, AL
MOV CL, BL

here:
CMP BH, CH
JNG bhlower
MOV CH, BH

bhlower:
CMP BH, CL
JNL print
MOV CL, BH

print:
LEA DX, prompt20
MOV AH, 9
INT 21H
MOV DL, CL
ADD DL, 30H
MOV AH, 2
INT 21H

RET
Minimum ENDP


 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here  

MOV AH, 1
INT 21H
SUB AL, 30H
MOV arr2[0], AL
MOV BL, AL 
MOV AH, 1
INT 21H
SUB AL, 30H
MOV arr2[1], AL
MOV BH, AL
MOV AH, 1
INT 21H
SUB AL, 30H
MOV arr2[2], AL

Maximum arr2[0],arr2[1],arr2[2]
MOV BL, arr2[0]
MOV BH, arr2[1]
MOV AL, arr2[2]

CALL Minimum
;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN



