#include <stdio.h>
#include <stdlib.h>

int main ()
{
	double a, b, c, d, e, f;
  	printf("�п�J�Ĥ@�ӯB�I��: ");
	scanf("%lf", &a);
  	printf("�п�J�ĤG�ӯB�I��: ");
	scanf("%lf", &b);
  	printf("�п�J�ĤT�ӯB�I��: ");
	scanf("%lf", &c);
  	printf("�п�J�ĥ|�ӯB�I��: ");
	scanf("%lf", &d);
  	printf("�п�J�Ĥ��ӯB�I��: ");
	scanf("%lf", &e);
  	printf("�п�J�Ĥ��ӯB�I��: ");
	scanf("%lf", &f);

	printf("\n�V�k�a��\n");//�n�]�w�n�p���I�U���X��
	printf("%10.2f %10.2f %10.2f\n", a, b, c);
	printf("%10.2f %10.2f %10.2f\n", d, e, f);

	printf("\n\n�V���a��\n");
	printf("%-10.2f %-10.2f %-10.2f\n", a, b, c);
	printf("%-10.2f %-10.2f %-10.2f\n", d, e, f);

	system("PAUSE");
 	return 0;
}
