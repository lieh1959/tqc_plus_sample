#include<stdlib.h>
#include<stdio.h>
#include<time.h>//�]�����Ψ�ɶ���ƭn�⥦include


int main(){
	int i ,j,a;
	
 srand(time(NULL));//�o�Ө�ƬO�n�]�w�üƪ��ؤl�A�]�����üƦb���ͮɡA���p�G�B��b�@�w�ɶ����A���ͪ��üƤ��|�t���Ӥj�C
�o��ڭ����ؤl���򩳼ơA�|�H�ɶ��Ӥ��@��
	for(i=0;i<10;i++)
	{
		for(j=0;j<10;j++){
			a=(rand()%1000)+1;//�üư϶��]�w�覡
			printf(" %3d ",a);//�ƪ��n�Ʀn
		}
		printf("\n");
	}

	
system("PAUSE");
return 0;
}

