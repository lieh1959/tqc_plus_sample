#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int num=100, *pointer;
	
	pointer=&num;//�o��O�n����Ц�}�g�L�h
	
	printf("num=%d, *pointer=%d\n", num, *pointer);
	system("PAUSE");
	return 0;
}
