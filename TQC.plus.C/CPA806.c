#include<stdlib.h>
#include<stdio.h>

void multiply(int);
void printStar(int);

int main(){

	int m,s;
	printf("請輸入您要幾成己的乘法表(最多10):");
	scanf("%d",&m);
	printf("\n請輸入您要幾個星星(*):");
	scanf("%d",&s);
	printStar(s);
	if(m<=10)//要控制好，10以下(含)才顯示
	multiply(m);
	printStar(s);
	system("PAUSE");
	return 0;
}

void multiply(int n){//乘法函數
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
			printf("%d* %d=%2d  ",i,j,(i*j));
		printf("\n");
	}
}

void printStar(int n)//星號列印函數
{
	int i;
	for(i=0;i<n;i++)
	printf("*");
	printf("\n");
}