#include <stdio.h>
#include <stdlib.h>

int main()
{
	int arr[6]={10, 20, 30, 40, 50, 60};//有六個元素，大小應設定為6
	int i, total=0;
	for (i=0; i<6; i++) {//陣列的index從0開始
  		  total += arr[i];
	}
	
	printf("總和為%d\n", total);//顯示的數字為整數請用%d
	system("PAUSE");
	return 0;
}
