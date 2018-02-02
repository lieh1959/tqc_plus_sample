#include <stdio.h>
#include <stdlib.h>

void callFun();
int main()
{
	int i;
	for (i=1; i<=5; i++) {
		  callFun();
	}

	system("PAUSE");
	return 0;
}

void callFun()
{
	int ai=100;
	static int si=100;
	//在這邊將si變成static 全域變數，讓他變成所有區域都看得懂，所以宣告過後，再次宣告就沒意義，因此會將它進行累加。
	ai++;
	si++;
	printf("ai=%d, si=%d\n", ai, si);//要補上換行符號
}
