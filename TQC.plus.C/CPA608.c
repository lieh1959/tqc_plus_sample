#include <stdio.h>
#include <stdlib.h>

int main () 
{
     char str[]="Apple iPhone 4";//�ЧR����l�����׳]�w�A���M�N�]�w��r���������
	char sttr[]={'i', 'P', 'a', 'd','\0'};//�]���n��X�r��A�r�ꪺ�����O�H'\0'�@������
	char *pstr="Apple iPod";
  
	printf("str�r��p�U: %s\n", str);
	printf("sttr�r��p�U: %s",sttr);

     printf("\npstr�r��p�U: %s\n", pstr);//�ɤW�@�Ӵ���Ÿ�
	system("PAUSE");
     return 0;
}
