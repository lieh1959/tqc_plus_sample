#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main ()
{
    double result;
    double a, b, c, d, e, f;

    printf("請輸入a, b, c的值: ");
    scanf("%lf %lf %lf", &a, &b, &c);
    printf("請輸入d, e, f的值: ");
    scanf("%lf %lf %lf", &d, &e, &f);

    result = fabs(a) * floor(b) + pow(c, d) * sqrt(e) + log10(f);
    printf("result = %f", result);
    system("PAUSE");

    return 0;
}
