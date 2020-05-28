/* TQC+ C - 509 */

#include <stdio.h>
#include <stdlib.h>

struct  triangle {
  int width;
  int height;
};

int main ()
{
    triangle *ptri;
    /* 宣告一個triangle的指標 */
    double area;

    ptri=(triangle*) malloc(sizeof(triangle));
    /* 跟系統要記憶體空間
     * malloc()用來跟系統要記憶體空間的函數
     * 但是因為預設回傳型態是void*
     * 所以我們必須自行設定其回傳的型態(triangle*)
     * 別看到(triangle*)覺得不習慣，它也是一種型態
     * 例如：平常是這樣宣告的int *p，其實這跟int* p意思是一樣的
     */

    printf("請輸入三角形的底為多少: ");
    scanf("%d", &ptri->width);  /* ptri是指標，要呼叫裡面的項目必須用-> */
    printf("請輸入三角形的高為多少: ");
    scanf("%d", &ptri->height);
    area = (ptri->width * ptri->height)/2.;
    printf("三角形的面積為%.2f\n", area);
    system("PAUSE");

    return 0;
}
