/* TQC+ C - 904_1 */

#include<stdlib.h>
#include<stdio.h>

int main()
{

    FILE *fi;
    char name[20];
    int score;

    fi=fopen("score.dat", "w"); /* 開啟檔案與寫入 */
    printf("請輸入學生的姓名(分數輸入負的分數時結束):");
    scanf("%s",name);
    printf("請輸入此學生C語言分數:");
    scanf("%d",&score);
    while(score>=0){ /* 條件是判斷，要數字非負數才會持續寫入 */
        fprintf(fi,"%s %d",name,score);
        printf("請輸入學生的姓名(分數輸入負的分數時結束):");
        scanf("%s",name);
        printf("請輸入此學生C語言分數:");
        scanf("%d",&score);
    }
    fclose(fi);
    system("PAUSE");

    return 0;
}