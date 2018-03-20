# Prime Numbers program
# Phillip Thames 3-23-2017

.data
message: .asciiz "Welcome to the Prime Number Output.\n"
message1: .asciiz "Enter a positive number: "
comma: .asciiz ", "
i: .word 2
j: .word 2
p: .word 0
count: .word 1
extra: .word 2

.text
.globl main

main:
li $t1, 2 #i=2
li $t2, 2 #j=2
li $t5, 1 #move p from 0 to 1
li $t6, 2  #reset J back to 2

############ Messages
li $v0, 4
la $a0, message
syscall

li $v0, 4
la $a0, message1
syscall

#################Gather Input
li $v0, 5
syscall
move $t0, $v0

blt $t0, $t1, for #######Exit first print cycle if needed

#########Print cycle
li $v0, 1
move $a0, $t1
syscall
li $v0, 4
la $a0, comma
syscall

#########3Sets p to 0
for:
move $t3, $zero

#############Checks if i is prime
inner_for:
remu $t4, $t1, $t2
bnez $t4, inc_j
move $t3, $t5

########### increments j
inc_j:
addi $t2, $t2, 1
blt $t2, $t1, inner_for
bnez $t3, inc_i
##################### print cycle
li $v0, 1
move $a0, $t1
syscall
li $v0, 4
la $a0, comma
syscall
 
 ##############increments i
inc_i:
addi $t1, $t1, 1
move $t2, $t6
bgt $t1, $t0, exit
j for


############Exits
exit:
li $v0, 10
syscall
jr $ra


