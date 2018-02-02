#include <stdio.h>
#include <stdlib.h>

int main()
{
	int i;
	printf("請輸入i值: ");
	scanf("%d", &i);
	if (i%2==0)//判斷是否相同使用==，非數學符號的=
		   printf("%d是偶數\n", i);
	else
		   printf("%d是奇數\n", i);

	system("PAUSE");
     return 0;
}
