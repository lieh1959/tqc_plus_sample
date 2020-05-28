/* TQC+ C - 506 */

#include <stdio.h>
#include <stdlib.h>

struct circle {
    int x, y;
    double radius;
};

double callarea(struct circle *pr);

int main ()
{
    double area;
    struct circle c1={10, 10, 8.5};

    area = callarea(&c1);  /* 補上&參照 */

    printf("此圓的圓心為(%d,　%d), 半徑為%.2f, 面積為%.2f\n",
            c1.x, c1.y, c1.radius, area);
    /* radius是宣告在callarea裡面的所以必須從裡面呼叫 */
    system("PAUSE");

    return 0;
}

double callarea(struct circle *pr)  /* 宣告的形態要一致，改成double */
{
    double area;//一併改成double

    area = pr->radius * pr->radius * 3.14159;

    return area;
}
