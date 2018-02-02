#include <stdio.h>
#include <stdlib.h>

int main ()
{
	int a, b, c, d;
  	printf("請輸入第一個整數? ");
	scanf("%d", &a);
	printf("請輸入第二個整數? ");
	scanf("%d", &b);
	printf("請輸入第三個整數? ");
	scanf("%d", &c);
	printf("請輸入第四個整數? ");
	scanf("%d", &d);

	printf("此式的餘數為%d\n", ((a+b)/2-(c+d)/2) % 2);
	//在此僅需要將數字括號分配好，便可以進行先乘除後加減
	system("PAUSE");
 	return 0;
}

