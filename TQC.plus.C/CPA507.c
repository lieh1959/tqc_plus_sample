#include <stdio.h>
#include <stdlib.h>
//struct宣告筆者習慣在int main()外面
struct  company {
	char name[10];
	int hour;
	double pay;
 	};

int main () 
{
	//透過結構宣告
	struct company employee[5]={//在這邊，因為維五個元素的陣列，所以括號要分配好
		{"John", 20, 100.34},
		{"Mary", 30, 99.78},
		{"Peter", 25, 89.45}, 
		{"Nancy", 33, 87.42},
		{"Tom", 54, 77.89}
	};
	
	double salary[5];
	int i;
	for(i=0; i<5; i++)//改變邏輯，判斷式僅需要小於5
	{
	salary[i]=employee[i].hour*employee[i].pay;//陣列的中的index改成動態的i
	printf("%-10s 的薪水為　%.2f\n", 
                employee[i].name,salary[i]);//salary[i]不屬於company結構的項目，所以不用透過結構方式來呼叫
	}
 	
	system("PAUSE");
     return 0;
}
