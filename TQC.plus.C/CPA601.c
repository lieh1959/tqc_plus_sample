#include <stdio.h>
#include <stdlib.h>
#include <string.h>//�]���n�ϥΨ�r�ꪺ�[���w�A�ݭninclude <string.h>

int main () 
{
     char str[]="Apple iPhone 4";
	char pstr2[20]="Apple";
	char pstr1[]=" iPod";
	char str3[20];
	
	printf("str�r�ꪺ���׬O%d\n", strlen(str));//�Ъ`�N��ƦW�٭n���T�Astrlen()�ΨӨ��o�r�����
	printf("pstr2�s��pstr1�᪺�r�ꬰ:%s\n", strcat(pstr2, pstr1));//�Ъ`�N��ƦW�٭n���T�Astrcat()�N�᭱���r���b�e�����r���
	printf("str3�r��p�U:%s\n", strcpy(str3, pstr1));//�Ъ`�N��ƦW�٭n���T�Astrcpy(str3, pstr1)�A�N�᭱���r��ƻs��e�����r��
	
	system("PAUSE");
	return 0;
}
