/* TQC+ C - 904_2 */

#include<stdlib.h>
#include<stdio.h>

int main(){
    FILE *fi;
    char name[20];
    int score;

    fi=fopen("score.dat", "r");
    while(fscanf(fi,"%s %d",name,&score)!=EOF){/* 判斷讀取是否為檔案結尾 */
        printf("%s的C語言分數是%d\n",name,score);
    }
    fclose(fi);

    system("PAUSE");

    return 0;
}