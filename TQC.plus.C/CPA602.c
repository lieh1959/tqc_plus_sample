#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main () 
{
 	char str2[]="Apple iPod";
 	char str4[]="Apple iPad";
	int n;
	
	n=strcmp(str2, str4);
	//strcmp()���^�ִ��ĺ�ʽ�����ǰ��������t��true=1����Ȟ�0��С춄t��-1
		if (n>0) {
	printf("%s���%s\n", str2, str4);
	} else if (n==0) {//�l��ʽ�����==
	printf("%s���%s\n", str2, str4);

	} else {
	printf("%sС�%s\n", str2, str4);

	}

	n=strncmp(str2, str4, 5);
	if (n>0) {
	printf("%sǰ�傀��Ԫ���%sǰ�傀��Ԫ\n", str2, str4);
	} else if (n==0) {//�l��ʽ�����==
	printf("%sǰ�傀��Ԫ���%sǰ�傀��Ԫ\n", str2, str4);
		
	} else {
	printf("%sǰ�傀��ԪС�%sǰ�傀��Ԫ\n", str2, str4);
	}
	system("PAUSE");
	return 0;
}
