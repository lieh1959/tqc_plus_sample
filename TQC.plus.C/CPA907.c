#include<stdlib.h>
#include<stdio.h>


char GPA(int);

int main(){

	struct student{char name[20];int score;};//宣告一個結構
	struct student st1,st2,st3;
	

	printf("請輸入第一位學生姓名: ");
	scanf("%s",st1.name);
	printf("請輸入第一位學生成績: ");
	scanf("%d",&st1.score);

	printf("請輸入第二位學生姓名: ");
	scanf("%s",st2.name);
	printf("請輸入第二位學生成績: ");
	scanf("%d",&st2.score);

	printf("請輸入第一位學生姓名: ");
	scanf("%s",st3.name);
	printf("請輸入第一位學生成績: ");
	scanf("%d",&st3.score);
	
	printf("\n第一位學生: %s",st1.name);
	printf("\n分數: %d",st1.score );
	printf ("\nGPA: %c",GPA(st1.score ));

		printf("\n第二位學生: %s",st2.name);
	printf("\n分數: %d",st2.score );
	printf ("\nGPA: %c",GPA(st2.score ));

		printf("\n第三位學生: %s",st3.name);
	printf("\n分數: %d",st3.score );
	printf ("\nGPA: %c",GPA(st3.score ));

system("PAUSE");
return 0;
}

char GPA(int i){//GPA的函數
	char re;
	if(i>=90)
		re='A';
	else if(i>=80&&i<90)//區間判斷的寫法
		re='B';
	else if(i>=70&&i<80)
		re='C';
	else
		re='D';
	return re;
}