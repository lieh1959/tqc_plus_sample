#include <stdio.h>
#include <stdlib.h>

void Star();//ӛ���a�Ϸ�̖
//C�Z�����O�������r�����Ϸ�Ҫ������һ�Σ�֮����main���·�׫�������Ĺ���

int main () 
{
	printf("����ӡ�����ǵĺ���!!!\n");
	Star();
	printf("��ϲ�g�WC��ʽ�Z��\n");
	Star();
	printf("�Y�������ĺ���!!!\n");
	system("PAUSE");
	return 0;
}

void Star()
{
	int i;
	for(i=1; i<=30; i++)
	printf("*");
	printf("\n");
}
