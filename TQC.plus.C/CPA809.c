#include<stdlib.h>
#include<stdio.h>

void sorting(int*, int);

int main(){

int arr[15];
int i;
printf("�п�J...\n");
for(i=0;i<15;i++)
{
	printf("arr[%d]: ",i);
	scanf("%d",&arr[i]);
}

sorting(arr,15);

printf("\n�L�X�}�C:\n");
for(i=0;i<15;i++)
	printf("arr[%d]: %d\n",i,arr[i]);


	system("PAUSE");
	return 0;
}

void sorting(int* d,int n){
	int LN =n;
     int i,j,min,temp;
     for(i = 0 ; i < LN ; i++)
     {
      //���N�@�}�l����m�g�J
      min=i;
      for(j=(i+1);j<LN;j++)
       if(d[j]<d[min])//�p�G�����񥦧�p���A�h�N�̤p���g�Jmin
        min=j;
       //�N��ƭȤ��ۥ洫
      temp = d[i];
      d[i] = d[min];
      d[min]=temp;
     }
}
