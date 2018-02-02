#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int arr[2][3]={{100, 200, 300},{ 400, 500, 600}};//陣列是2x3的，所以要分配好成為二維陣列
	int *ptr2[2]={arr[0], arr[1]};
  	int i, j;
 
	
	for (i=0; i<2; i++) {
		for (j=0; j<3; j++) {
			printf("arr[%d][%d]=%d\n", i, j, arr[i][j]);
		}
 	}
	
	
	//另一種表示方法
	printf("\n另一種表示方法\n");
	for (i=0; i<2; i++) {
		for (j=0; j<3; j++) {
			printf("arr[%d][%d]=%d\n", i, j, *(arr[i]+j));//補上*讓他可以透過指標讀取值
		}
	}
	
	
	//第三種表示方法
	printf("\n第三種表示方法\n");
	for (i=0; i<2; i++) {
		for (j=0; j<3; j++) {
			printf("arr[%d][%d]=%d\n", i, j, *(*(ptr2+i)+j));//位置要補上*
		}
	}
 	
	system("PAUSE");
	return 0;
}
