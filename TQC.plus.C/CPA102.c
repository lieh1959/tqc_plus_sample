#include <stdio.h>
#include <stdlib.h>

int main()
{
	double a, b;
	printf("�п�J��ӯB�I��:");
	scanf("%lf %lf", &a, &b);//�bscanf�ɡA�᭱���ѷӰȥ��n�ɤW&�Ÿ�
	//%lf�P%f��X�ɡA���O�B�I�Ƥ��q�A����J�ɡA%lf�N��double�A%f�N��float
	double total ;
	total = a+b;
	printf("total=%f", total);
	system("PAUSE");
	return 0;
}
