#include<stdio.h>
#include<stdlib.h>

int main(){
	int choice;
	printf("(1)教授\n(2)副教授\n(3)助理教授\n(4)都不是\n(5)結束\n請輸入您的職稱代號:");
	scanf ("%d",&choice);
	while(choice!=5){//只要使用者沒有輸入到5，都會持續去詢問
	switch (choice)//注意switch case的使用方法
	{
	case 1:	printf("\n您的職稱是教授\n");break;
	case 2:	printf("\n您的職稱是副教授\n");break;
	case 3:	printf("\n您的職稱是助理教授\n");break;
	case 4:	printf("\n您的職稱沒有在這些選項內\n");break;
	case 5:	break;
	}
	printf("\n(1)教授\n(2)副教授\n(3)助理教授\n(4)都不是\n(5)結束\n請輸入您的職稱代號:");
	scanf ("%d",&choice);
	}

system ("PAUSE");
return 0;
}