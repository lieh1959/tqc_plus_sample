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
	//�z�L���c�ŧi
	struct company employee[5]={//�b�o��A�]�������Ӥ������}�C�A�ҥH�A���n���t�n
		{"John", 20, 100.34},
		{"Mary", 30, 99.78},
		{"Peter", 25, 89.45}, 
		{"Nancy", 33, 87.42},
		{"Tom", 54, 77.89}
	};
	
	double salary[5];
	int i;
	for(i=0; i<5; i++)//�����޿�A�P�_���Ȼݭn�p��5
	{
	salary[i]=employee[i].hour*employee[i].pay;//�}�C������index�令�ʺA��i
	printf("%-10s ���~�����@%.2f\n", 
                employee[i].name,salary[i]);//salary[i]���ݩ�company���c�����ءA�ҥH���γz�L���c�覡�өI�s
	}
 	
	system("PAUSE");
     return 0;
}
