#include<stdlib.h>
#include<stdio.h>

double average(double* ,int );

int main(){
	int i;
	double cc[6],ans;
	for(i =0;i<6;i++)
	{
		printf("�п�J��%d�ӯB�I��:",(i+1));
		scanf("%lf",&cc[i]);
	}
	printf("\n�z��J���}�C�Ȧp�U\n");
	for(i =0;i<6;i++)
		printf("\ndata[%d]:%.2f",i,cc[i]);
	ans = average(cc,6);
	printf("\n����:%.2f",ans);
	system("PAUSE");
	return 0;
}

double average(double* arr2,int n){//�}�C�ǰѼƤ覡�A�ϥΫ���
	double total=0;
	int i ;
	for(i=0;i<n;i++ )
		total+=*(arr2+i);//�`�N���ЩI�s���Ф�����
	total/=n;
	return total;
}