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
 	
	area = callarea(&r1);//補上&的參照
	
	printf("此矩形的長為%d, 寬為%d, 面積為%d\n", r1.length, r1.width, area);
	system("PAUSE");
     return 0;
}

int callarea(struct rect *pr)
{
	int area;
	area = pr->length * pr->width;//把原本的.改成->，因為這邊是指標指向的
	return area;
}
