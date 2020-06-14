/* TQC+ JAVA6 - 604_4 */

import java.util.HashMap;
import java.util.Iterator;

class Account{
	String name;
	double rate;
	int balance;

	Account(String s,double d){
		name = s;
		rate = d;
	}

	void setRate(double d){
		rate = d;
	}

	void deposit(int i){
		balance+=i;
	}

	void withdraw(int i){
		balance-=i;
	}

	int balance(){
		return balance;
	}

	void addInterest(){
		balance*=rate+1;
	}
}


class DepositAccount extends Account{
	DepositAccount(String s,int i){
		super(s,0.0);
		double d =0.0;
		switch(i){
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

class FreeAccount extends Account{
	FreeAccount(String s){
		super(s,0.02);
	}
}

class SpecialAccount extends Account{
	SpecialAccount(String s){
		super(s,0.02);
	}

	boolean isEmpt(){
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

	void buy(int i,int j){
		if(specialaccount.isEmpt())
			freeAccount.withdraw(i);
		else
			freeAccount.withdraw((int)(i*1.02));
		unit+=(double)i/(double)j;
	}
	void sell(double d,int i){
		if(specialaccount.isEmpt())
			freeAccount.deposit((int)(d*i));
		else
			freeAccount.deposit((int)(d*i*0.98));
		unit-=d;
	}
	int balance(int i){
		return (int)(unit*i);
	}
	double getUnit(){
		return unit;
	}
}

class InternetAccount{
	DepositAccount deposit;
	FreeAccount free;
	SpecialAccount specisl;
	FundAccount fund;
	InternetAccount(){}
	void setDeposit(DepositAccount d){
		deposit = d;
	}
	void setFree(FreeAccount f){
		free=f;
	}
	void setSpecial(SpecialAccount s){
		specisl=s;
	}
	void setFund(FundAccount ff){
		fund=ff;
	}
	int getTotalBalance(){
		return deposit.balance+free.balance+specisl.balance;
	}
}

//建立一個多基金的方法
class MultiFund{
	HashMap funds;
	//初始化建構子，使其產生一個HashMap
	MultiFund(){funds = new HashMap();}
	//增加新的基金方法
	void addFund(String s, FundAccount fundaccount){
		funds.put(s, fundaccount);
	}
	//列印出所有基金和擁有單位數
	void printEachUnit(){
		FundAccount fundaccount ;
		for(Iterator iterator = funds.values().iterator();iterator.hasNext();){
			fundaccount = (FundAccount)iterator.next();
			System.out.println(fundaccount.fundName+" : "+fundaccount.getUnit());
		}
	}
	//建立一個方法，傳入基金名稱、傳入單位金額
	int getFundBalance(String s ,int i){
		return ((FundAccount)funds.get(s)).balance(i);
	}
}

class JPA06_4 {
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
		InternetAccount internet = new InternetAccount();
		internet.setDeposit(deposit);
		internet.setFree(free);
		internet.setSpecial(special);
		internet.setFund(fund);
        //建立一個多帳戶的物件
		MultiFund multi = new MultiFund();
		//增加A基金(因A基金本身就存在，不需再另外建立)
		multi.addFund("A", fund);
		//建立一個B基金
		FundAccount fundB = new FundAccount("peter", "B", free, special);
		//購買每單位50元的基金，2000元
		fundB.buy(2000, 50);
		//增加B基金
		multi.addFund("B", fundB);
		//建立一個C基金
		FundAccount fundC = new FundAccount("peter", "C", free, special);
		//購買每單位30元的基金，5000元
		fundC.buy(5000, 30);
		multi.addFund("C", fundC);
		System.out.println("活期餘額：" + free.balance());
		//顯示特定基金的總現值，須傳入基金名稱和單位金額
		multi.printEachUnit();
       	System.out.println("B 基金餘額: " + multi.getFundBalance("B", 100));
    }
}
