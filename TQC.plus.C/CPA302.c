/* TQC+ C - 302 */

#include <stdio.h>
#include <stdlib.h>

int adjust(int);

int main ()
{
    int score, final;

    printf("請輸入您的分數: ");
    scanf("%d", &score);

    final = adjust(score);
    /* 記得要將傳回來的分數寫入final變數中 */

    printf("調整後的分數: %d", final);
    system("PAUSE");

    return 0;
}

int adjust(int score)
{
    int temp;  /* 宣告變數 */

    if (score >= 60)
        temp = score + 5;
    else
        temp = score + 10;

    return temp;
}
