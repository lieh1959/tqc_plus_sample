//CPD03-1.c���{���p�U�G
#include <stdio.h>
#include <stdlib.h>
int x, y;

int callTotal(int,int);
int main()
{
	int tot;
	
	printf("�п�Jx, y����: ");
	scanf("%d %d", &x, &y);
	tot=callTotal(x,y);
	printf("%d+%d=%d\n", x, y, tot);
	
	system("PAUSE");
	return 0;
}

