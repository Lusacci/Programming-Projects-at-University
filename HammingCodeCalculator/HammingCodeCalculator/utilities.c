#include "hamming.h"

unsigned getBitValueAtIndex(unsigned word, int index) 
{
	unsigned Masked1 = (unsigned) pow(2, index - 1);
	unsigned thingy = (word & Masked1) >> (index - 1);
	return thingy;
}
void setBitValueAtIndex(unsigned *word, int index, unsigned value) 
{
	unsigned MaskedOne = UINT_MAX - (unsigned)pow(2, index - 1);
	*word = *word&MaskedOne;
	unsigned MaskedTwo = value*pow(2, index - 1);
	*word = *word | MaskedTwo;
}
unsigned logicalXor(unsigned a, unsigned b)
{
	return a || b;
}
unsigned bitwiseXor(unsigned a, unsigned b) 
{
	return a ^ b;
}
int convertDataIndexToCodeWordIndex(int dataindex) 
{
	return(dataindex>4?(dataindex+4):(dataindex>1?(dataindex+3):(dataindex+2)));
}
int convertCodeWordIndexToDataIndex(int codewordindex) 
{
	return (((log10(codewordindex)/log10(2)) - (int)(log10(codewordindex) / log10(2)))==0?
		0:codewordindex > 8 ? (codewordindex - 4) : codewordindex>4 ? (codewordindex - 3) : codewordindex - 2);
}
int convertCheckIndexToCodeWordIndex(int checkindex) 
{
	return (int)pow(2, checkindex - 1);
}
int convertCodeWordIndexToCheckIndex(int codewordindex) 
{
	return log10(codewordindex)/log10(2) - (int)(log10(codewordindex) / log10(2))!=0?0:(int)(log10(codewordindex)/log10(2))+1;
}