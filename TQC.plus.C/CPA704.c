#define TRIPLE(x) x*x*x;//結尾要有分號
//定義一個方程式

#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int num, triple_num;
	printf("請輸入一個整數: ");
	scanf("%d", &num);
	
	triple_num = TRIPLE(num);
	printf("%d的三次方為%d\n", num,triple_num);//參數少一個num
	
	triple_num = TRIPLE((4+1));
	//要清楚它的運作順序，需要先讓4+1處理完，所以我們將它括號起來
	printf("5的三次方為%d\n", triple_num);

	system("PAUSE");
     return 0;
}
