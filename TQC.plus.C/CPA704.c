#define TRIPLE(x) x*x*x;//�����n������
//�w�q�@�Ӥ�{��

#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int num, triple_num;
	printf("�п�J�@�Ӿ��: ");
	scanf("%d", &num);
	
	triple_num = TRIPLE(num);
	printf("%d���T���謰%d\n", num,triple_num);//�ѼƤ֤@��num
	
	triple_num = TRIPLE((4+1));
	//�n�M�������B�@���ǡA�ݭn����4+1�B�z���A�ҥH�ڭ̱N���A���_��
	printf("5���T���謰%d\n", triple_num);

	system("PAUSE");
     return 0;
}
