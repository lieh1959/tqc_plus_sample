#include <stdio.h>
#include <stdlib.h>
/* �Y�S���w�qKnum, �h�[�H�w�q��1000 */
#ifndef Knum
#define Knum 1000
#endif
/* �NKnum�Ѱ��w�q, ����A�w�q��200 */
#undef Knum
#define Knum 200

int main () 
{
	/* �L�X�̫᪺Knum�� */
	printf("Knum = %d\n", Knum);
	
	/* �U�C���ܼ�d�Mi�@��8��Bytes, ���O12��Bytes */
	union dataType {
		double d;
		int	 i;
	};
	dataType dT;//�ק�dataType���ŧi
	printf("�п�Jd���ܼƭ�: ");//�N���ܼƤ��}��J�M���
	scanf("%lf", &dT.d); 	
	printf("%lf\n", dT.d);
	/* �L�XdT�ܼƤ���d�Mi */
	printf("�п�Ji���ܼƭ�: ");
	scanf("%d", &dT.i); 	
	
	printf("%d\n",  dT.i);
	system("PAUSE");
	return 0;
}
