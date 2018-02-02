#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(){
char a[30],b[30],c[30],cmp;
printf("請輸入字串A:");
gets(a);//這邊在讀取字串時，因為要考量到使用者會輸入空白字元，所以無法用scanf()，我們必須使用gets()的函數

printf("字串A的長度:%d",strlen(a));
strcpy(b,a);//複製字串的函數
printf("\n字串B:%s",b);
printf("\n請輸入字串C:");
gets(c);

cmp = strcmp(c,a);//比較字串大小的函數
//前面大於後面，結果為1
//相等，結果為0
//前面大於後面，結果為-1


if(cmp==1)
	printf("字串A小於字串C");
else if(cmp==-1)
	printf("字串C小於字串A");
else
	printf("字串C等於字串A");

	
system("PAUSE");
return 0;
}

