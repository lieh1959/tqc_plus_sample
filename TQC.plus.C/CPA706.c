#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main () 
{
	double x, y;//��אּdouble
	double result;
	printf("�п�Jx, y����: ");
	scanf("%lf %lf", &x, &y);//�]���nŪ�Jdouble�A�n��%lf
    
	result=((exp(5.0)*sqrt((pow(x, y)+log(100.0)))/pow(x, 2))*pow(y, 3));//�b�o�Ǩ禡�����Ѽƭn��double�Aexp(double)�Bpow(double,double)�Blog(double)
	printf("result=%f\n", result);
	system("PAUSE");
     return 0;
}
