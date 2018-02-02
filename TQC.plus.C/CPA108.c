#include <stdio.h>
#include <stdlib.h>

int main ()
{
	double a, b, c, d, e, f;
  	printf("請輸入第一個浮點數: ");
	scanf("%lf", &a);
  	printf("請輸入第二個浮點數: ");
	scanf("%lf", &b);
  	printf("請輸入第三個浮點數: ");
	scanf("%lf", &c);
  	printf("請輸入第四個浮點數: ");
	scanf("%lf", &d);
  	printf("請輸入第五個浮點數: ");
	scanf("%lf", &e);
  	printf("請輸入第六個浮點數: ");
	scanf("%lf", &f);

	printf("\n向右靠齊\n");//要設定好小數點下面幾位
	printf("%10.2f %10.2f %10.2f\n", a, b, c);
	printf("%10.2f %10.2f %10.2f\n", d, e, f);

	printf("\n\n向左靠齊\n");
	printf("%-10.2f %-10.2f %-10.2f\n", a, b, c);
	printf("%-10.2f %-10.2f %-10.2f\n", d, e, f);

	system("PAUSE");
 	return 0;
}
