#include <stdio.h>
#include <stdlib.h>

int main () 
{
	char string[20];
	double output;
	printf("�п�J�@�Ʀr���r��: ");
	scanf("%s", string);
 
	output=atof(string);//atoi()�O�N�r���নint�榡�Aatof�����ন�B�I��

     printf("%s�ഫ�᪺�B�I�Ƭ�%f\n", string, output);
	system("PAUSE");
     return 0;
}

