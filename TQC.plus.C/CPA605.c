#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main () 
{
 	char ch, ch2;
	printf("�п�J�@�p�g���^��r��: ");
	scanf("%c", &ch);//�ɤW&���ѷ�
	
	//�N�U�C���r���ର�j�g
	ch2=toupper(ch);
	printf("%c���j�g�O%c", ch, ch2);
	
	
	 while (getchar() != '\n') {
		 //�o��D�n�O�n�N�ϥΪ̦h��J���F��q�w�İϮ��ӱ�
		 //�p�G�S���o�@�䪺�ܡA�U���A�@���ϥ�getchar()�Bscanf()�h�|�q�w�İ�Ū���|���Χ����r
	     continue;
	 }
	 
	
 	//�N�U�C���r���ର�p�g
	printf("\n�п�J�@�j�g���^��r��: ");
	scanf("%c", &ch);//�ɤW&���ѷ�
	ch2=tolower(ch);
	printf("%c���p�g�O%c", ch, ch2);
	
	system("PAUSE");
	return 0;
}
