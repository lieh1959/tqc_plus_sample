//CPA805-2
#include<stdlib.h>
#include<stdio.h>

int main(){

	int arr[5][2];
	int i,j,tot=0;
	for(i=0;i<5;i++)//����C
	{
		printf("�п�J��ӼƦr(�Ʀr�����ХH�ťլ����j):");
		for(j=0;j<2;j++)//�����
		{
			scanf("%d",&arr[i][j]);
			tot+=arr[i][j];
		}
		printf("\n");
	}
	for(i=0;i<5;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d ",arr[i][j]);
		}
		printf("\n");
	}
	printf("sum:%d\n",tot);
	system("PAUSE");
	return 0;
}