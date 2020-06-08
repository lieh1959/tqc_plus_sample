/* TQC+ C - 901_2 */

#include<stdlib.h>
#include<stdio.h>

void exchange(double* ,double* );

int main()
{
    double a,b;

    printf("請輸入兩個浮點數(數字跟數字中間請以空白間隔)");
    scanf("%lf %lf",&a,&b);/* 輸入double要用%lf */
    printf("\na:%f b:%f",a,b);
    exchange(&a,&b);
    printf("\na:%f b:%f",a,b);
    system("PAUSE");

    return 0;
}

void exchange(double* a,double* b){/* 改成double */
    double temp;

    temp = *a;
    *a =*b ;
    *b=temp;
}