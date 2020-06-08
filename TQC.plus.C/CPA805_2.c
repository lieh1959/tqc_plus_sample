/* TQC+ C - 805_2 */

#include<stdlib.h>
#include<stdio.h>

int main(){

    int arr[5][2];
    int i,j,tot=0;

    for(i=0;i<5;i++){ /* 控制列 */
        printf("請輸入兩個數字(數字之間請以空白為間隔):");
        for(j=0;j<2;j++){ /* 控制行 */
            scanf("%d",&arr[i][j]);
            tot+=arr[i][j];
        }
        printf("\n");
    }

    for(i=0;i<5;i++){
        for(j=0;j<2;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }

    printf("sum:%d\n",tot);
    system("PAUSE");

    return 0;
}