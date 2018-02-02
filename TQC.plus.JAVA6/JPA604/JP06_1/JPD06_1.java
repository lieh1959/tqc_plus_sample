package JPA604.JP06_1;
class Account{
	String name;//�}��H
	double rate;//�~�Q�v
	int balance;//�b��l�B
	//�غc�l�A�]�w�W�r�M�Q�v
	Account(String s,double d){name = s;rate = d;}
	//�]�w�Q�v
	void setRate(double d){rate = d;}
	//�s��
	void deposit(int i){balance+=i;}
	//����
	void withdraw(int i){balance-=i;}
	//�l�B�d��
	int balance(){return balance;}
	//�[�p�Q���A�N�Q���Q�v����+1
	void addInterest(){balance*=rate+1;}
}

//�w���s�ڤ��k�A�~��Account���Ҧ������Τ�k
class DepositAccount extends Account{
	DepositAccount(String s,int i)
	{
		super(s,0.0);//�ϥΤ��˪��غc�l�A��l�Ʃm�W�M�~�Q�v
		double d =0.0;
		switch(i)
		{
		case 1:
			d=0.03;break;
		case 2:
			d=0.04;break;
		case 3:
			d=0.05;break;
		}
		setRate(d);//�]�w�~�Q�v	
	}
}

//�����s�ڤ��k�A�~��Account���Ҧ������Τ�k
class FreeAccount extends Account
{
	FreeAccount(String s)
	{super(s,0.02);/*�ϥΤ��˪��غc�l�A��l�Ʃm�W�M�~�Q�v*/}
}

//�u�f�s�ڤ��k�A�~��Account���Ҧ������Τ�k
class SpecialAccount extends Account
{
	SpecialAccount(String s){super(s,0.02);}
	//�P�_�R����O�_�K����O��k�A�j��10000�h�^��true
	boolean isEmpt()
	{return balance>10000;}
}

//����s�ڤ��k�A�~��Account���Ҧ������Τ�k
class FundAccount extends Account{
	String fundName;//����W��
	FreeAccount freeAccount;//�����s�ڤ�
	SpecialAccount specialaccount;//�u�f�s�ڤ�
	double unit;//�ʶR������(����x�s�覡�O�H�Ѭ����A�Ӥ��O�H���B�A�����B�H�ɳ����i�຦�^)
	//�غc�l�A��l�ưѼơA�q�~���ǤJ"�}��H"�B"����W��"�B"�����s�ڤ᪫��"�B"�u�f�s�ڤ᪫��"�A�|�ӰѼ�
	FundAccount(String s,String s1,FreeAccount f,SpecialAccount sa){
	super(s,0.0);
	fundName = s1;
	freeAccount = f;
	specialaccount =sa;
	}
	//�ʶR�����k
	void buy(int i,int j)//i�ʶR���B�Aj�����B
	{
		//�Q���u�f�s���ˬd�O�_�l�B�j��10000�A�����u�f
		if(specialaccount.isEmpt())
			//��������
			freeAccount.withdraw(i);
		else
			//�h���X����O2%����
			freeAccount.withdraw((int)(i*1.02));
	    //�ʶR���=�ʶR���B/�C�����B
		unit+=(double)i/(double)j;
	}
	
	void sell(double d,int i)//d������,�C�����B
	{
		//�Q���u�f�s���ˬd�O�_�l�B�j��10000�A�����u�f
		if(specialaccount.isEmpt())
			//�����s��
			freeAccount.deposit((int)(d*i));
		else
			//��������O2%�b�i��s��
			freeAccount.deposit((int)(d*i*0.98));
		unit-=d;
	}
	//�N��������B�ǤJ�A���W�������ơA�^���`����{�B
	int balance(int i){return (int)(unit*i);}
	//���o�����h�ֳ����
	double getUnit(){return unit;}
}

class JPD06_1 {
	public static void main(String args[]) {
		//��Peter�}�өw���b��A��~����
		DepositAccount deposit = new DepositAccount("peter", 2);
		//�s��5000��
		deposit.deposit(5000);
		//��Peter�}�Ӭ����b��
		FreeAccount free = new FreeAccount("peter");
		//�s��20000
		free.deposit(20000);
		//��Peter�}���u�f�b��
		SpecialAccount special = new SpecialAccount("peter");
		//�s��10000
		special.deposit(10000);
		//�Q�Υ[�p�Q���W�[�b��l�B
		deposit.addInterest();
		free.addInterest();
		special.addInterest();
        //��ܭӱb�᪺�l�B
		System.out.println("�w���s�ڡG" + deposit.balance());
		System.out.println("�����s�ڡG" + free.balance());
		System.out.println("�u�f�s�ڡG" + special.balance());		
		//��Peter�إߤ@�Ӱ���b��A�W�٬�"A"
		FundAccount fund = new FundAccount("peter", "A", free, special);
		//�ʤJ15000��������A�B�C��쬰500��
		fund.buy(15000, 500);
		System.out.println("����{�B�G" + fund.balance(300));
		System.out.println("�����l�B�G" + fund.freeAccount.balance());
	}
}