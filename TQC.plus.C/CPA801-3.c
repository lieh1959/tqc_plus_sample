//CPA801-3
#include<stdio.h>
#include<stdlib.h>

int main ()
{
int i,j;

for(i=1;i<=5;i++)//控制行數
{
	int sp=5-i;//一行內的空白和星號數量是互補的
	for(;sp>0;sp--)//控制空白數
		printf(" ");
	for(j=0;j<i;j++)//控制星號數
		printf("*");
	printf("\n");
}


system("PAUSE");
return 0;
}