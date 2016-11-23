// include header files here
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
// use define macros to create symbolic constants
// declare global variables here,
// including arrays for input line and tokens
char curline[300];
char tokens[100][10];
int tokmeNum;
// gettokens() function
// break input line into tokens using strtok
void gettokens() 
{	
	tokmeNum = 0;
	gets(curline);
	char *tokme = strtok(curline, " ");
	while (tokme != NULL) 
	{
		int tokmeLen = 0;
		while (*(tokme + tokmeLen) != '\0')
		{
			tokens[tokmeNum][tokmeLen] = *(tokme + tokmeLen);
			tokmeLen++;
		}
		tokens[tokmeNum][tokmeLen] = '\0';

		tokmeNum++; //we finally have our first token. 
		tokme = strtok(NULL, " ");
	}
	
}
// commandline() function
// loop over the following tasks
// -- print > prompt
// -- read in line of input
// -- use gettokens() to tokenize it
// -- if first token is "quit" then say "Bye!" and quit
// -- if first token is "sum" then compute sum of remaining tokens
// -- if first token is "prod" then compute prod of remaining tokens
// -- if first token is anything else print error message
void commandline() { 
	int sum = 0;
	int prod = 1;
	puts("Da Calculator");
	while (1) 
	{
		printf("%c", '>');
		gettokens();
		if (strcmp(tokens[0], "quit") == 0)
		{
			puts("Bye!");
			exit(0);
		}
		else if (strcmp(tokens[0], "sum") == 0)
		{
			int i;
			for (i = 1; i < tokmeNum; i++)
			{
				sum = sum + atoi(tokens[i]);
			}
			printf("%d\n", sum);
		}
		else if (strcmp(tokens[0], "prod") == 0)
		{
			int i;
			for (i = 1; i < tokmeNum; i++)
			{
				prod = prod * atoi(tokens[i]);
			}
			printf("%d\n", prod);
		}
		else
		{
			puts("Error invalid input");
		}
	}
}
// main method
// entry point to program
void main(void) 
{
	commandline();
	// call commandline()
}