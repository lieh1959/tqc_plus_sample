/* TQC+ C - 206 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
	int i=1, total=0;

    while (i <= 100)
	{
        total += i;
        i++;
        /* 修改程式的邏輯，因為i從1開始，
         * 所以要先加到total裡面，
         * 之後再做i++的動作
         */
    }
    printf("1加到100的總和:%d\n", total);
    system("PAUSE");

    return 0;
}
