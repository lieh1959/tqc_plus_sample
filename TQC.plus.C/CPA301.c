/* TQC+ C - 301 */

#include <stdio.h>
#include <stdlib.h>

void Star();  /* 記得補上分號 */
/* C語言在設定函數時，在上方要先宣告一次，之後在main的下方撰寫函數的功能
 * 但如果是寫在main上方的函數，則無需先宣告一次
 */

int main ()
{
    printf("呼叫印出星星的函數!!!\n");
    Star();
    printf("我喜歡學C程式語言\n");
    Star();
    printf("結束函數的呼叫!!!\n");
    system("PAUSE");

    return 0;
}

void Star()
{
    int i;

    for(i = 1 ; i <= 30 ; i++)
        printf("*");
    printf("\n");
}
