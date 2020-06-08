/* TQC+ C - 703 */

#define NTRATE 31.34;
/* 符號常數：這行指令表示以NTRATE代替31.34 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    double USdollar, NTdollar;

    printf("請輸入您有多少美金: ");
    scanf("%lf", &USdollar);
    /* 是要讀入double，所以要用%lf */
    NTdollar = USdollar * NTRATE;
    printf("您可以換%.2f台幣\n", NTdollar);
    system("PAUSE");

    return 0;
}
