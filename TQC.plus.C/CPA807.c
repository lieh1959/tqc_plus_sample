/* TQC+ C - 807 */

#include<stdlib.h>
#include<stdio.h>

void multiply(int);
void printStar(int);

int main(){

    int m,s;

    printf("請輸入您要幾成己的乘法表(最多10):");
    scanf("%d",&m);
    printf("\n請輸入您要幾個星星(*):");
    scanf("%d",&s);
    printStar(s);
    if(m<=10)
        multiply(m);
    printStar(s);
    system("PAUSE");

    return 0;
}

void multiply(int n){
   int i,j;

    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++)
            printf("%2d  ",(i*j));//這題緊跟上一題差別在顯示而已
            printf("\n");
        }
}

void printStar(int n)
{
   int i;
   for(i=0;i<n;i++)
       printf("*");
   printf("\n");
}
