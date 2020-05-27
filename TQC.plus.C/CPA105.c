/* TQC+ C - 105 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
 int a, b, c, total;
 double average;

 printf("請輸入第一個整數? ");
 scanf("%d", &a);
 printf("請輸入第二個整數? ");
 scanf("%d", &b);
 printf("請輸入第三個整數? ");
 scanf("%d", &c);

 total = a+b+c;
 average = total/3.0;
 /* 在除法如果右邊的運算元素皆為int則運算結果亦為int
  * 僅要其一元素為double，即可讓運算過程為double
  */

 printf("%d+%d+%d=%d\n", a, b,c, total);
 /* 雙引號的參照有幾個，後面的變數欄位就要有幾個
  * ps.如果 a+b 算一個欄位
  */

 printf("平均數為%.2f", average);
 /* 設定小數第二位設定方法.?，問號為位數 */
 system("PAUSE");

 return 0;
}