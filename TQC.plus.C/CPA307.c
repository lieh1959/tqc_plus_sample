#include <stdio.h>
#include <stdlib.h>

int main()
{
	double arr2[2][3], total=0.0;
	int i, j;
	
	for (i=0; i<2; i++)//宣告大小為2時，裡面的index僅有0和1所以判斷時僅需要小於2即可 
		for (j=0; j<3; j++) {//判斷式方法同上
			printf("請輸入arr[%d][%d]的值: ", i, j);
			scanf("%lf", &arr2[i][j]);//輸入時%lf是輸入double用的，而且後面的參照必須要加上&
			total += arr2[i][j];
		}
	
	printf("總和為%.2f\n", total);
	system("PAUSE");
	return 0;
}

