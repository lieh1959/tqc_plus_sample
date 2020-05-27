/* TQC+ C - 401 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    int num=100, *pointer;

    pointer = &num; /* 這邊是要把指標位址寫過去 */

    printf("num=%d, *pointer=%d\n", num, *pointer);
    system("PAUSE");

    return 0;
}

