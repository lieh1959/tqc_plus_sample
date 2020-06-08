/* TQC+ C - 702 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    char string[20];
    int output;  /* 請宣告成int */

    printf("請輸入一數字的字串: ");
    scanf("%s", string);
    output=atoi(string);
    printf("%s轉換後的整數為%d\n", string, output);//顯示的部分，要改成%d
    system("PAUSE");

    return 0;
}

