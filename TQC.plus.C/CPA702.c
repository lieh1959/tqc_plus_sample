#include <stdio.h>
#include <stdlib.h>

int main () 
{
	char string[20];
	int output;//�Ыŧi��int
	printf("�п�J�@�Ʀr���r��: ");
	scanf("%s", string);
	
	output=atoi(string);
     printf("%s�ഫ�᪺��Ƭ�%d\n", string, output);//��ܪ������A�n�令%d
	system("PAUSE");
     return 0;
} 
