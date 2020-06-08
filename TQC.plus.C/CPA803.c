/* TQC+ C - 803 */

#include<stdio.h>
#include<stdlib.h>

int main(){
    int i=0,a=0,b=0,c=0;
    int ch;

    while(i<10){/* 總共有10票 */
        printf("(1)小蔡\n(2)小王\n(3)小史\n請你投票:");
        scanf("%d",&ch);
        if(ch==1)
            a++;
        else if(ch==2)
            b++;
        else if(ch==3)
            c++;
        else;/* 輸入1~3以外的數字，我們便把它當成廢票 */
        printf("\n小蔡得票數%d\n小王得票數%d\n小史得票數%d\n\n",a,b,c);
        i++;
    }
    system("PAUSE");

    return 0;
}