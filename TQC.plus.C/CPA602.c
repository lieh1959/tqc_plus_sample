/* TQC+ C - 602 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main ()
{
    char str2[]="Apple iPod";
    char str4[]="Apple iPad";
    int n;

    n=strcmp(str2, str4);
    /* strcmp()比較字串的函式，如果前面大於後面則是true=1，相等為0，小於則是-1 */
    if (n > 0) {
        printf("%s大於%s\n", str2, str4);
    } else if (n == 0) {  /* 條件式相等用== */
        printf("%s等於%s\n", str2, str4);
    } else {
        printf("%s小於%s\n", str2, str4);
    }

    n=strncmp(str2, str4, 5);
    if (n>0) {
        printf("%s前五個字元大於%s前五個字元\n", str2, str4);
    } else if (n==0) {//條件式相等用==
        printf("%s前五個字元等於%s前五個字元\n", str2, str4);
    } else {
        printf("%s前五個字元小於%s前五個字元\n", str2, str4);
    }
    system("PAUSE");

    return 0;
}
