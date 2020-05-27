/* TQC+ C - 204 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    char ch = NULL;

    printf("請問您的身份:以字母表示分別如下：\nU:表示大學生，M:表示研究生，P:表示博士生 ");
    scanf("%c", &ch);
    switch (ch) {
        case 'U':
            printf("您是大學生\n");
            break;
        case 'M':
            printf("您是研究生\n");
            break;
        case 'P':
            printf("您是博士生\n");
            break;
        default:
            printf("您輸入身份不正確\n");
    }
    system("PAUSE");

    return 0;
}
