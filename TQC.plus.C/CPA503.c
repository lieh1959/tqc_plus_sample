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
	struct circle *pc=&c1;//這邊已經透過指標將pc指向c1了
	
	area = (*pc).radius*(*pc).radius*3.14159;//此時，我們必須透過括號，先用(*pc)將的結構取出，再呼叫裡面的項目
	//如果使用*pc.radius有點意味*(pc.radius)，但這樣取不出來	
	printf("此圓的圓心為(%d, %d), 面積為%.2f\n", (*pc).x, (*pc).y, area);
	system("PAUSE");
	return 0;
}
