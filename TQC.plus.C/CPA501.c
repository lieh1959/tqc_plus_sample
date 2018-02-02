#include <stdio.h>
#include <stdlib.h>

int main () 
{
   struct  student {
		char name[10];
		int score;
	};//宣告結構後要分號
	
	struct student st1;
	printf("請輸入姓名:");
	scanf("%s", &st1.name);//name是宣告在student的結構內，所以必須呼叫
    
	printf("請輸入分數:");
	scanf("%d", &st1.score);
	
	printf("%s的成績是%d\n", st1.name, st1.score);
	
	if (st1.score > 60)
      printf("恭喜您通過了");
	else {
      printf("抱歉您被當了");
	}

	system("PAUSE");
   return 0;
}
