#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main () 
{
     FILE *fptr;
	char name[20];
	int score;
	fptr=fopen("score.dat", "w");
	printf("請輸入姓名: ");
	scanf("%s", name);
	printf("請輸入分數: ");
	scanf("%d", &score);
	
	while (score != -100) {
	fprintf(fptr,"%s %d", name, score);
	//做有關檔案讀取時，參數的第一個通常需要先告知檔案的指標
	printf("請輸入姓名: ");
	scanf("%s", name);
	printf("請輸入分數: ");
	scanf("%d", &score);		
	}
	
     fclose(fptr);
	
	fptr=fopen("score.dat", "r");
	printf("\n以下是您輸入的資料:\n");
	while (fscanf(fptr,"%s %d", name, &score) !=EOF) 
	printf("%-10s %3d\n", name, score);
	
	system("PAUSE");
	return 0;
}
