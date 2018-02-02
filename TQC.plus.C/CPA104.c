#include <stdio.h>
#include <stdlib.h>

int main()
{
	int unit;
	double price=23.34;
	double total;
	printf("請問您要買幾瓶蘋果汁? ");
	scanf("%d", &unit);
	total = unit*price;
	//因為%這個符號在程式碼中有點參照的意思，所以直接讓它print是無法顯示的，所以必須輸入%%讓它可以顯示出來
	printf("我買了%d瓶100%%的蘋果汁\n", unit);
	printf("花了%f元", total);
	system("PAUSE");
	return 0;
}
