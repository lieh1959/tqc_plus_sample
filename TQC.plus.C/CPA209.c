#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int i=1, total=0;//要設定加總的初始值為0 
	do {
	if(i%2==1)//設定條件，如果為奇數才進去加總
	total += i;
	i++;//修改邏輯，要先加進去，才能++
	} while (i<=100);//切記do-while的判斷式後面一定要加分號
	
	printf("1到100的奇數和: %d\n", total);
	system("PAUSE");
     return 0;
}
