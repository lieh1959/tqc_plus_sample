/* TQC+ JAVA6 - 610_3 */

abstract class work{
	String wno;
	//新增員工人數變數
	static int wt=0;
	//新增總應繳稅額變數
	static double  tottax= 0.0;
	work(String s){
		wno=s;
		wt++;
	}
	abstract double monthPay();
	//建立取得平均應繳稅金額
	static double getAverageTax(){
	    return ((double)tottax/wt);
	}

	void ishight(work k){
		if(monthPay()>k.monthPay())
			System.out.println(wno+"較高");
		else
			System.out.println(k.wno+"較高");
	}

	double monthTaxes(){
		double sssss=monthPay()*0.15;
		tottax = tottax+sssss;
		return sssss;
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

public class JPA06_3 {
    public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        Manager ma1 = new Manager("97001", 240000, 5000);

        System.out.println("SalaryWorker稅額：" + sw1.monthTaxes());
        System.out.println("HourlyWorker稅額：" + hw1.monthTaxes());
        System.out.println("Manager稅額：" + ma1.monthTaxes());
        //計算出平均稅額
        System.out.println("平均稅額：" + work.getAverageTax());
    }
}
