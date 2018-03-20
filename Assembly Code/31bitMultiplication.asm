# Lab 8 Submission 4-8-2017

# Phillip Thames

# Multiplies Two numbers up to 31 bits each
# Numbers are input by user

################################################
.data
prompt1: .asciiz "Enter the first number "    # Prompts for input and output
prompt2: .asciiz "Enter the second number "
answer: .asciiz "The product of the two is "

 # Initial Variables
A: .word 0                                    
B: .word 0
C: .word 0
D: .word 0
I: .word 0
AndOne: .word 1
N: .word 31

.text	 	#starts code segment
.globl main 	#sets label main as global

##########################################################
main:
lw $t0, A  # first number to multiply
lw $t1, B  # second number to multiply
lw $t2, C  # temp
lw $t3, D  # temp
lw $t4, I  # counter
lw $t5, AndOne   # used for And-ing
lw $t6, N         # 31 limit for counter
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
li $v0, 4		# system call for print string
la $a0, prompt1		# load address of the string to print in #a0
syscall

li $v0, 5 		#system call for read integer
syscall			# the integer placed in $v0
move $t0,$v0 		# move the first number from $v0 in $s0
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
li $v0, 4		# system call for print string
la $a0, prompt2		# load address of the string to print in #a0
syscall

li $v0, 5 		# system call for read integer 
syscall			# the integer placed in $v0
move $t1,$v0 		# move the second number from $v0 in $s1
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
loop:
bgt $t4, $t6, exit      # While i<= N
andi $s0, $t1, 1         # get least sig bit of B
bne $t5, $s0, L1          # if least sig bit of B is 1
addu $t2, $t2, $t0        #  C = C + A

L1:                      # Then Shift D right by one
srl $t3, $t3, 1

andi $s1, $t2, 1         # get least sig of C
bne $t5, $s1, L2         # if least sig of C is 1
addi $t3, $t3, 2147483648    # add one to the most sig bit to D

L2:                     # Then shift C & B right by one
srl $t2, $t2, 1
srl $t1, $t1, 1
addi $t4, $t4, 1        # increment counter 
j loop                  # loop back

#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

exit:                  # when counter reaches 32, output answer and exit
li $v0, 4
la $a0, answer
li $v0, 1
move $a0, $t2
syscall
li $v0, 1
move $a0, $t3
syscall
            
li $v0, 10        #program exits
syscall     
