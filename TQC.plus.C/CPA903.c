#include<stdlib.h>
#include<stdio.h>

//宣告函數
int greater60(int* ,int );

int main(){
	int data[6];
	int i;
	for(i=0;i<6;i++){
	printf("請輸入第%d個分數:",(i+1));
	scanf("%d",&data[i]);
	}

	printf("您輸入的資料如下:\n");
	for(i=0;i<6;i++){
	printf("\ndata[%d]:%d",i,data[i]);
	}
	printf("\n大於60分得有:%d個",greater60(data,6));

system("PAUSE");
return 0;
}

int greater60(int* parr,int n){
	int i,c=0;
	for(i=0;i<n;i++)
	{
		if(parr[i]>=60)
			c++;
	}
	return c;
}