#include<stdlib.h>
#include<stdio.h>

//宣告一個結構
struct student{
char name[20];
int score;
};


int main(){
	struct student st[5];
	int i;
	for(i=0;i<5;i++)
		 {
			 printf("請輸入第%d位同學的姓名:",(i+1));
			 scanf("%s",st[i].name);
			 printf("請輸入第%d位同學C語言的分數:",(i+1));
			 scanf("%d",&st[i].score );
	}
	for(i=0;i<5;i++){
		printf("%-10s  %d\n",st[i].name ,st[i].score);
		}


system("PAUSE");
return 0;
}

