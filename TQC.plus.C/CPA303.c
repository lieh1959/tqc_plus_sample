#include <stdio.h>
#include <stdlib.h>

int num = 100;

void subFun();
int main()
{
	int num = 200;//�]�w�@�Ӱϰ��ܼ�
	printf("�bmain��Ƥ���num��%d\n", num);
	subFun();
	
	system("PAUSE");
	return 0;
}

void subFun()//�]���S���n�^�ǡA�ҥH�]�w��void�N�n
{
	printf("�bsubFun��Ƥ���num��%d\n", num);

}

