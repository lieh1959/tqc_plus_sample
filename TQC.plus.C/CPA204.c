#include <stdio.h>
#include <stdlib.h>

int main () 
{
    char ch= NULL; 
	
    printf("�аݱz������:�H�r����ܤ��O�p�U�G\nU:��ܤj�ǥ͡AM:��ܬ�s�͡AP:��ܳդh�� ");
    scanf("%c", &ch);
    switch (ch) {
		case 'U':
			printf("�z�O�j�ǥ�\n");break;
		case 'M':
			printf("�z�O��s��\n");break;
		case 'P':
			printf("�z�O�դh��\n");break;
		default:
			printf("�z��J���������T\n");
	}
	system("PAUSE");
     	return 0;
}
