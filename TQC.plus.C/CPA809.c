#include<stdlib.h>
#include<stdio.h>

void sorting(int*, int);

int main(){

int arr[15];
int i;
printf("請輸入...\n");
for(i=0;i<15;i++)
{
	printf("arr[%d]: ",i);
	scanf("%d",&arr[i]);
}

sorting(arr,15);

printf("\n印出陣列:\n");
for(i=0;i<15;i++)
	printf("arr[%d]: %d\n",i,arr[i]);


	system("PAUSE");
	return 0;
}

void sorting(int* d,int n){
	int LN =n;
     int i,j,min,temp;
     for(i = 0 ; i < LN ; i++)
     {
      //先將一開始的位置寫入
      min=i;
      for(j=(i+1);j<LN;j++)
       if(d[j]<d[min])//如果比較到比它更小的，則將最小的寫入min
        min=j;
       //將兩數值互相交換
      temp = d[i];
      d[i] = d[min];
      d[min]=temp;
     }
}
