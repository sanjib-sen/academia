# Python code:
# a =0
# b = 1
# i = 1
# while i<10:
    # c = a+b
    # a =b
    # b =c 
    # i+=1
    # print(a) # Not needed


# MIPS Code

addi $t1, $zero, 0 		# a = 0
addi $s1, $zero, 1 		# b = 1
addi $t0, $zero, 1 		# i = 1
loop:				# Starting Loop
slti $t2, $t0, 10 		# check if 10>i
bne $t2, $0, sesh		# exit if i>=10
add $t3, $t1, $s1 		# c = a + b
addi $t1, $s1, 0 		# a = b
addi $s1, $t3, 0 		# b = c
addi $t0, $t0, 1 		# i+=1
J loop 				# go back to loop
sesh:
