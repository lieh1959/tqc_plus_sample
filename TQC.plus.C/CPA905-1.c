//CPA905-1
#include<stdlib.h>
#include<stdio.h>


int main(){
	FILE *fi;
	double ss;
	fi = fopen("dnumber.dat","w");
	
	printf("�п�J�B�I��:");
	scanf("%lf",&ss);
	while(ss!=-99.99){//��ϥΪ̿�J��-99.99�ɡA����g�J
		fprintf(fi," %lf ",ss);
		printf("�п�J�B�I��:");
		scanf("%lf",&ss);
	}
	fclose(fi);

system("PAUSE");
return 0;
}

