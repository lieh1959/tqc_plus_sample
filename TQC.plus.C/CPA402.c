#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int num=100;
	int *pointer=&num;//�ɤW&�A�]�nŪ����}�A�D��
 	
	printf("num=%d, *pointer=%d\n", num, *pointer);
	system("PAUSE");
	return 0;
}
