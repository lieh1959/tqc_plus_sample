#include<stdlib.h>
#include<stdio.h>

//�ŧi���
int greater60(int* ,int );

int main(){
	int data[6];
	int i;
	for(i=0;i<6;i++){
	printf("�п�J��%d�Ӥ���:",(i+1));
	scanf("%d",&data[i]);
	}

	printf("�z��J����Ʀp�U:\n");
	for(i=0;i<6;i++){
	printf("\ndata[%d]:%d",i,data[i]);
	}
	printf("\n�j��60���o��:%d��",greater60(data,6));

system("PAUSE");
return 0;
}

int greater60(int* parr,int n){
	int i,c=0;
	for(i=0;i<n;i++)
	{
		if(parr[i]>=60)
			c++;
	}
	return c;
}