#include<stdlib.h>
#include<stdio.h>

void m(int*, int*, int*);
void printbox(int,int,int*);

int main(){

int arr1[3][3];
int arr2[3][3];
int ans[3][3];
int i,j;
printf("�п�J�x�}�@...\n");

for(i=0;i<3;i++)
{
	for(j=0;j<3;j++){
		printf("m1[%d][%d]:",i,j);
		scanf("%d",&arr1[i][j]);
	}
}
printf("�п�J�x�}�G...\n");

for(i=0;i<3;i++)
{
	for(j=0;j<3;j++){
		printf("m2[%d][%d]:",i,j);
		scanf("%d",&arr2[i][j]);
	}
}
printf("\n�x�}�@\n");
printbox(3,3,arr1[0]);

printf("\n�x�}�G\n");
printbox(3,3,arr2[0]);

printf("\n�x�}�T\n");
m(arr1[0],arr2[0],ans[0]);

printbox(3,3,ans[0]);
system("PAUSE");
return 0;
}


void m(int* a1,int* a2,int* ans){
	int i,j;

		for(j=0;j<(3*3);j++)
		{
			*(ans+j) = *(a1+j)*(*(a2+j));

		}

}

void printbox(int x,int y,int* d){//x��y�C
	int i,j;
	int c=0;
	for(i=0;i<(x*y) ;i++){
	   printf("  %2d",*(d+i));
	   c++;
	   if(c==y)
	   {printf("\n");
	   c=0;
	   }
}
	
}
