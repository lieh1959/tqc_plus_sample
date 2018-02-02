#include<stdlib.h>
#include<stdio.h>


int main(){
	int i, c[6] ;
	c[0]=c[1]=c[2]=c[3]=c[4]=c[5]=0;//先將他們初始值皆設定為0
	while(c[0]==c[1]&&
		  c[1]==c[2]&&
		  c[2]==c[3]&&
		  c[3]==c[4]&&
		  c[4]==c[5])//條件式判斷，是否有相同的數字
	{
		for(i=0;i<6;i++)
		{
			if(i%2==0)//其實這邊只是讓他的數字更亂而已
				c[i]=rand()%20+rand()%29+2;
			else
				c[i]=rand()%49+1;

		}
			
	}
	printf("數字: ");
	for(i=0;i<6;i++)
	printf(" %d",c[i]);


system("PAUSE");
return 0;
}