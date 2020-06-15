/* TQC+ JAVA6 - 610_2 */

abstract class work{
	String wno;
	work(String s){
		wno=s;
	}
	abstract double monthPay();
	//�إߤ@�Ӥ���~�����C����k
	void ishight(work k){
		if(monthPay()>k.monthPay())
			System.out.println(wno+"����");
		else
			System.out.println(k.wno+"����");
	}
	//�p��X�C�ӤH����ú�|�B
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
	System.out.println("SalaryWorker�G" + sw1.monthPay());
	HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
	System.out.println("HourlyWorker�G" + hw1.monthPay());
    Manager ma1 = new Manager("97001", 240000, 5000);
    System.out.println("Manager�G" + ma1.monthPay());

	//���(����)sw1�M(����)hw1�֪��~����
	sw1.ishight(hw1);
	//���(����)hw1�M(����)ma1�֪��~����
	hw1.ishight(ma1);
	//���o�C�ӤH����ú�|�B
	System.out.println("SalaryWorker�|�B�G" + sw1.monthTaxes());
	System.out.println("HourlyWorker�|�B�G" + hw1.monthTaxes());
	System.out.println("Manager�|�B�G" + ma1.monthTaxes());
    }
}
