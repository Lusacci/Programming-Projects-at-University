#include<stdio.h>
#include<math.h>

int main(int argc, char*argv[])
{
	FILE *ptr_file = fopen(argv[1], "r");
	unsigned x; //address
	unsigned y; //number of addresses;
	int no_oflines;

	// I am not going to allocate memory of an array because it is simply not required.
	while (fscanf(ptr_file, "%u", &x)!=EOF) //not end of file.
	{
		no_oflines++;
	}
	printf("Number of Translated Addresses: %u\n", no_oflines);
	printf("Address\tPageNumber\tOffset\n");
	ptr_file = fopen(argv[1], "r");
	while (fscanf(ptr_file, "%u", &x) != EOF) 
	{
		printf("%u\t %u\t %u\n", x, x>>12, x&(unsigned)(pow(2,12)-1));
	}

	printf("***DONE***\n");
	fclose(ptr_file);
	return 0;
}
