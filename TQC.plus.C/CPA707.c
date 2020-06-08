/* TQC+ C - 707 */

struct student {
 char name[20];
 int score;
};

typedef struct student ST;
/* 注意定義的順序 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* 因為我們要使用string的函數 */

int main ()
{
    ST stname;

    strcpy(stname.name , "Jonh"); /* 將字串複製進去該記憶體 */
    stname.score = 90;
    printf("%s的分數為%d\n", stname.name, stname.score);
    system("PAUSE");

    return 0;
}
