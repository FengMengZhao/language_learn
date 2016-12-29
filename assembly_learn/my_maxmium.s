 .section .data

data_item:
 .long 12, 32, 17, 23, 90, 121, 210, 28, 224, 0


 .section .text

 .global _start
_start:
 movl $0, %edi
 movl data_item(, %edi, 4), %eax
 movl %eax, %ebx

start_loop:
 cmpl $0, %eax 
 je end_loop
 incl %edi
 movl data_item(, %edi, 4), %eax
 cmpl %ebx, %eax 
 jle start_loop
 movl %eax, %ebx
 jmp start_loop

end_loop:
 movl $1, %eax
 int  $0x80
