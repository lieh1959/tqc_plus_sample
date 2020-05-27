/* TQC+ C - 107 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
	int a, b, c, d, e, f;
	printf("請輸入第一個整數? ");
	scanf("%d", &a);
	printf("請輸入第二個整數? ");
	scanf("%d", &b);
	printf("請輸入第三個整數? ");
	scanf("%d", &c);
	printf("請輸入第四個整數? ");
	scanf("%d", &d);
	printf("請輸入第五個整數? ");
	scanf("%d", &e);
	printf("請輸入第六個整數? ");
	scanf("%d", &f);

    //在這邊設定對齊預設是從右邊算起
	printf("\n向右靠齊\n");
	printf("%10d %10d %10d\n", a, b, c);
	printf("%10d %10d %10d", d, e, f);

    //在這邊設定對齊負號則是從左邊算起
	printf("\n\n向左靠齊\n");
	printf("%-10d %-10d %-10d\n", a, b, c);
	printf("%-10d %-10d %-10d", d, e, f);

	system("PAUSE");
	return 0;
}