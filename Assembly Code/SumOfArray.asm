.data
array:.word  1, 2, 3, -5, 1
size: .word  5
message:.asciiz "The total is "

.text
.globl  main

main:   
        lw    $t0, size		 # store array size in $t0
        la    $t1, array         # store array address in $t1	 
        li    $t2,0              # initilize the sum to zero
        li    $t3,0              # initilize the counter to zero
	
        
loop:    bge   $t3,$t0,print      # If counter is greater than or equal to size, branch to print
         lw    $t4,0($t1)	  # load the array elements to $t4
         add   $t2,$t2,$t4        # sum = sum+array[i]
         addiu  $t3, $t3, 1	  # increment counter
         addiu  $t1,$t1,4         # increment pointer to the next array element
         j     loop
print: 
	li 	$v0, 4 		  # system call for print string 
	la 	$a0, message
	syscall
	li 	$v0, 1	 	  # system call for print integer 
	move 	$a0, $t2 	  # move number to print in $a0
	syscall

        li    $v0,10             # exit
        syscall   

