//CPA904-1
#include<stdlib.h>
#include<stdio.h>


int main(){
	FILE *fi;
	char name[20]; 
	int score;
	fi=fopen("score.dat", "w");//�}���ɮ׻P�g�J
	printf("�п�J�ǥͪ��m�W(���ƿ�J�t�����Ʈɵ���):");
	scanf("%s",name);
	printf("�п�J���ǥ�C�y������:");
	scanf("%d",&score);
	while(score>=0){//����O�P�_�A�n�Ʀr�D�t�Ƥ~�|����g�J
	 fprintf(fi,"%s %d",name,score);
	 printf("�п�J�ǥͪ��m�W(���ƿ�J�t�����Ʈɵ���):");
	scanf("%s",name);
	printf("�п�J���ǥ�C�y������:");
	scanf("%d",&score);
	 }
	fclose(fi);

system("PAUSE");
return 0;
}

