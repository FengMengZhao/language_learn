# To illustrate how functions works 
# This program will compute the value of 2^3 + 5^2

# Everyting in the main program is stored in registers, 
# so the data section doesn't have anything

 .section .data


 .section .text

 .global _start
_start:
 pushl $0 #push second arguement
 pushl $2 #push first arguement
 call power #call the function
 addl $8, %esp #move the stack pointer back
 
 pushl %eax #save the first answer before
            #calling the next function 
 
 pushl $2 #push second arguement
 pushl $5 #push first arguement
 call power #call the function
 addl $8, %esp #move the stack pointer back

 popl %ebx #the second answer is already 
           #in the %eax, we saved the 
           #first answer onto the stack,
           #so now we can just pop it
           #out into %ebx    
 
 addl %eax, %ebx #add them together
                 #return int the ebx
    
 movl $1, %eax #exit(%ebx is returned)
 int $0x80

# This function is used to compute 
# the value of a number raised to a power

 #.type power, @function
power:
 pushl %ebp #save old base pointer
 movl %esp, %ebp #make stack pointer the base pointer
 subl $4, %esp #get room for our local storage

 movl 8(%ebp), %ebx #put first arguement in %ebx
 movl 12(%ebp), %ecx #put second arguement in %ecx

 movl $1, -4(%ebp) 
 cmpl $0, %ecx
 je end_power

 movl %ebx, -4(%ebp) #store current value

power_loop_start:
 cmpl $1, %ecx #if the power is 1, we are done
 je end_power
 movl -4(%ebp), %eax #move the current result into %eax
 imul %ebx, %eax #multiply the current result by the base number

 movl %eax, -4(%ebp) #store the current result

 decl %ecx #decrease the power
 jmp power_loop_start #run for the next power

end_power:
 movl -4(%ebp), %eax #move value goes into %eax
 movl %ebp, %esp #restore the stack pointer
 popl %ebp #restore the base pointer
 ret
