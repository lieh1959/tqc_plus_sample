#include<stdlib.h>
#include<stdio.h>

//�ŧi�@�ӵ��c
struct student{
char name[20];
int score;
};


int main(){
	struct student st[5];
	int i;
	for(i=0;i<5;i++)
		 {
			 printf("�п�J��%d��P�Ǫ��m�W:",(i+1));
			 scanf("%s",st[i].name);
			 printf("�п�J��%d��P��C�y��������:",(i+1));
			 scanf("%d",&st[i].score );
	}
	for(i=0;i<5;i++){
		printf("%-10s  %d\n",st[i].name ,st[i].score);
		}


system("PAUSE");
return 0;
}

