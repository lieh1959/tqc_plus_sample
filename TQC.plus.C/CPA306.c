#include <stdio.h>
#include <stdlib.h>

int main()
{
	int arr[6]={10, 20, 30, 40, 50, 60};//�����Ӥ����A�j�p���]�w��6
	int i, total=0;
	for (i=0; i<6; i++) {//�}�C��index�q0�}�l
  		  total += arr[i];
	}
	
	printf("�`�M��%d\n", total);//��ܪ��Ʀr����ƽХ�%d
	system("PAUSE");
	return 0;
}
