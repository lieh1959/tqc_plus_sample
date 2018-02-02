#include <stdio.h>
#include <stdlib.h>
int main()
{
    int floor;
    printf("請問您住哪一層樓(1-4): ");
    scanf("%d", &floor);
    switch(floor) {
        case 1:printf("您住在一樓\n");break;
        case 2:printf("您住在二樓\n");break;
        case 3:printf("您住在三樓\n");break;
        case 4:printf("您住在四樓\n");break;
        default:printf("您輸入的樓層不正確");
	}
	system("PAUSE");
     return 0;
}
