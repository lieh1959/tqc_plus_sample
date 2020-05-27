/* TQC+ C - 402 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    int num=100;
    int *pointer = &num;  /* 補上&，因要讀取位址，非值 */

    printf("num=%d, *pointer=%d\n", num, *pointer);
    system("PAUSE");

    return 0;
}

