#include <stdio.h>
#include <stdlib.h>

int main()
{
	int unit;
	double price=23.34;
	double total;
	printf("�аݱz�n�R�X�~ī�G��? ");
	scanf("%d", &unit);
	total = unit*price;
	//�]��%�o�ӲŸ��b�{���X�����I�ѷӪ��N��A�ҥH��������print�O�L�k��ܪ��A�ҥH������J%%�����i�H��ܥX��
	printf("�ڶR�F%d�~100%%��ī�G��\n", unit);
	printf("��F%f��", total);
	system("PAUSE");
	return 0;
}
