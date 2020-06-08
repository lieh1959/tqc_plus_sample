/* TQC+ C - 905_1 */

#include<stdlib.h>
#include<stdio.h>

int main(){
    FILE *fi;
    double ss;

    fi = fopen("dnumber.dat","w");
    printf("請輸入浮點數:");
    scanf("%lf",&ss);
    while(ss!=-99.99){//當使用者輸入為-99.99時，停止寫入
        fprintf(fi," %lf ",ss);
        printf("請輸入浮點數:");
        scanf("%lf",&ss);
    }
    fclose(fi);
    system("PAUSE");

    return 0;
}