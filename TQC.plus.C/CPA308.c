#include <stdio.h>
#include <stdlib.h>

double sum(double a[], int n);
int main () 
{
	double arr[5];
	int i;
	double total=0;//�אּdouble�ܼ�
	for(i=0; i<5; i++) {
		  printf("�п�J�}�Carr[%d]������: ", i);
		  scanf("%lf", &arr[i]);//�[�W&�ѷ�
	}
	
	for(i=0; i<5; i++)
		  printf("arr[%d]=%.2f\n", i, arr[i]);
	
	total=sum(arr,i);
	printf("���}�C���`�M��%.2f\n", total);
	system("PAUSE");
	return 0;
}

double sum(double a[], int n)//�ק�ǤJ�Ѽƪ����Adouble
{
	int k;
	double tot=0;//�]�w�[�`��l��0
	for(k=0; k<n; k++)
        tot += a[k];
	return tot;
}

