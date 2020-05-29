/* TQC+ C - 604 */

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>  /* 這邊有用到getche()的功能，所以必須include <conio.h> */
#include <ctype.h>  /* 英文字元間的轉換需要include<ctype.h> */

int main ()
{
    char ch, ch2;

    printf("請輸入一小寫的英文字母: ");
    ch=getche();  /* getche()這個函式只要一偵測到有字元輸入，就會立即毒入 */

    /* 將下列的字元轉為大寫 */
    ch2=toupper(ch);  /* 英文小寫轉成大寫的函式toupper() */
    printf("\n%c的大寫是%c", ch, ch2);

    /* 將下列的字元轉為小寫 */
    printf("\n請輸入一大寫的英文字母: ");
    scanf("%c", &ch);
    ch2=tolower(ch);
    printf("%c的小寫是%c\n", ch, ch2);
    system("PAUSE");

    return 0;
}
