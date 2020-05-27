/* TQC+ C - 305_1 */

/* CPD03-1.c code */
#include <stdio.h>
#include <stdlib.h>
int x, y;
int callTotal(int,int);

int main()
{
    int tot;

    printf("請輸入x, y的值: ");
    scanf("%d %d", &x, &y);
    tot=callTotal(x,y);
    printf("%d+%d=%d\n", x, y, tot);
    system("PAUSE");

    return 0;
}
