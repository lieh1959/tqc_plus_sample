#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int i, total=0;//�]�w�[�`��l�Ȭ�0 
	for (i=1; i<=100; i++)//�ק�P�_���޿�Afor(...)�᭱���i�H�������A�|�ܱo�L�N�q
	if(i%2==0)//�]�w����A�p�G�����ơA�h�i�J�[�`
			total += i;
	
	printf("1��100�����ƩM: %d\n", total);
	system("PAUSE");
     return 0;
}

