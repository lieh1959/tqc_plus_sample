/* TQC+ C - 601 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>  /* 因為要使用到字串的涵式庫，需要include <string.h> */

int main ()
{
    char str[]="Apple iPhone 4";
    char pstr2[20]="Apple";
    char pstr1[]=" iPod";
    char str3[20];

    printf("str字串的長度是%d\n", strlen(str));
    /* 請注意函數名稱要正確，strlen()用來取得字串長度 */
    printf("pstr2連結pstr1後的字串為:%s\n", strcat(pstr2, pstr1));
    /* 請注意函數名稱要正確，strcat()將後面的字串串在前面的字串後 */
    printf("str3字串如下:%s\n", strcpy(str3, pstr1));
    /* 請注意函數名稱要正確，strcpy(str3, pstr1)，將後面的字串複製到前面的字串 */
    system("PAUSE");

    return 0;
}
