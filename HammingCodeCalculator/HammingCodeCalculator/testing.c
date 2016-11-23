#include "hamming.h"
void phaseOneTest()
{
	// tests for get bit function
	printf("get bit value test -----------\n");
	unsigned a = 0xFE3;
	for (int i = 1; i <= CODEWORDBITCOUNT; i++) {
		printf("%d %x\n", i, getBitValueAtIndex(a, i));
	}
	// tests for set bit function 
	printf("set bit value test -----------\n");
	unsigned b = 0xFFF;
	unsigned c = b;                     // c is a copy of b 
	for (int i = 1; i <= 12; i++) {
		b = c;
		setBitValueAtIndex(&b, i, 0);
		printf("%d %x %x\n", i, c, b);
	}
	// tests for convert data indexes 
	printf("convert data index test -----------\n");
	for (int i = 1; i <= DATABITCOUNT; i++) {
		printf("%d %d\n", i, convertDataIndexToCodeWordIndex(i));
	}
	for (int i = 1; i <= CODEWORDBITCOUNT; i++) {
		printf("%d %d\n", i, convertCodeWordIndexToDataIndex(i));
	}
	// tests for convert check indexes 
	printf("convert check index test -----------\n");
	for (int i = 1; i <= CHECKBITCOUNT; i++) {
		printf("%d %d\n", i, convertCheckIndexToCodeWordIndex(i));
	}
	for (int i = 1; i <= CODEWORDBITCOUNT; i++) {
		printf("%d %d\n", i, convertCodeWordIndexToCheckIndex(i));
	}
}

void testcodewords() 
{
	int datawordscount = 4;
	unsigned datawords[] = { 0xFF, 0xA3, 0x00, 0x54 };
	printf("test code words----------------------------- - \n"); 
		for (int i = 0; i<datawordscount; i++) {
			unsigned data = datawords[i];
			unsigned check = calculateCheckWord(data);
			unsigned code = createCodeWord(data, check);
			unsigned data2 = extractDataWordFromCodeWord(code);
			unsigned check2 = extractCheckWordFromCodeWord(code);
			printf("data %x, chk %x, code %x, extdata %x, extchk %x\n",  data, check, code, data2, check2);
		}
}
void testcorrecterror() 
{
	int datawordscount = 4;
	unsigned datawords[] = { 0xEF, 0x11, 0x56, 0x9A };
	int databiterror[] = { 1,5,6,2 };
	printf("test code words------------------------------\n");
	for (int i = 0; i<datawordscount; i++) 
	{
		unsigned data = datawords[i];
		unsigned check = calculateCheckWord(data);
		unsigned code = createCodeWord(data, check);
		int errorpos = convertDataIndexToCodeWordIndex(databiterror[i]);
		unsigned codeerr = code;
		setBitValueAtIndex(&codeerr, errorpos,(getBitValueAtIndex(codeerr, errorpos) == 0x0) ? 0x1 : 0x0);
		unsigned dataerr = extractDataWordFromCodeWord(codeerr);
		unsigned datacorrected = extractCorrectedDataWord(codeerr);
		printf("data=%x, code=%x, error code=%x, error data=%x, corr data=%x\n",data, code, codeerr, dataerr, datacorrected);
	}
}

int main()
{
	//phaseOneTest();
	//testcodewords();
	testcorrecterror();
	system("pause");
}
