#include<stdio.h>
#include<stdlib.h>

int main(){
	int choice;
	printf("(1)�б�\n(2)�Ʊб�\n(3)�U�z�б�\n(4)�����O\n(5)����\n�п�J�z��¾�٥N��:");
	scanf ("%d",&choice);
	while(choice!=5){//�u�n�ϥΪ̨S����J��5�A���|����h�߰�
	switch (choice)//�`�Nswitch case���ϥΤ�k
	{
	case 1:	printf("\n�z��¾�٬O�б�\n");break;
	case 2:	printf("\n�z��¾�٬O�Ʊб�\n");break;
	case 3:	printf("\n�z��¾�٬O�U�z�б�\n");break;
	case 4:	printf("\n�z��¾�٨S���b�o�ǿﶵ��\n");break;
	case 5:	break;
	}
	printf("\n(1)�б�\n(2)�Ʊб�\n(3)�U�z�б�\n(4)�����O\n(5)����\n�п�J�z��¾�٥N��:");
	scanf ("%d",&choice);
	}

system ("PAUSE");
return 0;
}