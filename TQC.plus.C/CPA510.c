#include <stdio.h>
#include <stdlib.h>

struct  circle {
		int x, y;
		int radius;
		struct circle *next;
  	};

int main () 
{

    circle *a, *b, *c, *current; 	
	
	a = (circle *)malloc(sizeof(circle));
	printf("�п�J�Ĥ@�Ӷꪺ���(x, y): ");
	scanf("%d %d", &a->x, &a->y);
	printf("�п�J�Ĥ@�Ӷꪺ�b�|: ");
 	scanf("%d", &a->radius);
	a->next = NULL;//�Ĥ@�Ӽg�J��A�]���T�w���S���U�@�ӡA���Nnext�ȼg��NULL
	
	b = (circle *)malloc(sizeof(circle));
	printf("�п�J�ĤG�Ӷꪺ���(x, y): ");
	scanf("%d %d", &b->x, &b->y);
	printf("�п�J�ĤG�Ӷꪺ�b�|: ");
 	scanf("%d", &b->radius);
	b->next = NULL;//�]���T�w���S���U�@�ӡA���Nnext�ȼg��NULL
	a->next= b;//�T�w���W�@�ӫ�A�b�N�W�@�Ӫ�next�g���ۤv��m
	
	c = (circle *)malloc(sizeof(circle));
	printf("�п�J�ĤT�Ӷꪺ���(x, y): ");
	scanf("%d %d", &c->x, &c->y);
	printf("�п�J�ĤT�Ӷꪺ�b�|: ");
 	scanf("%d", &c->radius);
	c->next=NULL;//�]���T�w���S���U�@�ӡA���Nnext�ȼg��NULL
	b->next=c;//�T�w���W�@�ӫ�A�b�N�W�@�Ӫ�next�g���ۤv��m
	
	//�t�m��V�g�A�ˤF�A�Эץ�
	current = a ;
	int i=1;
	while (current != NULL) {
		  printf("��%d�Ӷꪺ��߬�(%d, %d), �b�|��%d\n",i, current->x, current->y, current->radius);
 		  i++;
		  current=current->next;//�����@����A�n��O�����m�ɦV�U�@��
	}
	 free(a);//����O����
 	 free(b);//����O����
	 free(c);//����O����
	system("PAUSE");	
    return 0;
}

