#include <stdio.h>
#include <stdlib.h>

int main () 
{
	int i=1, total=0;
   while (i <= 100)
{
 		
		total += i;
		i++;//�ק�{�����޿�A�]��i�q1�}�l�A�ҥH�n���[��total�̭��A����A��i++���ʧ@
   } 
   printf("1�[��100���`�M:%d\n", total);
	system("PAUSE");
   return 0;
}

