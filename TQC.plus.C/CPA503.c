#include <stdio.h>
#include <stdlib.h>

int main () 
{
   struct  circle {
		int x, y;
		double radius;
	};
	
	double area;
	struct circle c1={10, 10, 2.5};
	struct circle *pc=&c1;//�o��w�g�z�L���бNpc���Vc1�F
	
	area = (*pc).radius*(*pc).radius*3.14159;//���ɡA�ڭ̥����z�L�A���A����(*pc)�N�����c���X�A�A�I�s�̭�������
	//�p�G�ϥ�*pc.radius���I�N��*(pc.radius)�A���o�˨����X��	
	printf("���ꪺ��߬�(%d, %d), ���n��%.2f\n", (*pc).x, (*pc).y, area);
	system("PAUSE");
	return 0;
}
