#include<stdlib.h>
#include<stdio.h>


int main(){
	int i, c[6] ;
	c[0]=c[1]=c[2]=c[3]=c[4]=c[5]=0;//���N�L�̪�l�Ȭҳ]�w��0
	while(c[0]==c[1]&&
		  c[1]==c[2]&&
		  c[2]==c[3]&&
		  c[3]==c[4]&&
		  c[4]==c[5])//���󦡧P�_�A�O�_���ۦP���Ʀr
	{
		for(i=0;i<6;i++)
		{
			if(i%2==0)//���o��u�O���L���Ʀr��æӤw
				c[i]=rand()%20+rand()%29+2;
			else
				c[i]=rand()%49+1;

		}
			
	}
	printf("�Ʀr: ");
	for(i=0;i<6;i++)
	printf(" %d",c[i]);


system("PAUSE");
return 0;
}