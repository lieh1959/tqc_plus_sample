//CPA801-4
#include<stdio.h>
#include<stdlib.h>

//�@�}�ⷨ�H����һ�}��Щ����ѣ�����̖���հ׵Č�����΢���Q����
int main ()
{
int i,j;

for(i=0;i<=5;i++)//�����Д�
{
	int sp=5-i;//һ�ЃȵĿհ׺���̖�����ǻ��a��
	for(j=0;j<i;j++)//���ƿհה�
		printf(" ");
	for(;sp>0;sp--)//������̖��
		printf("*");

	printf("\n");
}


system("PAUSE");
return 0;
}