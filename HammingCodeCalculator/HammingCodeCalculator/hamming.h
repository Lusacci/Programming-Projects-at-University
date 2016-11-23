#ifndef HAMMING_H
#define HAMMING_H
#include <stdlib.h>
#include <math.h>
#include <limits.h>
#include <stdio.h>
#define DATABITCOUNT 8
#define CHECKBITCOUNT 4
#define CODEWORDBITCOUNT 12

unsigned getBitValueAtIndex(unsigned word, int index);
void setBitValueAtIndex(unsigned *word, int index,unsigned value);
unsigned logicalXor(unsigned a, unsigned b);
unsigned bitwiseXor(unsigned a, unsigned b);
int convertDataIndexToCodeWordIndex(int dataindex);
int convertCodeWordIndexToDataIndex(int codewordindex);
int convertCheckIndexToCodeWordIndex(int checkindex);
int convertCodeWordIndexToCheckIndex(int codewordindex);


#endif
