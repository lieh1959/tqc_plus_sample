struct circle {
	int x, y;
	double radius;
};

double callarea(struct circle *pr);

#include <stdio.h>
#include <stdlib.h>

int main () 
{	
	double area;
	struct circle c1={10, 10, 8.5};
 	
	area = callarea(&c1);//�ɤW&�ѷ�
	
	printf("���ꪺ��߬�(%d,�@%d), �b�|��%.2f, ���n��%.2f\n", 
                c1.x, c1.y, c1.radius, area);//radius�O�ŧi�bcallarea�̭����ҥH�����q�̭��I�s
	system("PAUSE");
     return 0;
}

double callarea(struct circle *pr)//�ŧi���κA�n�@�P�A�令double
{
	double area;//�@�֧令double
	area = pr->radius * pr->radius * 3.14159;
	return area;
}
