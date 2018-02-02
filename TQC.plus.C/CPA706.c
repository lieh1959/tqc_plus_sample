#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main () 
{
	double x, y;//更改為double
	double result;
	printf("請輸入x, y的值: ");
	scanf("%lf %lf", &x, &y);//因為要讀入double，要用%lf
    
	result=((exp(5.0)*sqrt((pow(x, y)+log(100.0)))/pow(x, 2))*pow(y, 3));//在這些函式中的參數要用double，exp(double)、pow(double,double)、log(double)
	printf("result=%f\n", result);
	system("PAUSE");
     return 0;
}
