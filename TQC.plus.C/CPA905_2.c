/* TQC+ C - 905_2 */

#include<stdlib.h>
#include<stdio.h>

int main(){
    FILE *fi;
    double ss;

    fi = fopen("dnumber.dat","r");
    while(fscanf(fi," %lf ",&ss)!=EOF){
        printf("%.2lf\n",ss);//注意排版問題
    }
    fclose(fi);//檔案不使用後，請關閉檔案，雖然程式結束後也會關閉檔案
    system("PAUSE");

    return 0;
}