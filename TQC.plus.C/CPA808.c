#include<stdlib.h>
#include<stdio.h>

void sorting(int*, int);

int main(){

int scoredata[10];
int i;
printf("�п�J�Q�Ӽ�...\n");
for(i=0;i<10;i++)
{
	printf("�� %d ��: ",(i+1));
	scanf("%d",&scoredata[i]);
}

printf("�Ƨǫe:");
for(i=0;i<10;i++)
	printf(" %d",scoredata[i]);

sorting(scoredata,10);//�]���O�ǫ��йL�h�A�ҥH���U�Ƨǧ�����A�O���餤���Ȥ]�w�g�ƦC�n�F

printf("\n�Ƨǫ�:");
for(i=0;i<10;i++)
	printf(" %d",scoredata[i]);


	system("PAUSE");
	return 0;
}

void sorting(int* data2,int n){//�o�D�ۭ���
	int i,j,LN=n-1;

  for(i=0;i<LN;i++)
   {
       for(j = 0;j<LN;j++)
       {
        
        if(data2[j]>data2[j+1])//�p�G�e�����ӭȡA�j��᭱���ȡA�h�洫
        {
         int temp = data2[j+1];
            data2[j+1] = data2[j];
           data2[j] = temp;
        }
       }
   }
//�ѤW�����{���X�i�o���Ӻt��k�ɶ������׬� n ����
}
