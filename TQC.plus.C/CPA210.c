#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int i=0, total=0;//�O��i�ĳ�ʼֵ��0���ӿ��ĳ�ʼֵҲ�O����0 
	do {
	i+=2;
	total += i;
	} while (i<100);
	//���@߅����һ݆��iֵ��100��������������Д��ǣ����100�]��С�100�����Բ�������һ݆
	
     printf("1��100��ż����: %d\n", total);
	system("PAUSE");
     return 0;
}
