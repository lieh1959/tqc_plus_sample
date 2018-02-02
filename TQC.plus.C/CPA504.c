int callarea(struct rect *pr);

#include <stdio.h>
#include <stdlib.h>


//struct宣告筆者習慣在int main()外面
struct rect {
		int length, width;
	};

int main () 
{
	int area;
	struct rect r1={20, 18};
 	
	area = callarea(&r1);
	
	printf("此矩形的長為%d, 寬為%d, 面積為%d\n", r1.length, r1.width, area);
	system("PAUSE");
     return 0;
}

int callarea(struct rect *pr)
{
	int area;
	area = pr->length * pr->width;
	//上面這行的意思有如area = (*pr).length * (*pr).width;
	//先取出結構後，呼叫內部的項目
	return area;
}
