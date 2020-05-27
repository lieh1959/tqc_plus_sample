/* TQC+ C - 110 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
	int a, b, c;
	printf("請輸入變數a的值: ");
	scanf("%d", &a);
	printf("請輸入變數b的值: ");
	scanf("%d", &b);
	printf("請輸入變數c的值: ");
	scanf("%d", &c);

 	printf("%d\n", 60<=a && a<100);
 	/* 判斷a是否大於等於60且小於100，若是，則輸出1, 否則，輸出0
 	 * C語言中，0是false，1是true
 	 */
	printf("%f\n", ++b/10.);
	/* 先將b加1後，再除以10. */

	printf("%d\n", a>c?a:c);
	/* 判斷a是否大於c，若是，則印出a，否則，印出c */
 	/* 判斷式?是:否 。如果判斷式成立，則顯示"是"，不成立則顯示"否" */

	system("PAUSE");

	return 0;
}
