#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define random(x) rand()%x+1 //�üƭn�q1~100�A�ҥH�ݭn�]�w�� rand()%x+1 �Arand()%x ��0~99

int main() 
{
	int i, j;
	int x;
	printf("�H���ƪ��̤j�Ȭ�: ");
	scanf("%d", &x);
	for (i=0; i<5; i++) {//��l��i=0�}�l
		for (j=0; j<4; j++) {//��l��i=0�}�l
			printf("%5d ", random(x));
		}
		printf("\n");
	}
	system("PAUSE");
	return 0;
}
