/* TQC+ C - 603 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main ()
{
    char str2[]="Apple iPod";
    char str4[]="Apple iPad";
    int n;

    n=strcmp(str2, str4);
    /* 比較字串的函式strcmp()有區分大小寫 */
    if (n>0) {
        printf("%s大於%s\n", str2, str4);
    } else if (n==0) {
        printf("%s等於%s\n", str2, str4);
    } else {
        printf("%s小於%s\n", str2, str4);
    }

    n=strncmp(str2, str4,5);
    /* 比較前幾字的字串函式strncmp()有區分大小寫 */
    if (n > 0) {
        printf("%s前五個字元大於%s前五個字元\n", str2, str4);
    } else if (n==0) {
        printf("%s前五個字元等於%s前五個字元\n", str2, str4);
    } else {
        printf("%s前五個字元小於%s前五個字元\n", str2, str4);
    }
    system("PAUSE");

    return 0;
}
