#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main () 
{
 	char ch, ch2;
	printf("請輸入一小寫的英文字母: ");
	scanf("%c", &ch);//補上&的參照
	
	//將下列的字元轉為大寫
	ch2=toupper(ch);
	printf("%c的大寫是%c", ch, ch2);
	
	
	 while (getchar() != '\n') {
		 //這邊主要是要將使用者多輸入的東西從緩衝區消耗掉
		 //如果沒有這一邊的話，下次再一次使用getchar()、scanf()則會從緩衝區讀取尚未用完的字
	     continue;
	 }
	 
	
 	//將下列的字元轉為小寫
	printf("\n請輸入一大寫的英文字母: ");
	scanf("%c", &ch);//補上&的參照
	ch2=tolower(ch);
	printf("%c的小寫是%c", ch, ch2);
	
	system("PAUSE");
	return 0;
}
