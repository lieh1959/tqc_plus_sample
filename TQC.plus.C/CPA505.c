struct rect {
	int length, width;
};

int callarea(struct rect *pr);

#include <stdio.h>
#include <stdlib.h>

int main () 
{	
	int area;
	struct rect r1={20, 18};
 	
	area = callarea(&r1);//�ɤW&���ѷ�
	
	printf("���x�Ϊ�����%d, �e��%d, ���n��%d\n", r1.length, r1.width, area);
	system("PAUSE");
     return 0;
}

int callarea(struct rect *pr)
{
	int area;
	area = pr->length * pr->width;//��쥻��.�令->�A�]���o��O���Ы��V��
	return area;
}