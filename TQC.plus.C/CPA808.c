/* TQC+ C - 807 */

#include<stdlib.h>
#include<stdio.h>

void sorting(int*, int);

int main(){

    int scoredata[10];
    int i;

    printf("請輸入十個數...\n");
    for(i=0;i<10;i++){
       printf("第 %d 個: ",(i+1));
       scanf("%d",&scoredata[i]);
    }

   printf("排序前:");
   for(i=0;i<10;i++)
       printf(" %d",scoredata[i]);

    sorting(scoredata,10);
    /* 因為是傳指標過去，直接操作記憶體中的資料 */

    printf("\n排序後:");
    for(i=0;i<10;i++)
        printf(" %d",scoredata[i]);
    system("PAUSE");

    return 0;
}

void sorting(int* data2,int n){/* 這題著重於此 */

    int i,j,LN=n-1;

    for(i=0;i<LN;i++){
        for(j = 0;j<LN;j++){
            if(data2[j]>data2[j+1]){
            /* 如果前面那個值，大於後面的值，則交換 */
                int temp = data2[j+1];

                data2[j+1] = data2[j];
                data2[j] = temp;
            }
        }
    }
/* 由上面的程式碼可得知該演算法時間複雜度為 n 平方 */
}
