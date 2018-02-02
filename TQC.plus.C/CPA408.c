//題目: 指標與函數的關係，以輸入函數讀取資料，
//然後找出陣列的最大值在何處

/* 輸出結果的樣本如下所示：
 
 請輸入arr[0]元素值: 100
 請輸入arr[1]元素值: 200
 請輸入arr[2]元素值: 300
 請輸入arr[3]元素值: 400
 請輸入arr[4]元素值: 500
 
 陣列的元素值分別如下:
 arr[0]=100
 arr[1]=200
 arr[2]=300
 arr[3]=400
 arr[4]=500
 
 此陣列的最大值為500 
 */

/* 若下一程式執行時與上述的輸出結果有異時，請加以更正之 */

#include <stdio.h>
#include <stdlib.h>

int Max(int *, int n);

int main ( ) 
{
     	int arr[5];
	int maximum, i;
	
 	for (i=0; i<5; i++) {
		  printf("請輸入arr[%d]元素值: ", i);
		  scanf("%d", &arr[i]);
	}
	
	printf("\n陣列的元素值分別如下:\n");
	for (i=0; i<5; i++) {
		  printf("arr[%d]=%d\n", i, arr[i]);
	}
 	
	maximum=Max(arr, 5);
 	printf("\n此陣列的最大值為%d\n", maximum);
	
	system("PAUSE");
	return 0;
}

int Max(int *p, int n)
{
    	int i, maxi_value=*p;//將第一個值先當作最大的值寫入
    	for (i=1; i<n; i++) {//因為arr[0]已經寫進去過了，所以直接從arr[1]開始比較
			                 //然後判斷，陣列大小五的話，僅需比較到4，index值0~4
		 if (maxi_value < *(p+i)) {//如果大於最大值，才改寫
			maxi_value=*(p+i);
		 }
 	}
	return maxi_value;
}
