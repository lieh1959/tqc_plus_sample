//CPA801-3
#include<stdio.h>
#include<stdlib.h>

int main ()
{
int i,j;

for(i=1;i<=5;i++)//�����Д�
{
	int sp=5-i;//һ�ЃȵĿհ׺���̖�����ǻ��a��
	for(;sp>0;sp--)//���ƿհה�
		printf(" ");
	for(j=0;j<i;j++)//������̖��
		printf("*");
	printf("\n");
}


system("PAUSE");
return 0;
}