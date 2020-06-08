/* TQC+ C - 908 */

#include<stdlib.h>
#include<stdio.h>
#include<time.h> /* 因為有用到時間函數要把它include */


int main()
{
    int i ,j,a;

    srand(time(NULL));
    /* 這個函數是要設定亂數的種子，因為其實亂數在產生時，
     * 其實如果運算在一定時間內，產生的亂數不會差異太大。
     * 這邊我們讓種子的基底數，會隨時間而不一樣
     */
    for(i=0;i<10;i++){
        for(j=0;j<10;j++){
            a=(rand()%1000)+1; /* 亂數區間設定方式 */
            printf(" %3d ",a); /* 排版要排好 */
        }
        printf("\n");
    }

    system("PAUSE");

    return 0;
}