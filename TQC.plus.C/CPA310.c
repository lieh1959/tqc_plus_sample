#include <stdio.h>
#include <stdlib.h>

int main () 
{
    int arr[5]={100, 200, 300, 400, 500};
	int i;
	
	printf("\n�}�C�������Ȧp�U:\n");
	for (i=0; i<5; i++)//i���_�l�Ȭ�0
	{
		 printf("arr[%d]=%d\n", i, arr[i]);
	}
	//%p�O�Ψ���ܦ�}���ѷ�
	printf("\n�}�C��������}�p�U:\n");
	for (i=0; i<5; i++) //i���_�l�Ȭ�0
	{
		 printf("&arr[%d]=%p\n", i, &arr[i]);
	}
//�o��O�N�C�@�Ӥ�����}��ܥX��
	
	printf("\n�}�C��������}�p�U:\n");
	for (i=0; i<5; i++)//i���_�l�Ȭ�0 
	{
		 printf("&arr[%d]=%p\n", i, arr+i);
	}
	
	system("PAUSE");
	return 0;
}
