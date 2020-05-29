/* TQC+ C - 608 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    char str[]="Apple iPhone 4";
    /* 請刪除初始的長度設定，不然就設定比字串長的長度 */
    char sttr[]={'i', 'P', 'a', 'd','\0'};
    /* 因為要輸出字串，字串的結尾是以'\0'作為結尾 */
    char *pstr="Apple iPod";

    printf("str字串如下: %s\n", str);
    printf("sttr字串如下: %s",sttr);

    printf("\npstr字串如下: %s\n", pstr);
    /* 補上一個換行符號 */
    system("PAUSE");

    return 0;
 }
