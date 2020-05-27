/* TQC+ C - 310 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    int arr[5]={100, 200, 300, 400, 500};
    int i;

    printf("\n陣列元素的值如下:\n");
    for (i=0; i<5; i++) /* i的起始值為0 */
        printf("arr[%d]=%d\n", i, arr[i]);

    /* %p是用來顯示位址的參照 */
    printf("\n陣列元素的位址如下:\n");
    for (i=0; i<5; i++)  /* i的起始值為0 */
        printf("&arr[%d]=%p\n", i, &arr[i]);

    /* 這邊是將每一個元素位址顯示出來 */
    printf("\n陣列元素的位址如下:\n");
    for (i=0; i<5; i++) /* i的起始值為0 */
        printf("&arr[%d]=%p\n", i, arr+i);
    system("PAUSE");

    return 0;
}
