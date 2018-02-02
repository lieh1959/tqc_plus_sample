#include <stdio.h>
#include <stdlib.h>

int main () 
{
	char string[20];
	double output;
	printf("請輸入一數字的字串: ");
	scanf("%s", string);
 
	output=atof(string);//atoi()是將字串轉成int格式，atof裁示轉成浮點數

     printf("%s轉換後的浮點數為%f\n", string, output);
	system("PAUSE");
     return 0;
}

