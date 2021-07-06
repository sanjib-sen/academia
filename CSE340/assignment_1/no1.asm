# Given C code:
# for (int i = 0; i < 4; i++) {
#    if (i != A[B[i + 1]]) {
#      x = (5 * y) + (6 * z);  // You cannot use multiplication
#      y = (6 * x) + A[i];     // or consecutive additions.
#      z = B[A[i]] + A[B[i]] - 4;
#    }
#  }


# MIPS Code:

Addi $t0, $s6, $zero   		# Storing the base address of A[i]
Addi $t1, $s7, $zero     	# Storing the base address of B[i]
Addi $s0, $zero, $zero	# i = 0

# Starting Loop
# t0 for A[i] and t1 for bi
# remaining t2…..

LoopShuru:
slti $t3, $s0, 4 			# check if i < 4
bne $t3, $1, sesh		# if i>=4 exit
lw $t3, 4($t3) 			# load the address of B[i+1]
sll $t3, $t3, 2 			# The value of B[i+1]
add $t3, $t3, $s6 		# the address of A[B[i+1]]
lw $t3, 0($t3) 			# A[B[i+1]]
beq $t3, $s0, pore		#if i == A[B[i+1]] jump to pore
sll $t3, $s2, 2 			# 4*y
add $t3, $t3, $s2 		# 5*y
sll $t4, $s3, 2 			# 4*z
add $t4, $t4, $s3 		# 5*z
add $t4, $t4, $s3 		# 6*z
add $s1, $t2, $t4 		# (5*y) + (6*z)
sll $t4, $s1, 2 			# 4*x
add $t4, $t4, $s1 		# 5*x
add $t4, $t4, $s1 		#$ 6*x
lw $t3, 0($t0) 			# A[i]
add $s2, $t4, $t3 		# (6*x) + A[i]
sll $t3, $t3, 2 			# 4*A[i]
add $t3, $t3, $s7 		# address of B[A[i]]
lw $t3, 0($t3) 			# B[A[i]]
lw $t4, 0($t1) 			# B[i]
sll $t4, $t4, 2 			# 4*B[i]
add $t4, $t4, $s6 		# the address of A[B[i]]
lw $t4, 0($t4) 			# A[B[i]]
add $s3, $t3, $t4 		# B[A[i]] + A[B[i]]
addi $s3, $s3, -4 		# B[A[i]] + A[B[i]] - 4
pore:
addi $s0, $s0, 1 		# i += 1
addi $t0, $t0, 4 		# adress of A[i+1]
addi $t1, $t1, 4 		# address of B[i+1]
J LoopShuru 			# jump to LoopShuru
sesh:
