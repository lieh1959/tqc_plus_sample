#include <stdio.h>
#include <stdlib.h>

int main()
{
	int i;
	printf("Ոݔ��iֵ: ");
	scanf("%d", &i);
	if (i%2==0)//�Д��Ƿ���ͬʹ��==���ǔ��W��̖��=
		   printf("%d��ż��\n", i);
	else
		   printf("%d���攵\n", i);

	system("PAUSE");
     return 0;
}
