#include <stdio.h>
#include <stdlib.h>

int max(int a[], int n);
int main () 
{
	int arr[5], i, maximum;
	
	for(i=0; i<5; i++) {
		 printf("�п�J�}�Carr[%d]������: ", i);
		 scanf("%d", &arr[i]);//��ĳ��o�䪺����Ÿ��R��
	}
	
	for(i=0; i<5; i++)
		 printf("arr[%d]=%d\n", i, arr[i]);
	
	maximum=max(arr, 5);
	printf("���}�C�̤j�Ȭ�%d\n", maximum);
	system("PAUSE");
	return 0;
}

int max(int a[], int n)
{
	int k, M;
	M=a[0];
	for(k=1; k<n; k++){
		if (a[k]>M) {//�p�G�j���{���ܼ�M�A�h���NM����
			M=a[k];
		}
 	}
	return M;
}

