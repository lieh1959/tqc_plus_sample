#include <stdio.h>
#include <stdlib.h>

int main ()
{
	int a, b, c, total;
	double average;
 	printf("�п�J�Ĥ@�Ӿ��? ");
	scanf("%d", &a);
	printf("�п�J�ĤG�Ӿ��? ");
	scanf("%d", &b);
	printf("�п�J�ĤT�Ӿ��? ");
	scanf("%d", &c);

	total = a+b+c;
	average = total/3.0;
	//�b���k�p�G�k�䪺�B�⤸���Ҭ�int�h�B�⵲�G�笰int�A�ȭn��@������double�A�Y�i���B��L�{��double

	printf("%d+%d+%d=%d\n", a, b,c, total);//���޸����ѷӦ��X�ӡA�᭱���ܼ����N�n���X�� ps.�p�G a+b ��@�����
	printf("�����Ƭ�%.2f", average);
	//�]�w�p�ƲĤG��]�w��k.?�A�ݸ������
	system("PAUSE");
	return 0;
}
