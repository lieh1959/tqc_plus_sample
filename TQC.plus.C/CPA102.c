/* TQC+ C - 102 */

#include <stdio.h>
#include <stdlib.h>

int main()
{
	double a, b;
	printf("請輸入兩個浮點數:");
	scanf("%lf %lf", &a, &b);
	/* 在scanf時，後面的參照務必要補上&符號
 	 * %lf與%f輸出時，都是浮點數之義
 	 * 但輸入時，%lf代表double，%f代表float
 	 */
 	double total ;
 	total = a+b;
 	printf("total=%f", total);
 	system("PAUSE");

 	return 0;
}
