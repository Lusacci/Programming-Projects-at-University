@@@ OPEN INPUT FILE, READ INTEGER FROM FILE, PRINT IT, CLOSE INPUT FILE
	.equ SWI_Open, 0x66 @open a file
	.equ SWI_Close,0x68 @close a file
	.equ SWI_RdStr, 0x6a @reads a string
	.equ SWI_PrChr,0x00 @ Write an ASCII char to Stdout
	.equ SWI_PrStr, 0x69 @ Write a null-ending string
	.equ Stdout, 1 @ Set output target to be Stdout
	.equ SWI_Exit, 0x11 @ Stop execution
	.global _start
	.text
_start:
	@ == Open an input file for reading =============================
	ldr r0,=InFileName @ set Name for input file
	mov r1,#0 @ mode is input
	swi SWI_Open @ open file for input
	bcs InFileError @ Check Carry-Bit (C): if= 1 then ERROR
	mov r4, r0 @ this stores r0 into r4
	@ Save the file handle in memory:
	ldr r1,=InFileHandle @ if OK, load input file handle
	str r0,[r1] @ save the file handle
RLoop:
	mov r0, r4
	ldr r1, =data
	mov r2, #83
	swi SWI_RdStr @ read the string into R0
	bcs EofReached @ Check Carry-Bit (C): if= 1 then EOF reached

 ldr r6, =data
Procloop:
	ldrb r5, [r6], #1
	cmp r5, #0
	beq Procstop
	cmp r5, #90
	bgt lowercaseletter
	cmp r5, #32
	beq space
	add r5, r5, #13
	cmp r5, #90
	subgt r5, r5, #26
space: 
comeback:
	mov r0, r5
	swi SWI_PrChr
	b Procloop
Procstop:
	mov r0, #Stdout
	ldr r1,=NL
	swi SWI_PrStr
	bal RLoop @ keep reading till end of file
	@ == End of file ===============================================
EofReached:
	@ == Close a file ===============================================
	ldr R0, =InFileHandle @ get address of file handle
	ldr R0, [R0] @ get value at address
	swi SWI_Close
	swi SWI_Exit
Exit:
    swi SWI_Exit @ stop executing
lowercaseletter: 
	add r5, r5, #13
	cmp r5, #122
	subgt r5, r5, #26
	b comeback
InFileError:
	mov R0, #Stdout
	ldr R1, =FileOpenInpErrMsg
	swi SWI_PrStr
	bal Exit @ give up, go to end
	.data
	.align
InFileHandle: .skip 4
data: .skip 85
InFileName: .asciz "lab2.txt"
FileOpenInpErrMsg: .asciz "Failed to open input file \n"
ColonSpace: .asciz": "
NL: .asciz "\n" @ new line
.end