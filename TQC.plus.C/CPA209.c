#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int i=1, total=0;//�n�]�w�[�`����l�Ȭ�0 
	do {
	if(i%2==1)//�]�w����A�p�G���_�Ƥ~�i�h�[�`
	total += i;
	i++;//�ק��޿�A�n���[�i�h�A�~��++
	} while (i<=100);//���Odo-while���P�_���᭱�@�w�n�[����
	
	printf("1��100���_�ƩM: %d\n", total);
	system("PAUSE");
     return 0;
}
