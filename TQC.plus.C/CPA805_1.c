/* TQC+ C - 805_1 */

#include<stdlib.h>
#include<stdio.h>

int main(){

    int arr[3][4];
    int i,j,tot=0;

    for(i=0;i<3;i++){ /* 控制列 */
        printf("請輸入四個數字(數字之間請以空白為間隔):");
        for(j=0;j<4;j++){ /* 控制行 */
            scanf("%d",&arr[i][j]);
            tot+=arr[i][j];
        }
        printf("\n");
    }

    for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }

    printf("sum:%d\n",tot);
    system("PAUSE");

    return 0;
}


