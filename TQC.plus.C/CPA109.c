#include <stdio.h>
#include <stdlib.h>

int main () {
	int score;

	printf("請輸入您的分數: ");
	scanf("%d", &score);
	if (60<=score&&score<=100) {
            //在做數字區間判斷時，常常會犯一個錯誤，直接在條件式內設定?<X<?
            //正確的設定方法為：使用AND判斷式，需要多個條件成立才行
		printf("及格");
	}
	else {
		printf("不及格");
	}

	int x;
	printf("\n\n請輸入x值: ");
	scanf("%d", &x);
	if (x%2 == 0) {//判斷是否相同時，相等於號為==非數學式的=
		 printf("%d是偶數", x);
	}
	else {
		 printf("%d是奇數", x);
	}

	system("PAUSE");
	return 0;
}
