#include <stdio.h>
#include <stdlib.h>

int main () 
{
    struct  circle {
		int x, y;
		double radius;
	};//訐告的宣告後面要有分號
	
	double area;
	struct circle c1={10, 10, 2.5};
   
	area = c1.radius*c1.radius*3.14159;//補上結構的宣告c1.???
	
	printf("此圓的圓心為(%d, %d), 面積為%.2f\n", c1.x, c1.y, area);
	system("PAUSE");
    return 0;
}
