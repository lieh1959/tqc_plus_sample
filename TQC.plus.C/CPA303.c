/* TQC+ C - 303 */

#include <stdio.h>
#include <stdlib.h>

int num = 100;

void subFun();

int main()
{
    int num = 200;  /* 設定一個區域變數 */

    printf("在main函數中的num為%d\n", num);
    subFun();
    system("PAUSE");

    return 0;
}

void subFun()  /* 因為沒有要回傳，所以設定成void就好 */
{
    printf("在subFun函數中的num為%d\n", num);
}
