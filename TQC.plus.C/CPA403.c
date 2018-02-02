#include <stdio.h>
#include <stdlib.h>

int main () 
{
     int arr[]={100, 200, 300, 400, 500};
	int *pointer=arr;
	int i;
 	
	for (i=0; i<5; i++) {
		printf("arr[%d]=%d\n", i, arr[i]);
	}
	
	//另一種表示方法
	printf("\n另一種表示方法\n");
	for (i=0; i<5; i++) {
		printf("arr[%d]=%d\n", i, *(arr+i));//因為要取位址，所以要把相關的變數括好
	}
	
	//第三種表示方法
	printf("\n第三種表示方法\n");
	for (i=0; i<5; i++) {
		printf("arr[%d]=%d\n", i, *(pointer+i));//這邊的話，因為pointer已經導向arr的記憶體位址，所以用法跟上面一樣
	}
	
	system("PAUSE");
	return 0;
}
