
#include<stdlib.h>
#include<stdio.h>
struct node{
	char name[10];
	int score;
	struct node* next;};

int main(){
	
	
	struct node *a,*b,*c,*current;
	
	a=(node*)malloc(sizeof(node));//�t�m�ʺA�O����j�p�覡
	printf("�п�J�Ĥ@�Ӿǥͩm�W: ");
	scanf("%s",a->name);
	printf("����: ");
	scanf("%d",&a->score );
	a->next=NULL;//�]�����T�w�᭱�O�_�ٷ|�����СA�ҥH���]�w��NULL

	b=(node*)malloc(sizeof(node));
	printf("�п�J�ĤG�Ӿǥͩm�W: ");
	scanf("%s",b->name);
	printf("����: ");
	scanf("%d",&b->score );
	a->next=b;//b�]�w������A�K�T�wa���ᦳb
	b->next=NULL;//b���ᤣ�T�w�O�_�٦����СA�]�w��NULL

	c=(node*)malloc(sizeof(node));
	printf("�п�J�ĤT�Ӿǥͩm�W: ");
	scanf("%s",c->name);
	printf("����: ");
	scanf("%d",&c->score );
	b->next=c;
	c->next=NULL;
	printf("\n��X...\n");

	current = a;
	while(current!=NULL){
		printf("�ǥ�: %s\n",current->name);
		printf("����: %d\n\n",current->score);
		current=current->next;//�C��ܧ�����@���A�N���Ы����U�@��
	}

free(a);//����O����
 	 free(b);//����O����
	 free(c);//����O����
system("PAUSE");
return 0;
}

