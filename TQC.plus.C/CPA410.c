#include <stdio.h>
#include <stdlib.h>

int Max(int *, int n, int m);

int main ( ) 
{
     int arr2[2][3];
	 int *pointer = &arr2[0][0];
	 int maximum, i, j;
	
	for (i=0; i<2; i++) {
		  for (j=0; j<3; j++) {
		      printf("�п�Jarr[%d][%d]: ", i, j);
		      scanf("%d", &arr2[i][j]);
		  }
	}
	
	printf("\n�}�C���Ȧp�U:\n");
	for (i=0; i<2; i++) {
		  for (j=0; j<3; j++) {
		      printf("arr[%d][%d]=%d\n", i, j, arr2[i][j]);
	}
	}
 	
	maximum=Max(pointer, 2, 3);//�Ȼݭn��Jarr2�]���䥻���N���G���}�C
 	printf("\n���}�C���̤j�Ȭ�%d\n", maximum);
	
	system("PAUSE");
	return 0;
}

int Max(int *p, int x, int y)
{
    	int i, j, maxi_value=*p;//���N���Щҫ��쪺�Ȩ��X
    	for (i=1; i<(x*y); i++) {//�O�����m�`�@������(2x3=6)
		  if (maxi_value < *(p+i)) {
			   maxi_value = *(p+i);
		    }
 		 
	}
	return maxi_value;
}

