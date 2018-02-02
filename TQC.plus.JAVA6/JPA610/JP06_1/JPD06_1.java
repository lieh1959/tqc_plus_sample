package JPA610.JP06_1;
//建立抽象類別供子類別繼承
abstract class work{
	String wno;
	work(String s)
	{wno=s;}

	//建立一個每月收入抽象的方法
	abstract double monthPay();

}
//建立一個SalaryWorker類別，繼承work，在此方法中有寫入紅利變數，但設定成0
class SalaryWorker extends work{
	int mp;//年薪
	int redp=0;//紅利
	//建構子初始化員工編號、年薪
	SalaryWorker(String s ,int i)
	{super(s);mp=i;}
	double monthPay(){return (mp/12.0+redp);}
	}

//建立一個HourlyWorker類別，繼承work
class HourlyWorker extends work{
	int hr,hp;
	//建構子初始化員工編號、工作時數、時薪
	HourlyWorker(String s,int i1,int i2)
	{super(s);hr=i2;hp=i1;}
	double monthPay()
	{return hr*hp;}
}
//建立一個主管類別繼承SalaryWorker，該處將紅利的變數重新寫入
class Manager extends SalaryWorker{
	
	Manager(String s,int i ,int i1)
	{
		super(s,i);
		redp = i1;
	}
} 


public class JPD06_1 {
   public static void main(String argv[]) {
       //建立一個銷售員的物件 
	   SalaryWorker sw1 = new SalaryWorker("96001",180000);
	   //取的該銷售員的月薪
       System.out.println("SalaryWorker：" + sw1.monthPay());
       //建立一個時薪人員的物件
       HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
       //取的該時薪人員的月薪
       System.out.println("HourlyWorker：" + hw1.monthPay());
       //建立一個主管的物件
       Manager ma1 = new Manager("97001", 240000, 5000);
       //取得該主管的月薪
       System.out.println("Manager：" + ma1.monthPay());
    }
}