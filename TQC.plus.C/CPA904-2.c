//CPA904-2
#include<stdlib.h>
#include<stdio.h>


int main(){
	FILE *fi;
	char name[20]; 
	int score;
	fi=fopen("score.dat", "r");
	while(fscanf(fi,"%s %d",name,&score)!=EOF){//�P�_Ū���O�_���ɮ׵���
	printf("%s��C�y�����ƬO%d\n",name,score);
	}
	fclose(fi);

system("PAUSE");
return 0;
}

