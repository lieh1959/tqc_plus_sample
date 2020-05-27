/* TQC+ C - 406 */

#include <stdio.h>
#include <stdlib.h>

void change(int *, int *);

int main ( )
{
    int i=100, j=200;

    printf("交換前i與j的值: \n");
    printf("i=%d, j=%d\n", i, j);

    change(&i, &j);//取出記憶體位址
    printf("交換後i與j的值: \n");
    printf("i=%d, j=%d\n", i, j);
    system("PAUSE");

    return 0;
}

void change(int *x, int *y)  /* 接收到記憶體位址 */
{
      int temp; /* 設定一個整數變數 */

      temp=*x; /* 把記憶體中的資料寫進去 */
      *x=*y; /* 把x的位址改成y的 */
      *y=temp; /* 把暫存的東西，寫入y記憶體 */
  }