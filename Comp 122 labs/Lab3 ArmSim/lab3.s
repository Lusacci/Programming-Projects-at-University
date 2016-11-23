.equ SWI_Open, 0x66   @open a file
.equ SWI_Close,0x68   @close a file
.equ SWI_PrChr,0x00   @ Write an ASCII char to Stdout
.equ SWI_PrStr, 0x69  @ Write a null-ending string
.equ SWI_PrInt,0x6b   @ Write an Integer
.equ SWI_RdInt,0x6c   @ Read an Integer from a file
.equ Stdout, 1        @ Set output target to be Stdout
.equ SWI_Exit, 0x11   @ Stop execution

ldr r0,=IFN                @set Name for input file
mov r1,#0                         @mode is input
swi 0x66                      @ open file for input 

mov r11,r0                       @ move input file
ldr r10,=array
ReadThisLoop:
mov r0,r11
swi SWI_RdInt
bcs EOF
str r0,[r10]
add r10,r10,#4
b   ReadThisLoop	
EOF:
sub r10, r10, #4
ldr r7,=array                    @ set up pointers

Sort:
cmp r7, r10
beq FSort
mov r9, r7
mov r8, r7
LoopSort:
CMP R9, R10
Bgt Swap                       
ldr r0,[r8]	
ldr r1,[r9]
cmp r0, r1
BGT ChangeMin

FCM:
Add R9, R9, #4
B LoopSort

Swap:
ldr r4,[r7]
ldr r3,[r8]
str r3,[r7]
str r4,[r8]

Add r7, r7, #4	
b Sort	
ChangeMin:
mov r8, r9
B FCM

FSort:
ldr r5,=array
add r10,r10,#4
ThisPrintLoop:
mov r0, #1
ldr r1,[r5]
swi SWI_PrInt
mov r0,#1
ldr r1,=NewLine
swi SWI_PrStr
add r5, r5, #4
cmp r5, r10
beq ExitHere                  
B ThisPrintLoop
	
ExitHere:
mov r0,r11
swi 0x68
swi 0x11
	
.data	
array:    .skip 1024	
IFN:  .asciz "input.txt"

NewLine:     .asciz"\n" 