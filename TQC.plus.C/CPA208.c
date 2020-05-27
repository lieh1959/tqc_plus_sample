/* TQC+ C - 208 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    int i, total=0; /* 設定加總初始值為0 */

    for (i=1; i <= 100; i++)
        /* 修改判斷式邏輯
         * for(...)後面不可以有分號
         * 會變得無意義
         */
    if(i%2 == 0)  /* 設定條件，如果為偶數，則進入加總 */
        total += i;

    printf("1到100的偶數和: %d\n", total);
    system("PAUSE");

    return 0;
}
