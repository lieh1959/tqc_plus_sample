int callarea(struct rect *pr);

#include <stdio.h>
#include <stdlib.h>


//struct�ŧi���̲ߺD�bint main()�~��
struct rect {
		int length, width;
	};

int main () 
{
	int area;
	struct rect r1={20, 18};
 	
	area = callarea(&r1);
	
	printf("���x�Ϊ�����%d, �e��%d, ���n��%d\n", r1.length, r1.width, area);
	system("PAUSE");
     return 0;
}

int callarea(struct rect *pr)
{
	int area;
	area = pr->length * pr->width;
	//�W���o�檺�N�䦳�parea = (*pr).length * (*pr).width;
	//�����X���c��A�I�s����������
	return area;
}
