#include <stdio.h>
#include <stdlib.h>

    struct  triangle {
		int width;
		int height;
  	};

int main () 
{

	
	triangle *ptri;//�ŧi�@��triangle������ 	
	
	double area;
 	
	ptri=(triangle*) malloc(sizeof(triangle));//��q���n�O����Ŷ�
	//malloc()�ΨӸ�q���n�O����Ŷ������
	//���O�]���w�]�^�ǫ��A�Ovoid
	//�ҥH�ڭ̥����ۦ�]�w��^�Ǫ����A(triangle*) 
	//�O�ݨ�(triangle*)ı�o���ߺD�A���]�O�@�ث��A
	//�Ҧp�G���`�O�o�˫ŧi��int *p�A���o��int* p�N��O�@�˪�

	printf("�п�J�T���Ϊ������h��: ");
	scanf("%d", &ptri->width);//ptri�O���СA�n�I�s�̭������إ�����->
	printf("�п�J�T���Ϊ������h��: ");
	scanf("%d", &ptri->height);
 
	area = (ptri->width * ptri->height)/2.;
 	printf("�T���Ϊ����n��%.2f\n", area);
 	
	system("PAUSE");
     return 0;
}
