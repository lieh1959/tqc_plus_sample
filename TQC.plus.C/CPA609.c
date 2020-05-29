/* TQC+ C - 609 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main ()
{
    char str1[40]="iPhone 4";
    char str2[40]="Apple iPod";
    char str3[40]="Apple ";
    char str4[40];

    strncat(str3, str1, 6);
    strncpy(str4, str2+6, 5);
    /* 讓str2陣列從第六個字後開始讀，
     * 然後雖然iPod只有四個字，
     * 但是因為字串結尾有\0，
     * 所以要一併讀進來
     */
    printf("%s\n", str3);
    printf("%s\n", str4);
    system("PAUSE");

    return 0;
}
