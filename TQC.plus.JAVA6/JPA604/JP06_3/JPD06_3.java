package JPA604.JP06_3;

class Account{
	String name;
	double rate;
	int balance;
	
	Account(String s,double d){name = s;rate = d;}
	void setRate(double d){rate = d;}
	void deposit(int i){balance+=i;}
	void withdraw(int i){balance-=i;}
	int balance(){return balance;}
	void addInterest(){balance*=rate+1;}
}


class DepositAccount extends Account{
	
	DepositAccount(String s,int i)
	{
		super(s,0.0);
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
		super.setRate(d);	
	}
}

class FreeAccount extends Account
{FreeAccount(String s){super(s,0.02);}}

class SpecialAccount extends Account
{
	SpecialAccount(String s)
	{super(s,0.02);}
boolean isEmpt(){return balance>10000;}
}

class FundAccount extends Account{
	String fundName;
	FreeAccount freeAccount;
	SpecialAccount specialaccount;
	double unit;
	FundAccount(String s,String s1,FreeAccount f,SpecialAccount sa){
	super(s,0.0);
	fundName = s1;
	freeAccount = f;
	specialaccount =sa;
	}
	
	void buy(int i,int j)
	{
		if(specialaccount.isEmpt())
			freeAccount.withdraw(i);
		else
			freeAccount.withdraw((int)(i*1.02));
		unit+=(double)i/(double)j;
	}
	void sell(double d,int i)
	{
		if(specialaccount.isEmpt())
			freeAccount.deposit((int)(d*i));
		else
			freeAccount.deposit((int)(d*i*0.98));
		unit-=d;
	}
	int balance(int i){return (int)(unit*i);}
	double getUnit(){return unit;}
}
//建立網路帳戶方法
class InternetAccount{
	DepositAccount deposit;
	FreeAccount free;
	SpecialAccount specisl;
	FundAccount fund;
	InternetAccount(){}
	//從外部傳入定期存款戶物件
	void setDeposit(DepositAccount d){deposit = d;}
	//從外部傳入活期存款戶物件
	void setFree(FreeAccount f){free=f;}
	//從外部傳入優惠存款戶物件
	void setSpecial(SpecialAccount s){specisl=s;}
	void setFund(FundAccount ff){fund=ff;}
	int getTotalBalance(){return deposit.balance+free.balance+specisl.balance;}
}

class JPD06_3 {
	public static void main(String args[]) {
		DepositAccount deposit = new DepositAccount("peter", 2);
		deposit.deposit(5000);
		FreeAccount free = new FreeAccount("peter");
		free.deposit(20000);
		SpecialAccount special = new SpecialAccount("peter");
		special.deposit(10000);
		deposit.addInterest();
		free.addInterest();
		special.addInterest();
        FundAccount fund = new FundAccount("peter", "A", free, special);
		fund.buy(15000, 500);
       	special.withdraw(5000);
		fund.buy(2000, 300);
		fund.sell(fund.getUnit(), 400);					
		//產生一個網路銀行的物件
		InternetAccount internet = new InternetAccount();
	    //設定定期帳戶
		internet.setDeposit(deposit);
		//設定活期帳戶
		internet.setFree(free);
		//設定優惠帳戶
		internet.setSpecial(special);
		//設定基金帳戶
		internet.setFund(fund);
		System.out.println("存款總額：" + internet.getTotalBalance());
	}
}