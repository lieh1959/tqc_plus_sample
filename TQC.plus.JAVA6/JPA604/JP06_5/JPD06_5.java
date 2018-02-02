package JPA604.JP06_5;

import java.util.HashMap;
import java.util.Iterator;

class Account{
	String name;
	double rate;
	int balance;
	
	Account(String s,double d){name = s;rate = d;}
	
	void setRate(double d){rate = d;}
	
	void deposit(int i){balance+=i;}
	
	void withdraw(int i) throws Exception
	{
		//設定當提款金額大於存款金額時，丟出錯誤訊息
	if(balance<i)
		{throw new Exception(name+"提款金額:"+i+"大於存款金額:"+balance);}
	else
		{balance-=i;
		return;
		}
		
	}
	
	int balance()
	{return balance;}
	
	void addInterest()
	{balance*=rate+1;}
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
{
	FreeAccount(String s)
	{super(s,0.02);}
}

class SpecialAccount extends Account
{
	SpecialAccount(String s)
	{
		super(s,0.02);
	}
boolean isEmpt()
{
	return balance>10000;
}

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
		//此處也有使用到提款功能，也須將try catch崁入
		try{
		if(specialaccount.isEmpt())
			freeAccount.withdraw(i);
		else
			freeAccount.withdraw((int)(i*1.02));
		unit+=(double)i/(double)j;
		}
		catch(Exception ex)
		{System.out.println(ex.getMessage());}
	}
	void sell(double d,int i)
	{
		if(specialaccount.isEmpt())
			freeAccount.deposit((int)(d*i));
		else
			freeAccount.deposit((int)(d*i*0.98));
		unit-=d;
	}
	int balance(int i)
	{
		return (int)(unit*i);
	}
	double getUnit()
	{
		return unit;
	}
	
	
}

class InternetAccount{
	DepositAccount deposit;
	FreeAccount free;
	SpecialAccount specisl;
	FundAccount fund;
	InternetAccount(){}
	void setDeposit(DepositAccount d){deposit = d;}
	void setFree(FreeAccount f){free=f;}
	void setSpecial(SpecialAccount s){specisl=s;}
	void setFund(FundAccount ff){fund=ff;}
	int getTotalBalance()
	{return deposit.balance+free.balance+specisl.balance;}
	
}



class MultiFund
{
   
	HashMap funds;
	MultiFund(){funds = new HashMap();}
	void addFund(String s, FundAccount fundaccount)
	{funds.put(s, fundaccount);}
	
	void printEachUnit()
	{
		FundAccount fundaccount ;
		for(Iterator iterator = funds.values().iterator();iterator.hasNext();System.out.println(fundaccount.fundName+" : "+fundaccount.getUnit()))
		{
			
			fundaccount = (FundAccount)iterator.next();
		}
	}
	
	int getFundBalance(String s ,int i)
	{
		return ((FundAccount)funds.get(s)).balance(i);
	}
	
	
	
}
class JPD06_5 {
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
		 //加入try catch，確保可以抓取錯誤提款訊息 
		try {
		    fund.buy(15000, 500);
        	special.withdraw(5000);
			fund.buy(2000, 300);
			fund.sell(fund.getUnit(), 400);			
			InternetAccount internet = new InternetAccount();
			internet.setDeposit(deposit);
			internet.setFree(free);
			internet.setSpecial(special);
			internet.setFund(fund);
			MultiFund multi = new MultiFund();
			multi.addFund("A", fund);
			FundAccount fundB = new FundAccount("peter", "B", free, special);
			fundB.buy(2000, 50);
			multi.addFund("B", fundB);
			FundAccount fundC = new FundAccount("peter", "C", free, special);
			fundC.buy(5000, 30);
			multi.addFund("C", fundC);
            fund.buy(14000, 300); 
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}