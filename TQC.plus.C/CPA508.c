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
	company employee[5];	
	double salary[5];
	int i;
	
	for (i=0; i<5; i++) 
	{
		  printf("請輸入第%d位員工的姓名: ", i+1);
		  scanf("%s", &employee[i].name);//補上&參照
		  printf("請輸入第%d位員工的工作時數: ", i+1);
		  scanf("%d", &employee[i].hour);//補上&參照
		  printf("請輸入第%d位員工一小時的工資: ", i+1);
		  scanf("%lf", &employee[i].pay);//補上&參照，並且改成%lf因為要輸入的是double
	}
	
	for(i=0; i<5; i++)
	{
		  salary[i]=employee[i].hour*employee[i].pay;
		  printf("%-10s 的薪水為　%.2f\n", 
               employee[i].name, salary[i]);//salary[i]不屬於結構company的項目
	}

	system("PAUSE");
     return 0;
}

