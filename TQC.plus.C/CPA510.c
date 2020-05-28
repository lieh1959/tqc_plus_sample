/* TQC+ C - 510 */

#include <stdio.h>
#include <stdlib.h>

struct  circle {
    int x, y;
    int radius;
    struct circle *next;
};

int main ()
{
    circle *a, *b, *c, *current;

    a = (circle *)malloc(sizeof(circle));
    printf("請輸入第一個圓的圓心(x, y): ");
    scanf("%d %d", &a->x, &a->y);
    printf("請輸入第一個圓的半徑: ");
    scanf("%d", &a->radius);
    a->next = NULL;
    /* 第一個寫入後，因不確定有沒有下一個，先將next值寫成NULL */

    b = (circle *)malloc(sizeof(circle));
    printf("請輸入第二個圓的圓心(x, y): ");
    scanf("%d %d", &b->x, &b->y);
    printf("請輸入第二個圓的半徑: ");
    scanf("%d", &b->radius);
    b->next = NULL;  /* 因不確定有沒有下一個，先將next值寫成NULL */
    a->next = b;  /* 確定有上一個後，在將上一個的next寫成自己位置 */

    c = (circle *)malloc(sizeof(circle));
    printf("請輸入第三個圓的圓心(x, y): ");
    scanf("%d %d", &c->x, &c->y);
    printf("請輸入第三個圓的半徑: ");
    scanf("%d", &c->radius);
    c->next=NULL;  /* 因不確定有沒有下一個，先將next值寫成NULL */
    b->next=c;  /* 確定有上一個後，在將上一個的next寫成自己位置 */

    /* 配置方向寫顛倒了，請修正 */
    current = a ;
    int i=1;
    while (current != NULL) {
        printf("第%d個圓的圓心為(%d, %d), 半徑為%d\n",i, current->x, current->y, current->radius);
        i++;
        current = current->next;//做完一輪後，要把記憶體位置導向下一個
    }
    free(a); /* 釋放記憶體 */
    free(b); /* 釋放記憶體 */
    free(c); /* 釋放記憶體 */
    system("PAUSE");

    return 0;
}
