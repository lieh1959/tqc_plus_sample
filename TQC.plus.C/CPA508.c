#include <stdio.h>
#include <stdlib.h>

//struct�ŧi���̲ߺD�bint main()�~��
struct  company {
	char name[10];
	int hour;
	double pay;
 	};


int main () 
{
	company employee[5];	
	double salary[5];
	int i;
	
	for (i=0; i<5; i++) 
	{
		  printf("�п�J��%d����u���m�W: ", i+1);
		  scanf("%s", &employee[i].name);//�ɤW&�ѷ�
		  printf("�п�J��%d����u���u�@�ɼ�: ", i+1);
		  scanf("%d", &employee[i].hour);//�ɤW&�ѷ�
		  printf("�п�J��%d����u�@�p�ɪ��u��: ", i+1);
		  scanf("%lf", &employee[i].pay);//�ɤW&�ѷӡA�åB�令%lf�]���n��J���Odouble
	}
	
	for(i=0; i<5; i++)
	{
		  salary[i]=employee[i].hour*employee[i].pay;
		  printf("%-10s ���~�����@%.2f\n", 
               employee[i].name, salary[i]);//salary[i]���ݩ󵲺ccompany������
	}

	system("PAUSE");
     return 0;
}

