#include <stdio.h>
#include <stdlib.h>

void callFun();
int main()
{
	int i;
	for (i=1; i<=5; i++) {
		  callFun();
	}

	system("PAUSE");
	return 0;
}

void callFun()
{
	int ai=100;
	static int si=100;
	//���@߅��si׃��static ȫ��׃����׌��׃�����Ѕ^�򶼿��ö������������^�ᣬ�ٴ�����͛]���x����˕������M���ۼӡ�
	ai++;
	si++;
	printf("ai=%d, si=%d\n", ai, si);//Ҫ�a�ϓQ�з�̖
}
