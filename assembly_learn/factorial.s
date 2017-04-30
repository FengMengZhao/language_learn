# The function of factorial, e.g., factorial(4) = 4*3*2*1

 .section .data


 .section .text


 .global _start
_start:
 pushl $5  
 call factorial

 movl $1, %eax
 int 0x80

factorial:
 pushl %ebp
 movl %esp, %ebp
 subl $4, %esp

 movl 8(%ebp), %ebx #%ebx store the parameter

 movl (%ebx), -4(%ebp) #local variable

 cmpl $1, %ebx
 je end_factorial

 imul %ebx, %ebx
 decl $1, %ebx
 call factorial
 

end_factorial:
 movl -4(%ebp), %eax
 movl %ebp, %esp 
 popl %ebp
 ret
