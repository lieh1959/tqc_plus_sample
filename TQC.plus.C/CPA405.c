#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int arr[2][3]={{100, 200, 300},{ 400, 500, 600}};//�}�C�O2x3���A�ҥH�n���t�n�����G���}�C
	int *ptr2[2]={arr[0], arr[1]};
  	int i, j;
 
	
	for (i=0; i<2; i++) {
		for (j=0; j<3; j++) {
			printf("arr[%d][%d]=%d\n", i, j, arr[i][j]);
		}
 	}
	
	
	//�t�@�ت�ܤ�k
	printf("\n�t�@�ت�ܤ�k\n");
	for (i=0; i<2; i++) {
		for (j=0; j<3; j++) {
			printf("arr[%d][%d]=%d\n", i, j, *(arr[i]+j));//�ɤW*���L�i�H�z�L����Ū����
		}
	}
	
	
	//�ĤT�ت�ܤ�k
	printf("\n�ĤT�ت�ܤ�k\n");
	for (i=0; i<2; i++) {
		for (j=0; j<3; j++) {
			printf("arr[%d][%d]=%d\n", i, j, *(*(ptr2+i)+j));//��m�n�ɤW*
		}
	}
 	
	system("PAUSE");
	return 0;
}
