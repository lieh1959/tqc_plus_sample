#include <stdio.h>
#include <stdlib.h>
int adjust(int);
int main () 
{
	int score, final;
	printf("�п�J�z������: ");
	scanf("%d", &score);
	
	final = adjust(score);//�O�o�n�N�Ǧ^�Ӫ����Ƽg�Jfinal�ܼƤ�
 
	printf("�վ�᪺����: %d", final);
	system("PAUSE");
	return 0;
}

int adjust(int score)
{
	int temp;//�ŧi�ܼ�
	if (score >= 60) 
		temp = score + 10;
	else 
		temp = score + 5;

	return temp;
}
