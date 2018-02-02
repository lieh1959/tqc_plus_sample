//CPA901-1
#include<stdlib.h>
#include<stdio.h>

void exchange(int* ,int* );
int main(){
	int a,b;
	printf("請輸入兩個數字(數字跟數字中間請以空白間隔)");
	scanf("%d %d",&a,&b);
	printf("\na:%d b:%d",a,b);
	exchange(&a,&b);
	printf("\na:%d b:%d",a,b);
system("PAUSE");
return 0;
}

void exchange(int* a,int* b){//將記憶體位址做調換的動作
	int temp;
	temp = *a;
	*a =*b ;
	*b=temp;
}
