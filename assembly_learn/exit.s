#PURPOSE: Simple program that exits and returns a status code back to linux kernel
#

#INPUT: none 
#

#OUTPUT: returns a status code. This can be viewed by typing
#
# echo $?
#
# after running a program
#

#VARIABLES:
# %eax holds the system call number(this is always the case)
#
# %ebx holds the return status

.section .data # Anything start with a perio isn't direcly translate into a machine instruction
               # Instead, it is an instruction to the assembler itself 
               # These are called assembler directives or pseudo-operations 

.section .text
.global _start
_start:
movl $1, %eax # this is the linux kernel command number(system call) for exiting a program
#movl $0, %ebx # this is the status number we will return to the operating system
              # Change this around and it will return different things to echo $? 
movl $1, %ebx # this will let echo $? output 1
int $0x80     # this wakes up the kernel to run the exit command
