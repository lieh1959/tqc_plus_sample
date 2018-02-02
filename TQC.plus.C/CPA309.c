#include <stdio.h>
#include <stdlib.h>

int max(int a[], int n);
int main () 
{
	int arr[5], i, maximum;
	
	for(i=0; i<5; i++) {
		 printf("請輸入陣列arr[%d]元素值: ", i);
		 scanf("%d", &arr[i]);//建議把這邊的換行符號刪除
	}
	
	for(i=0; i<5; i++)
		 printf("arr[%d]=%d\n", i, arr[i]);
	
	maximum=max(arr, 5);
	printf("此陣列最大值為%d\n", maximum);
	system("PAUSE");
	return 0;
}

int max(int a[], int n)
{
	int k, M;
	M=a[0];
	for(k=1; k<n; k++){
		if (a[k]>M) {//如果大於臨時變數M，則替代M的值
			M=a[k];
		}
 	}
	return M;
}

