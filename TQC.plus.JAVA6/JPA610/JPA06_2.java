/* TQC+ JAVA6 - 610_2 */

abstract class work{
	String wno;
	work(String s){
		wno=s;
	}
	abstract double monthPay();
	//建立一個比較薪水高低的方法
	void ishight(work k){
		if(monthPay()>k.monthPay())
			System.out.println(wno+"較高");
		else
			System.out.println(k.wno+"較高");
	}
	//計算出每個人的應繳稅額
	double monthTaxes(){
		return monthPay()*0.15;
	}
}

class SalaryWorker extends work{
	int mp;
	int redp=0;
	SalaryWorker(String s ,int i){
		super(s);
		mp=i;
	}

	double monthPay(){
		return (mp/12.0+redp);
	}
}

class HourlyWorker extends work{
	int hr,hp;
	HourlyWorker(String s,int i1,int i2){
		super(s);
		hr=i2;
		hp=i1;
	}

	double monthPay(){
		return hr*hp;
	}
}

class Manager extends SalaryWorker{
	Manager(String s,int i ,int i1){
		super(s,i);
		redp = i1;
	}
}

public class JPA06_2 {
    public static void main(String argv[]) {

	SalaryWorker sw1 = new SalaryWorker("96001",180000);
	System.out.println("SalaryWorker：" + sw1.monthPay());
	HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
	System.out.println("HourlyWorker：" + hw1.monthPay());
    Manager ma1 = new Manager("97001", 240000, 5000);
    System.out.println("Manager：" + ma1.monthPay());

	//比較(物件)sw1和(物件)hw1誰的薪水高
	sw1.ishight(hw1);
	//比較(物件)hw1和(物件)ma1誰的薪水高
	hw1.ishight(ma1);
	//取得每個人的應繳稅額
	System.out.println("SalaryWorker稅額：" + sw1.monthTaxes());
	System.out.println("HourlyWorker稅額：" + hw1.monthTaxes());
	System.out.println("Manager稅額：" + ma1.monthTaxes());
    }
}
