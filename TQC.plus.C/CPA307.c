#include <stdio.h>
#include <stdlib.h>

int main()
{
	double arr2[2][3], total=0.0;
	int i, j;
	
	for (i=0; i<2; i++)//�ŧi�j�p��2�ɡA�̭���index�Ȧ�0�M1�ҥH�P�_�ɶȻݭn�p��2�Y�i 
		for (j=0; j<3; j++) {//�P�_����k�P�W
			printf("�п�Jarr[%d][%d]����: ", i, j);
			scanf("%lf", &arr2[i][j]);//��J��%lf�O��Jdouble�Ϊ��A�ӥB�᭱���ѷӥ����n�[�W&
			total += arr2[i][j];
		}
	
	printf("�`�M��%.2f\n", total);
	system("PAUSE");
	return 0;
}

