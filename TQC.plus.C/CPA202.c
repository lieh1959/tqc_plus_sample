/* TQC+ C - 202 */

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int score, adjust;

	printf("請輸入分數:");
	scanf("%d", &score);
	if (score >= 60)//注意if(...)條件式後面不可以有分號
	    adjust = score + 10;
	else
	    adjust = score + 5;
	printf("調整後的分數為%d", adjust);
	system("PAUSE");

	return 0;
}
