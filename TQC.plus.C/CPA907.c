#include<stdlib.h>
#include<stdio.h>


char GPA(int);

int main(){

	struct student{char name[20];int score;};//�ŧi�@�ӵ��c
	struct student st1,st2,st3;
	

	printf("�п�J�Ĥ@��ǥͩm�W: ");
	scanf("%s",st1.name);
	printf("�п�J�Ĥ@��ǥͦ��Z: ");
	scanf("%d",&st1.score);

	printf("�п�J�ĤG��ǥͩm�W: ");
	scanf("%s",st2.name);
	printf("�п�J�ĤG��ǥͦ��Z: ");
	scanf("%d",&st2.score);

	printf("�п�J�Ĥ@��ǥͩm�W: ");
	scanf("%s",st3.name);
	printf("�п�J�Ĥ@��ǥͦ��Z: ");
	scanf("%d",&st3.score);
	
	printf("\n�Ĥ@��ǥ�: %s",st1.name);
	printf("\n����: %d",st1.score );
	printf ("\nGPA: %c",GPA(st1.score ));

		printf("\n�ĤG��ǥ�: %s",st2.name);
	printf("\n����: %d",st2.score );
	printf ("\nGPA: %c",GPA(st2.score ));

		printf("\n�ĤT��ǥ�: %s",st3.name);
	printf("\n����: %d",st3.score );
	printf ("\nGPA: %c",GPA(st3.score ));

system("PAUSE");
return 0;
}

char GPA(int i){//GPA�����
	char re;
	if(i>=90)
		re='A';
	else if(i>=80&&i<90)//�϶��P�_���g�k
		re='B';
	else if(i>=70&&i<80)
		re='C';
	else
		re='D';
	return re;
}