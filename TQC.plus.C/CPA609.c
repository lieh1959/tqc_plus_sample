#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main () 
{
 	char str1[40]="iPhone 4";
 	char str2[40]="Apple iPod";
    char str3[40]="Apple ";
	char str4[40];
		
	strncat(str3, str1, 6);
	strncpy(str4, str2+6, 5);//��str2�}�C�q�Ĥ��Ӧr��}�lŪ�A�M�����MiPod�u���|�Ӧr�A���O�]���r�굲����\0�A�ҥH�n�@��Ū�i��
	
 	printf("%s\n", str3);
  	printf("%s\n", str4);

	system("PAUSE");
	return 0;
}
