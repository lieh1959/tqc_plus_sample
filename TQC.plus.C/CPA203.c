#include <stdio.h>
#include <stdlib.h>
int main()
{
    int floor;
    printf("Ո����ס��һ�Ә�(1-4): ");
    scanf("%d", &floor);
    switch(floor) {
        case 1:printf("��ס��һ��\n");break;
        case 2:printf("��ס�ڶ���\n");break;
        case 3:printf("��ס������\n");break;
        case 4:printf("��ס���Ę�\n");break;
        default:printf("��ݔ��ĘǌӲ����_");
	}
	system("PAUSE");
     return 0;
}
