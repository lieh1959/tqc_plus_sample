struct student {
	char name[20];
	int score;
};

typedef struct student ST;//�`�N�w�q������

#include <stdio.h>
#include <stdlib.h>
#include <string.h>//�]���ڭ̭n�ϥ�string�����

int main () 
{
	ST stname;
	
 	strcpy(stname.name , "Jonh");//�N�r��ƻs�i�h�ӰO����
	stname.score = 90;
	
  	printf("%s�����Ƭ�%d\n", stname.name, stname.score);

	system("PAUSE");
     return 0;
}

