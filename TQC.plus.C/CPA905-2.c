//CPA905-2
#include<stdlib.h>
#include<stdio.h>


int main(){
	FILE *fi;
	double ss;
	fi = fopen("dnumber.dat","r");
	
	
	while(fscanf(fi," %lf ",&ss)!=EOF){
		
		printf("%.2lf\n",ss);//�`�N�ƪ����D
		
	}
	fclose(fi);//�ɮפ��ϥΫ�A�������ɮסA���M����������]�|�����ɮ�

system("PAUSE");
return 0;
}

