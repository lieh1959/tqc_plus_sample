//CPA901-1
#include<stdlib.h>
#include<stdio.h>

void exchange(int* ,int* );
int main(){
	int a,b;
	printf("�п�J��ӼƦr(�Ʀr��Ʀr�����ХH�ťն��j)");
	scanf("%d %d",&a,&b);
	printf("\na:%d b:%d",a,b);
	exchange(&a,&b);
	printf("\na:%d b:%d",a,b);
system("PAUSE");
return 0;
}

void exchange(int* a,int* b){//�N�O�����}���մ����ʧ@
	int temp;
	temp = *a;
	*a =*b ;
	*b=temp;
}
