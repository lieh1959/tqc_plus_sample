#include <stdio.h>
#include <stdlib.h>

int main () 
{
    char str[20];//�ɤW�}�C�j�p
	char *pstr;
 	printf("�п�Jstr�r��: ");
	scanf("%s", str);
	
	printf("�п�Jpstr�r��: ");
	pstr=(char *)malloc(sizeof(char)*20);//�ʺA�O����t�m�A�M��ɤW�j�p
	
	scanf("%s", pstr);
	printf("\n�z��Jstr�r��p�U: %s\n", str);
	printf("�z��Jpstr�r��p�U: %s\n", pstr);
    system("PAUSE");
    return 0;
}
 

  
