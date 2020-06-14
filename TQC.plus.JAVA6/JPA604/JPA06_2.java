/* TQC+ JAVA6 - 604_2 */

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
				d=0.03;
				break;
			case 2:
				d=0.04;
				break;
			case 3:
				d=0.05;
				break;
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

class JPA06_2 {
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
        //從優惠帳戶中提款5000元
       	special.withdraw(5000);
		//再買入2000元的基金，以每單位300元購入
       	fund.buy(2000, 300);
		System.out.println("基金餘額：" + fund.balance(300));
		System.out.println("售出前活期餘額：" + fund.freeAccount.balance());
        //賣出全部的股，以每單位400元賣出
		fund.sell(fund.getUnit(), 400);
		//這邊的fund.freeAccount.balance()，是透過fund裡面的freeAccount的balance來取出餘額的，因為fund本身的balance沒有儲存金額進去
		System.out.println("售出後活期餘額：" + fund.freeAccount.balance());
	}
}
