.MODEL SMALL
 
.STACK 100H

.DATA 
prompt DB "Please insert a character.$"
prompt1 DB "Please insert a Number: $"
prompt2 DB 0AH,0DH,"Please insert another Number: $"
prompt3 DB 0AH,0DH,"The sum of the numbers is: $"
prompt4 DB "Please insert a Character: $"
prompt5 DB 0AH,0DH,"Please insert an Uppercase Letter: $"
prompt6 DW "THE SUM OF $"
prompt7 DW " AND $"
prompt8 DW " IS $"
prompt9 DB "ENTER THREE INITIALS: $" 
prompt10 DB "ENTER A HEX DIGIT (A-F): $" 
prompt11 DB "IN DECIMAL IT IS: $" 
prompt12 DB '**********',0DH,0AH,'$' 
prompt13 DB 'The Number is even$'
prompt14 DB 'The Number is odd$'
prompt15 DB 'The Character is Vowel$'
prompt16 DB 'The Character is Consonent$'
prompt17 DB 'The number is divisible by 5 and 11$'
prompt18 DB 'The number is not divisible by 5 and 11$' 
prompt19 DB 'The maximum number is: $'
prompt20 DB 0AH,0DH'The minimum number is: $'

prompt21 DB 'Saturday$' 
prompt22 DB 'Sunday$'
prompt23 DB 'Monday$'
prompt24 DB 'Tuesday$'
prompt25 DB 'Wednesday$'
prompt26 DB 'Thursday$'
prompt27 DB 'Friday$'

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

;Task 01
;Take a number in AX, and if it"s a negative number, replace it by 5.


MOV AX, -1
CMP AX, 0

JL replace
replace:
MOV AX, 5


;Task 02
;Suppose AL and BL contain extended ASCII characters. Display the one that comes first
;in the character sequence.

MOV AL, 'f'
MOV BL, 'd'

CMP AL,BL
JL first
JG second

first:
MOV DL, AL
MOV AH, 2
INT 21H
JMP ended

Second:
MOV DL, BL
MOV AH, 2
INT 21H
JMP ended

ended:


;Task 03
;If AX contains a negative number, put -1 in BX; if AX contains 0, put 0 In BX; if AX
;contains a positive number, put 1 in BX.

MOV AX, 5
CMP AX, 0
JL minus
JG plus
JE equal

minus:
MOV BX, -1
JMP ended

plus:
MOV BX, 1
JMP ended

equal:
MOV BX, 0
JMP ended

ended:


;Task 04
;If AL contains 1 or 3, display "o"; if AL contains 2 or 4 display "e".

MOV AL, 5
CMP AL, 1
JE odd
CMP AL, 3
JE odd
CMP AL, 2
JE even
CMP AL, 4
JE even

odd:
MOV DL, "o"
MOV AH, 2
INT 21H
JMP ended

even:
MOV DL, "e"
MOV AH, 2
INT 21H
JMP ended

ended:



;Task 05
;Read a character, and if it's an uppercase letter, display it.

MOV AH, 1
INT 21H
CMP AL, 'a'
JL upper
JMP ended

upper:
MOV DL, AL
MOV AH, 2
INT 21H

ended:


;Task 06
;Read a character. If it's "y" or "Y", display it; otherwise, terminate the program.

MOV AH, 1
INT 21H
CMP AL, 'y'
JE oai
CMP AL, 'Y'
JE oai
JMP ended

oai:
MOV DL, AL
MOV AH, 2
INT 21H

ended:


;Task 07
;Write an assembly program to check whether a number is even or odd.

MOV AX, 6
MOV BX, 2
DIV BX
CMP DL, 0
JE even
JNE noteven
JMP ended

even:
LEA DX, prompt13
MOV AH, 9
INT 21H
JMP ended

noteven:
LEA DX, prompt14
MOV AH, 9
INT 21H

ended:


;Task 08
;Write a program to input any alphabet and check whether it is vowel or consonant.
MOV AH, 1
INT 21H
CMP AL, 'A'
JE vowel
CMP AL, 'E'
JE vowel
CMP AL, 'I'
JE vowel
CMP AL, 'O'
JE vowel
CMP AL, 'U'
JE vowel  

LEA DX, prompt16
MOV AH, 9
INT 21H
JMP ended

vowel:
LEA DX, prompt15
MOV AH, 9
INT 21H
ended:    



;Task 09
;Write a program to check whether a number is divisible by 5 and 11 or not

MOV AX, 55
MOV CX, AX
MOV BX, 5
DIV BX

CMP DL, 0
JE divbyfive
JNE notdiv


divbyfive:
MOV AX, CX
MOV BX, 11
DIV BX
CMP DL, 0
JE divbyboth
JMP notdiv

divbyboth:
LEA DX, prompt17
MOV AH, 9
INT 21H
JMP ended

notdiv:
LEA DX, prompt18
MOV AH, 9
INT 21H

ended:


;Task 10
;Write a program to find the maximum and minimum between three numbers.
MOV BL, 3
MOV BH, 5
MOV AL, 4

CMP BL, AL
JNG alboro
MOV CH, BL
MOV CL, AL

alboro:
MOV CH, AL
MOV CL, BL

CMP BH, CH
JNG bhlower
MOV CH, BH

bhlower:
CMP BH, CL
JNL print
MOV CL, BH


print:
LEA DX, prompt19
MOV AH, 9
INT 21H
MOV DL, CH
ADD DL, 30H
MOV AH, 2
INT 21H
LEA DX, prompt20
MOV AH, 9
INT 21H
MOV DL, CL
ADD DL, 30H
MOV AH, 2
INT 21H


;Task 11
;Write a program that takes as input all sides of a triangle and check whether triangle is
;valid or not. If the sides form a triangle, print 'Y', otherwise print 'N'.


MOV AH, 1
INT 21H
SUB AL, 30H
MOV DH, AL
MOV AH, 1
INT 21H
SUB AL, 30H
MOV CH, AL
MOV AH, 1
INT 21H
SUB AL, 30H
MOV CL, AL


CMP CH, CL
JG chboro
MOV BL, CH
MOV BH, CL
JMP continue

chboro:
MOV BH, CH
MOV BL, CL

continue:

CMP DH, CH
JNG dhchoto
MOV DL, CH
MOV BH, DH
JMP print

dhchoto:
CMP DH, CL

JG dhboro
MOV DL, CL
MOV BL, DH
JMP print

dhboro:
MOV DL, DH


print:
ADD BL, DH
CMP BL, BH

JNG nottri
MOV DL, "Y"
MOV AH, 2
INT 21H
JMP ended

nottri:
MOV DL, "N"
MOV AH, 2
INT 21H
JMP ended

ended:


;Task 12
;Write a program that takes a digit as an input and outputs the following. If the digit is
;within 0-3, it prints 'i', If it"s within 4-6, it prints 'k', If it"s within 7-9, it prints 'l' and
;if it"s 10, it prints 'm'.

MOV AH, 1
INT 21H
SUB AL, 30H

CMP AL, 0
JL ended

CMP AL, 4
JNL next2
MOV DL, "i"
MOV AH, 2
INT 21H
JMP ended

next2:
CMP AL, 7
JNL next3
MOV DL, "k"
MOV AH, 2
INT 21H
JMP ended

next3:
CMP AL, 10
JNL ended
MOV DL, "l"
MOV AH, 2
INT 21H


CMP AL, 11
JNE ended
MOV DL, "m"
MOV AH, 2
INT 21H

ended:

;Task 13
;Write a case to print the name of the day of the week. Consider the first day of the week
;is Saturday.  

MOV AH, 1
INT 21H
SUB AL, 30H
CMP AL, 1
JE one
CMP AL, 2
JE two
CMP AL, 3
JE three
CMP AL, 4
JE four
CMP AL, 5
JE five
CMP AL, 6
JE six
CMP AL, 7
JE seven
JMP ended

one:
LEA DX, prompt21
MOV AH, 9
INT 21H
JMP ended  

two:
LEA DX, prompt22
MOV AH, 9
INT 21H
JMP ended

three:
LEA DX, prompt23
MOV AH, 9
INT 21H
JMP ended

four:
LEA DX, prompt24
MOV AH, 9
INT 21H
JMP ended

five:
LEA DX, prompt25
MOV AH, 9
INT 21H
JMP ended


six:
LEA DX, prompt26
MOV AH, 9
INT 21H
JMP ended


seven:
LEA DX, prompt27
MOV AH, 9
INT 21H
JMP ended 

ended:



;Task 14
;Write a case to print the total number of days in a month.

MOV AH, 1
INT 21H
SUB AL, 30H
CMP AL, 1
JE one
CMP AL, 2
JE two
CMP AL, 3
JE one
CMP AL, 4
JE three
CMP AL, 5
JE one
CMP AL, 6
JE three
CMP AL, 7
JE one
CMP AL, 8
JE one
CMP AL, 9
JE three
CMP AL, 10
JE one
CMP AL, 11
JE three
CMP AL, 12
JE one

JMP ended

one:
MOV DL, 3
ADD DL, 30H
MOV AH, 2
INT 21H   

MOV DL, 1
ADD DL, 30H
MOV AH, 2
INT 21H
JMP ended  

two:
MOV DL, 2
ADD DL, 30H
MOV AH, 2
INT 21H   

MOV DL, 8
ADD DL, 30H
MOV AH, 2
INT 21H
JMP ended  


three:
MOV DL, 3
ADD DL, 30H
MOV AH, 2
INT 21H   

MOV DL, 0
ADD DL, 30H
MOV AH, 2
INT 21H
JMP ended  



ended:

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 