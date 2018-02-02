package JPA610.JP06_4;

import java.util.HashMap;

abstract class work{
	String wno;
	static int wt=0;
	static double  tottax= 0.0;
	work(String s)
	{
	wno=s;
	wt++;
	}
abstract double monthPay();

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
	SalaryWorker(String s ,int i)
	{super(s);mp=i;}
double monthPay()
{return (mp/12.0+redp);}
}

class HourlyWorker extends work{
int hr,hp;
HourlyWorker(String s,int i1,int i2)
{super(s);hr=i2;hp=i1;}
double monthPay()
{return hr*hp;}
}

class Manager extends SalaryWorker{
	
	Manager(String s,int i ,int i1)
	{
		super(s,i);
		redp = i1;
	}
} 

//�إߤ@�Ӻ޲z�����O
class Management{
	HashMap worker;
	//�غc�l��l�Ʃl�ƪ���HashMap
	Management(){worker=new HashMap();}
	//�إߤ�k�N�����JHashMap��
	void put(String s ,work ww)
	{worker.put(s, ww);}
	//�إߤ�k���o�����|�᪺�~��
	double afterTax(String s )
	{
		work w = (work)worker.get(s);
		return w.monthPay()-w.monthTaxes();
	}

} 


public class JPD06_4 {
    public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
        Manager ma1 = new Manager("97001", 240000, 5000);        
        //�إߤ@�Ӻ޲z������
        Management m = new Management();
        //�N��Ʃ��HashMap��
        m.put("96001", sw1);
        m.put("96002", hw1);
        m.put("97001", ma1);
        System.out.println("97001 ���|���~��G " + m.afterTax("97001"));
    }
}