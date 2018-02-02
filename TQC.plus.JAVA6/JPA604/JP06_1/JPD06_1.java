package JPA604.JP06_1;
class Account{
	String name;//開戶人
	double rate;//年利率
	int balance;//帳戶餘額
	//建構子，設定名字和利率
	Account(String s,double d){name = s;rate = d;}
	//設定利率
	void setRate(double d){rate = d;}
	//存款
	void deposit(int i){balance+=i;}
	//提款
	void withdraw(int i){balance-=i;}
	//餘額查詢
	int balance(){return balance;}
	//加計利息，將利息利率整體+1
	void addInterest(){balance*=rate+1;}
}

//定期存款戶方法，繼承Account的所有成員及方法
class DepositAccount extends Account{
	DepositAccount(String s,int i)
	{
		super(s,0.0);//使用父親的建構子，初始化姓名和年利率
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
		setRate(d);//設定年利率	
	}
}

//活期存款戶方法，繼承Account的所有成員及方法
class FreeAccount extends Account
{
	FreeAccount(String s)
	{super(s,0.02);/*使用父親的建構子，初始化姓名和年利率*/}
}

//優惠存款戶方法，繼承Account的所有成員及方法
class SpecialAccount extends Account
{
	SpecialAccount(String s){super(s,0.02);}
	//判斷買基金是否免手續費方法，大於10000則回傳true
	boolean isEmpt()
	{return balance>10000;}
}

//基金存款戶方法，繼承Account的所有成員及方法
class FundAccount extends Account{
	String fundName;//基金名稱
	FreeAccount freeAccount;//活期存款戶
	SpecialAccount specialaccount;//優惠存款戶
	double unit;//購買基金單位(基金儲存方式是以股為單位，而不是以金額，單位金額隨時都有可能漲跌)
	//建構子，初始化參數，從外部傳入"開戶人"、"基金名稱"、"活期存款戶物件"、"優惠存款戶物件"，四個參數
	FundAccount(String s,String s1,FreeAccount f,SpecialAccount sa){
	super(s,0.0);
	fundName = s1;
	freeAccount = f;
	specialaccount =sa;
	}
	//購買基金方法
	void buy(int i,int j)//i購買金額，j單位金額
	{
		//利用優惠存款檢查是否餘額大於10000再給予優惠
		if(specialaccount.isEmpt())
			//直接提款
			freeAccount.withdraw(i);
		else
			//多提出手續費2%扣除
			freeAccount.withdraw((int)(i*1.02));
	    //購買單位=購買金額/每單位金額
		unit+=(double)i/(double)j;
	}
	
	void sell(double d,int i)//d基金單位,每單位金額
	{
		//利用優惠存款檢查是否餘額大於10000再給予優惠
		if(specialaccount.isEmpt())
			//直接存款
			freeAccount.deposit((int)(d*i));
		else
			//扣除手續費2%在進行存款
			freeAccount.deposit((int)(d*i*0.98));
		unit-=d;
	}
	//將單位基金金額傳入，乘上持有單位數，回傳總基金現額
	int balance(int i){return (int)(unit*i);}
	//取得持有多少單位基金
	double getUnit(){return unit;}
}

class JPD06_1 {
	public static void main(String args[]) {
		//為Peter開個定期帳戶，兩年期的
		DepositAccount deposit = new DepositAccount("peter", 2);
		//存款5000元
		deposit.deposit(5000);
		//為Peter開個活期帳戶
		FreeAccount free = new FreeAccount("peter");
		//存款20000
		free.deposit(20000);
		//為Peter開個優惠帳戶
		SpecialAccount special = new SpecialAccount("peter");
		//存款10000
		special.deposit(10000);
		//利用加計利息增加帳戶餘額
		deposit.addInterest();
		free.addInterest();
		special.addInterest();
        //顯示個帳戶的餘額
		System.out.println("定期存款：" + deposit.balance());
		System.out.println("活期存款：" + free.balance());
		System.out.println("優惠存款：" + special.balance());		
		//為Peter建立一個基金帳戶，名稱為"A"
		FundAccount fund = new FundAccount("peter", "A", free, special);
		//購入15000元的基金，且每單位為500元
		fund.buy(15000, 500);
		System.out.println("基金現額：" + fund.balance(300));
		System.out.println("活期餘額：" + fund.freeAccount.balance());
	}
}