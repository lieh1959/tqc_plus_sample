//CPA801-2
#include<stdio.h>
#include<stdlib.h>

int main ()
{
	int i,j=5, k;
for(i=1;i<=5;i++){//控制行數

	for(k=j;k>0;k--)//控制幾顆星
	{printf("*");}
	j--;
printf("\n");

}
system("PAUSE");
return 0;
}