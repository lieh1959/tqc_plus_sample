#include <stdio.h>
#include <stdlib.h>

int main ()
{
	int a, b, c, d;
  	printf("�п�J�Ĥ@�Ӿ��? ");
	scanf("%d", &a);
	printf("�п�J�ĤG�Ӿ��? ");
	scanf("%d", &b);
	printf("�п�J�ĤT�Ӿ��? ");
	scanf("%d", &c);
	printf("�п�J�ĥ|�Ӿ��? ");
	scanf("%d", &d);

	printf("�������l�Ƭ�%d\n", ((a+b)/2-(c+d)/2) % 2);
	//�b���Ȼݭn�N�Ʀr�A�����t�n�A�K�i�H�i���������[��
	system("PAUSE");
 	return 0;
}

