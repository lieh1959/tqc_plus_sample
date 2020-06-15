/* TQC+ JAVA6 - 610_5 */

import java.util.HashMap;
import java.util.Iterator;

abstract class work{
	String wno;
	static int wt=0;
	static double  tottax= 0.0;
	work(String s){
		wno=s;
		wt++;
	}
	abstract double monthPay();
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

class Management{
	HashMap worker;
	double total =0;
	Management(){
		worker=new HashMap();
	}


	void put(String s ,work ww){
		worker.put(s, ww);
	}


	double totalSalary() throws limex{
		for(Iterator iterator = worker.values().iterator();iterator.hasNext();){
	    	work www =(work)iterator.next();
		    total = www.monthPay()+total;
		    if(total>50000)//當總月薪超過50000時，則會拋出錯誤訊息
				throw new limex(total);
		}
	    return total;
	}
}
//新增一個exception的類別
class limex extends Exception{
	double dd;
	limex(double d){
		dd=d;
	}
	double getAm(){
		return dd;
	}
}

public class JPA06_5 {
    public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        Manager ma1 = new Manager("97001", 240000, 5000);
        Management m = new Management();
        m.put("96001", sw1);
        m.put("96002", hw1);
        m.put("97001", ma1);
        //抓取錯誤訊息
        try {
        	m.totalSalary();
		} catch (limex e) {
			System.out.println("Total salary exceed limit:"+e.getAm());
		}
	}
}

