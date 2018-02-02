#include <stdio.h>
#include <stdlib.h>

double sum(double a[], int n);
int main () 
{
	double arr[5];
	int i;
	double total=0;//改為double變數
	for(i=0; i<5; i++) {
		  printf("請輸入陣列arr[%d]元素值: ", i);
		  scanf("%lf", &arr[i]);//加上&參照
	}
	
	for(i=0; i<5; i++)
		  printf("arr[%d]=%.2f\n", i, arr[i]);
	
	total=sum(arr,i);
	printf("此陣列的總和為%.2f\n", total);
	system("PAUSE");
	return 0;
}

double sum(double a[], int n)//修改傳入參數的型態double
{
	int k;
	double tot=0;//設定加總初始值0
	for(k=0; k<n; k++)
        tot += a[k];
	return tot;
}

