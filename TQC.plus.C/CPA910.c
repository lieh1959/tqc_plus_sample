
#include<stdlib.h>
#include<stdio.h>
struct node{
	char name[10];
	int score;
	struct node* next;};

int main(){
	
	
	struct node *a,*b,*c,*current;
	
	a=(node*)malloc(sizeof(node));//配置動態記憶體大小方式
	printf("請輸入第一個學生姓名: ");
	scanf("%s",a->name);
	printf("分數: ");
	scanf("%d",&a->score );
	a->next=NULL;//因為不確定後面是否還會有指標，所以先設定成NULL

	b=(node*)malloc(sizeof(node));
	printf("請輸入第二個學生姓名: ");
	scanf("%s",b->name);
	printf("分數: ");
	scanf("%d",&b->score );
	a->next=b;//b設定完成後，便確定a之後有b
	b->next=NULL;//b之後不確定是否還有指標，設定成NULL

	c=(node*)malloc(sizeof(node));
	printf("請輸入第三個學生姓名: ");
	scanf("%s",c->name);
	printf("分數: ");
	scanf("%d",&c->score );
	b->next=c;
	c->next=NULL;
	printf("\n輸出...\n");

	current = a;
	while(current!=NULL){
		printf("學生: %s\n",current->name);
		printf("分數: %d\n\n",current->score);
		current=current->next;//每顯示完畢後一次，將指標指給下一個
	}

free(a);//釋放記憶體
 	 free(b);//釋放記憶體
	 free(c);//釋放記憶體
system("PAUSE");
return 0;
}

