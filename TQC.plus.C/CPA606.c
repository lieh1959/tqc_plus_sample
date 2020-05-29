/* TQC+ C - 606 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    FILE *fptr;/* 宣告檔案的指標 */
    char ch;

    fptr=fopen("character.dat", "w");
    /* 開啟一個檔案，當檔案不存在時，會創建一個，並且設定模式，"w"寫入的意思 */
    printf("請輸入一字元: ");
    scanf("%c", &ch);

    /* 將一行多餘的字元丟掉 */
    while (getchar() != '\n') {
        continue;
    }

    /* 當讀取到*就停止 */
    while (ch != '*') {
        fprintf(fptr,"%c",ch);  /* fprintf(檔案指標,印入格式,來源); */
        /* 印到檔案裏面，平常的printf式印到銀幕給我們看，現在是印到檔案中 */
        printf("請輸入一字元: ");
        scanf("%c", &ch);
        /* 將一行多餘的字元丟掉 */
        while (getchar() != '\n') {
            continue;
        }
    }
    fclose(fptr);  /* 關閉檔案 */
    fptr=fopen("character.dat", "r");

    /* 開啟一個檔案，並且設定模式，"r"式讀取的意思 */
    printf("\n以下是您輸入的資料:\n");

    while (fscanf(fptr,"%c", &ch) != EOF)
    /* EOF : End Of File
     * 這邊的判斷式意思是如果沒有讀到檔案尾巴，就持續讀取檔案
     * 用法跟scanf一樣，僅差在多一個檔案的指標
     */
    {
        printf("%3c\n", ch);
    }
    system("PAUSE");

    return 0;
}
