//CPA901-2
#include<stdlib.h>
#include<stdio.h>

void exchange(double* ,double* );
int main(){
	double a,b;
	printf("�п�J��ӯB�I��(�Ʀr��Ʀr�����ХH�ťն��j)");
	scanf("%lf %lf",&a,&b);//��Jdouble�n��%lf
	printf("\na:%f b:%f",a,b);
	exchange(&a,&b);
	printf("\na:%f b:%f",a,b);
system("PAUSE");
return 0;
}

void exchange(double* a,double* b){//�令double
	double temp;
	temp = *a;
	*a =*b ;
	*b=temp;
}
