#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int i=0, total=0;//設定i的初始值為0，加總的初始值也設定為0 
	do {
	i+=2;
	total += i;
	} while (i<100);
	//在這邊最後一輪的i值為100，但碰到最後的判斷是，因為100沒有小於100，所以不會在下一輪
	
     printf("1到100的偶數和: %d\n", total);
	system("PAUSE");
     return 0;
}
