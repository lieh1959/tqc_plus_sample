#include <stdio.h>
#include <stdlib.h>

int main () 
{
    char str[20];//補上陣列大小
	char *pstr;
 	printf("請輸入str字串: ");
	scanf("%s", str);
	
	printf("請輸入pstr字串: ");
	pstr=(char *)malloc(sizeof(char)*20);//動態記憶體配置，然後補上大小
	
	scanf("%s", pstr);
	printf("\n您輸入str字串如下: %s\n", str);
	printf("您輸入pstr字串如下: %s\n", pstr);
    system("PAUSE");
    return 0;
}
 

  
