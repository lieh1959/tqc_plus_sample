#include <stdio.h>
#include <stdlib.h>

int main () 
{
    FILE *fptr;//�ŧi�ɮת�����
 	char ch;
	fptr=fopen("character.dat", "w");
	//�}�Ҥ@���ɮסA���ɮפ��s�b�ɡA�|�Ыؤ@�ӡA�åB�]�w�Ҧ��A"w"�g�J���N��
 	printf("�п�J�@�r��: ");
	scanf("%c", &ch);
	
	//�N�@��h�l���r���ᱼ
	while (getchar() != '\n') {
	continue;
	}
	
	//��Ū����*�N����
	while (ch != '*') {
	fprintf(fptr,"%c",ch);//fprintf(�ɮ׫���,�L�J�榡,�ӷ�);
	//�L���ɮ��ح��A���`��printf���L��ȹ����ڭ̬ݡA�{�b�O�L���ɮפ�
 	printf("�п�J�@�r��: ");
	scanf("%c", &ch);
	//�N�@��h�l���r���ᱼ
	while (getchar() != '\n') {
	continue;
	}	
	}
	
     fclose(fptr);//�����ɮ�
	
	fptr=fopen("character.dat", "r");
	//�}�Ҥ@���ɮסA�åB�]�w�Ҧ��A"r"��Ū�����N��
	printf("\n�H�U�O�z��J�����:\n");
	while (fscanf(fptr,"%c", &ch) != EOF) //EOF=End Of File
		//�o�䪺�P�_���N��O�p�G�S��Ū���ɮק��ڡA�N����Ū���ɮ�
			//�Ϊk��scanf�@�ˡA�Ȯt�b�h�@���ɮת�����
	{
	printf("%3c\n", ch);
	}
	system("PAUSE");
	return 0;
}

