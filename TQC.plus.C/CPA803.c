#include<stdio.h>
#include<stdlib.h>

int main(){
	int i=0,a=0,b=0,c=0;
	int ch;
	while(i<10){//������10Ʊ
		printf("(1)С��\n(2)С��\n(3)Сʷ\nՈ��ͶƱ:");
		scanf("%d",&ch);
		if(ch==1)
			a++;
		else if(ch==2)
			b++;
		else if(ch==3)
			c++;
		else;//ݔ��1~3����Ĕ��֣��҂���������ɏUƱ
		printf("\nС�̵�Ʊ��%d\nС����Ʊ��%d\nСʷ��Ʊ��%d\n\n",a,b,c);
		i++;
	}
	system("PAUSE");
	return 0;

}