#include "hamming.h"
unsigned calculateCheckValue(unsigned dataword, int index)
{
	unsigned a;

	if (index == 1) {
		a = bitwiseXor(getBitValueAtIndex(dataword, 1), getBitValueAtIndex(dataword, 2));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 4));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 5));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 7));
		return a;
	}
	else if (index == 2) {
		a = bitwiseXor(getBitValueAtIndex(dataword, 1), getBitValueAtIndex(dataword, 3));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 4));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 6));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 7));
		return a;
		//return getBitValueAtIndex(dataword, 1) | getBitValueAtIndex(dataword, 3) | getBitValueAtIndex(dataword, 4) | getBitValueAtIndex(dataword, 6) | getBitValueAtIndex(dataword, 7);
	}
	else if (index == 3) {
		a = bitwiseXor(getBitValueAtIndex(dataword, 2), getBitValueAtIndex(dataword, 3));
	
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 4));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 8));
		
		//return getBitValueAtIndex(0xff, 2) | getBitValueAtIndex(0xff, 3) | getBitValueAtIndex(0xff, 4) | getBitValueAtIndex(0xff, 8);

		return a;
	}
	else{
		a = bitwiseXor(getBitValueAtIndex(dataword, 5), getBitValueAtIndex(dataword, 6));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 7));
		a = bitwiseXor(a, getBitValueAtIndex(dataword, 8));
		return a;
		//return getBitValueAtIndex(dataword, 5) | getBitValueAtIndex(dataword, 6) | getBitValueAtIndex(dataword, 7) | getBitValueAtIndex(dataword, 8) | getBitValueAtIndex(dataword, 7);

	}
}
unsigned calculateCheckWord(unsigned dataword)
{
	return calculateCheckValue(dataword, 1)*pow(2, 0) +
		calculateCheckValue(dataword, 2)*pow(2, 1) +
		calculateCheckValue(dataword, 3)*pow(2, 2) +
		calculateCheckValue(dataword, 4)*pow(2, 3);
}
unsigned createCodeWord(unsigned dataword, unsigned checkword) 
{
	
	unsigned fullword=0;
	for (int i = 1; i <= CHECKBITCOUNT; i++) 
	{
		fullword = fullword + getBitValueAtIndex(checkword, i)*pow(2,convertCheckIndexToCodeWordIndex(i)-1);
	}
	for (int j = 1; j <= DATABITCOUNT; j++) 
	{
		fullword = fullword + getBitValueAtIndex(dataword, j)*pow(2, convertDataIndexToCodeWordIndex(j) - 1);
	}
	
	return fullword;
	

	//unsigned fullword = dataword << 4;

}
unsigned extractDataWordFromCodeWord(unsigned fullword) 
{
	unsigned dataword =0;

	for (int i = 1; i <= CODEWORDBITCOUNT;i++) 
	{
		if ((log10(i) / log10(2) - (int)(log10(i) / log10(2))) != 0) 
		{
			dataword = dataword + getBitValueAtIndex(fullword, i)*pow(2, convertCodeWordIndexToDataIndex(i) - 1);
		}
	}
	return dataword;

}

unsigned extractCheckWordFromCodeWord(unsigned fullword)
{
	unsigned checkword = 0;

	for (int i = 1; i <= CODEWORDBITCOUNT; i++)
	{
		if ((log10(i) / log10(2) - (int)(log10(i) / log10(2))) == 0)
		{
			checkword = checkword + getBitValueAtIndex(fullword, i)*pow(2, convertCodeWordIndexToCheckIndex(i) - 1);
		}
	}
	return checkword;
}
unsigned calculateCheckWordXor(unsigned codeword) 
{
	return  bitwiseXor(extractCheckWordFromCodeWord(codeword), calculateCheckWord(extractDataWordFromCodeWord(codeword)));
}
unsigned extractCorrectedDataWord(unsigned codeword) 
{
	unsigned wrongBit = calculateCheckWordXor(codeword);
	unsigned bitinCodeword = getBitValueAtIndex(codeword, wrongBit);
	unsigned correctedBit = bitwiseXor(bitinCodeword, 1);
	unsigned* newCodeword = (unsigned)malloc(sizeof(unsigned));
	*newCodeword = codeword;
	setBitValueAtIndex(newCodeword, wrongBit, correctedBit);
	unsigned returnValue = *newCodeword;
	free(newCodeword);
	return extractDataWordFromCodeWord(returnValue);

}