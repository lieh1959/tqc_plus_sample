#include <stdio.h>
#include <stdlib.h>
#include <conio.h>//�o�䦳�Ψ�getche()���\��A�ҥH����include <conio.h>
#include <ctype.h>//�^��r�������ഫ�ݭninclude<ctype.h>

int main () 
{
 	char ch, ch2;
	printf("�п�J�@�p�g���^��r��: ");
	ch=getche();//getche()�o�Ө禡�u�n�@�����즳�r����J�A�N�|�ߧYŪ�J
	
	//�N�U�C���r���ର�j�g
	ch2=toupper(ch);//�^��p�g�ন�j�g���禡toupper()
	printf("\n%c���j�g�O%c", ch, ch2);
	
 	//�N�U�C���r���ର�p�g
	printf("\n�п�J�@�j�g���^��r��: ");
	scanf("%c", &ch);
	ch2=tolower(ch);
	printf("%c���p�g�O%c\n", ch, ch2);
	
	system("PAUSE");
	return 0;
}
