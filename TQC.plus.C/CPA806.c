#include<stdlib.h>
#include<stdio.h>

void multiply(int);
void printStar(int);

int main(){

	int m,s;
	printf("�п�J�z�n�X���v�����k��(�̦h10):");
	scanf("%d",&m);
	printf("\n�п�J�z�n�X�ӬP�P(*):");
	scanf("%d",&s);
	printStar(s);
	if(m<=10)//�n����n�A10�H�U(�t)�~���
	multiply(m);
	printStar(s);
	system("PAUSE");
	return 0;
}

void multiply(int n){//���k���
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
			printf("%d* %d=%2d  ",i,j,(i*j));
		printf("\n");
	}
}

void printStar(int n)//�P���C�L���
{
	int i;
	for(i=0;i<n;i++)
	printf("*");
	printf("\n");
}