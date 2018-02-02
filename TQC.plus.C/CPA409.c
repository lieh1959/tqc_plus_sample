//題目: 指標與函數的關係

/* 輸出結果的樣本如下所示：
 請輸入arr[0][0]: 10
 請輸入arr[0][1]: 20
 請輸入arr[0][2]: 30
 請輸入arr[1][0]: 40
 請輸入arr[1][1]: 50
 請輸入arr[1][2]: 60
 
 陣列之值如下:
 arr[0][0]=10
 arr[0][1]=20
 arr[0][2]=30
 arr[1][0]=40
 arr[1][1]=50
 arr[1][2]=60
 
 此陣列的總和為210
*/

/* 若下一程式執行時與上述的輸出結果有異時，請加以更正之 */


#include <stdio.h>
#include <stdlib.h>

int sum(int *p, int n, int m);

int main ( ) 
{
     int arr2[2][3];
	 int *pointer=arr2[0];//將陣列的第一個未止寫進去指標
	 
	int total, i, j;
	
	for (i=0; i<2; i++) {
		  for (j=0; j<3; j++) {
		      printf("請輸入arr[%d][%d]: ", i, j);
		      scanf("%d", &arr2[i][j]);//要補上&參照
		  }
	}
	
	printf("\n陣列之值如下:\n");
	for (i=0; i<2; i++) {
		  for (j=0; j<3; j++) {
		      printf("arr[%d][%d]=%d\n", i, j, arr2[i][j]);
		  }
	}
 	
	total=sum(pointer, 2, 3);
 	printf("\n此陣列的總和為%d\n", total);
	
	system("PAUSE");
	return 0;
}

int sum(int *p, int x, int y)//改寫參數型態
{
	int i, j, tot=0;
	for (i=0; i<(x*y); i++) {//總共有幾個元素(x乘以y)個
		tot += *(p+i);//透過指標指向記憶體取出值
	}
	return tot;
}
