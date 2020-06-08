/* TQC+ C - 804 */

#include<stdlib.h>
#include<stdio.h>

double average(double* ,int );

int main(){
    int i;
    double cc[6],ans;
    for(i =0;i<6;i++){
        printf("請輸入第%d個浮點數:",(i+1));
        scanf("%lf",&cc[i]);
    }
    printf("\n您輸入的陣列值如下");
    for(i =0;i<6;i++)
        printf("\ndata[%d]:%.2f",i,cc[i]);
    ans = average(cc,6);
    printf("\n平均:%.2f",ans);
    system("PAUSE");

    return 0;
}

double average(double* arr2,int n){  /* 陣列傳參數方式，使用指標 */
    double total=0;
    int i ;

    for(i=0;i<n;i++ )
        total+=*(arr2+i);  /* 注意指標呼叫指標內的值 */
    total/=n;

    return total;
}
