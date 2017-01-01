#PURPOSE: Find the maxmium value of a list of values

#VARIABLES: The registers have the following use:
#
# %edi - Holds the index of data item being examie
# %ebx - Largest data item found
# %eax - current data item
#
# The following memory locations are used:
# data-items - contains the item data. 0 is used to terminate the data    

 .section .data

data_item:
 .long 3, 67, 34, 222, 45, 75, 54, 34, 44, 255, 22, 11, 66, 0


 .section .text

 .globl _start
_start:
 movl $0, %edi # move 0 to the index register
 movl data_item(, %edi, 4), %eax # load the first byte of data
 movl %eax, %ebx # since this is the first item, %eax is the biggest

start_loop:
 cmpl $0, %eax # check to see if we've hit the end
 je loop_exit # if equal, then exit loop
 incl %edi # load the next value
 movl data_item(, %edi, 4), %eax # load the first byte of data
 cmpl %ebx, %eax
 jle start_loop # jump to loop beginning if the new one isn't bigger
 movl %eax, %ebx # move the value as the largest
 jmp start_loop # jump to loop beginning

loop_exit:
 movl $1, %eax
 int $0x80
