#include <stdio.h>
#include <stdlib.h>

void change(int *, int *);

int main ( ) 
{
	int i=100, j=200;
	printf("�洫�ei�Pj����: \n");
	printf("i=%d, j=%d\n", i, j);
	
	change(&i, &j);//���X�O�����}
	printf("�洫��i�Pj����: \n");
	printf("i=%d, j=%d\n", i, j);
	
	system("PAUSE");
	return 0;
}

void change(int *x, int *y)//������O�����}
{
     	int temp;//�]�w�@�Ӿ���ܼ�
     	temp=*x;//��O���餤����Ƽg�i�h
		
     	*x=*y;//��x����}�令y��
     	*y=temp;//��Ȧs���F��A�g�Jy�O����
}
