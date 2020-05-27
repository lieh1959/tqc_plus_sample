/* TQC+ C - 207 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    int i=1, total=0;
    /* i從1開始加 */

    while (i <= 100) {
    /* 判斷式為小於等於100，因為100也要加進去 */
      total += i;
      i++;
    }
    printf("1加到100的總和:%d\n", total);
    system("PAUSE");

    return 0;
}
