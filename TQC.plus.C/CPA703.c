#define NTRATE 31.34;//�Ÿ��`�ơG�o����O��ܥHNTRATE�N��31.34

#include <stdio.h>
#include <stdlib.h>

int main () 
{
	double USdollar, NTdollar;
	printf("�п�J�z���h�֬���: ");
	scanf("%lf", &USdollar);//�O�nŪ�Jdouble�A�ҥH�n��%lf
	
	NTdollar = USdollar * NTRATE;
	printf("�z�i�H��%.2f�x��\n", NTdollar);
	system("PAUSE");
     	return 0;
}
