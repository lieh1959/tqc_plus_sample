#include <stdio.h>
#include <stdlib.h>

int main () {
	int score;

	printf("�п�J�z������: ");
	scanf("%d", &score);
	if (60<=score&&score<=100) {
            //�b���Ʀr�϶��P�_�ɡA�`�`�|�Ǥ@�ӿ��~�A�����b���󦡤��]�w?<X<?
            //���T���]�w��k���G�ϥ�AND�P�_���A�ݭn�h�ӱ��󦨥ߤ~��
		printf("�ή�");
	}
	else {
		printf("���ή�");
	}

	int x;
	printf("\n\n�п�Jx��: ");
	scanf("%d", &x);
	if (x%2 == 0) {//�P�_�O�_�ۦP�ɡA�۵��󸹬�==�D�ƾǦ���=
		 printf("%d�O����", x);
	}
	else {
		 printf("%d�O�_��", x);
	}

	system("PAUSE");
	return 0;
}
