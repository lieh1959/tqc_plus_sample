/* TQC+ JAVA6 - 610_3 */

abstract class work{
	String wno;
	//�s�W���u�H���ܼ�
	static int wt=0;
	//�s�W�`��ú�|�B�ܼ�
	static double  tottax= 0.0;
	work(String s){
		wno=s;
		wt++;
	}
	abstract double monthPay();
	//�إߨ��o������ú�|���B
	static double getAverageTax(){
	    return ((double)tottax/wt);
	}

	void ishight(work k){
		if(monthPay()>k.monthPay())
			System.out.println(wno+"����");
		else
			System.out.println(k.wno+"����");
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

        System.out.println("SalaryWorker�|�B�G" + sw1.monthTaxes());
        System.out.println("HourlyWorker�|�B�G" + hw1.monthTaxes());
        System.out.println("Manager�|�B�G" + ma1.monthTaxes());
        //�p��X�����|�B
        System.out.println("�����|�B�G" + work.getAverageTax());
    }
}
