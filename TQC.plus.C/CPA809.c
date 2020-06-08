/* TQC+ C - 809 */

#include <stdio.h>
#include <stdlib.h>

void sort(int*,int);
int main(){
    int arr[15];
    int arr2[5][3];
    int n = 15,i,j,number=0;

    printf("請輸入...\n");

    for(i=0;i<n;i++){
        printf("arr[%d]: ",i);
        scanf("%d",&arr[i]);
    }
    sort(arr,n);
    for(i=0;i<5;i++){
        for(j=0;j<3;j++){
            arr2[i][j] = arr[number];
            number++;
         }
    }

    printf("印出陣列...");
    for(i=0;i<5;i++){
        for(j=0;j<3;j++){
            printf("\narr2[%d][%d]=%d",i,j,arr2[i][j]);
        }
    }
    system("PAUSE");

    return 0;
}

void sort(int *data,int n){
    int i ,j,min,temp;

    for(i=0;i<n;i++){
        min =i;
        for(j=(i+1);j<n;j++){
            if(data[j]<data[min]){
                min =j ;
                temp =data[i];
                data[i]=data[min];
                data[min]=temp;
            }
        }
    }
}
