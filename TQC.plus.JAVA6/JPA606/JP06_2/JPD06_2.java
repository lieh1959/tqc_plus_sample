package JPA606.JP06_2;


abstract class teacher{
	String name;
	double rate;
	double totalHours;
	double salary;
	teacher(String s, double d,double ds)
	{
		name =s;
		rate = d;
		totalHours =ds;
	}
	abstract double salary();
	//增加一個扣稅後的薪資總額方法
	double afterTaxIns(){
		return salary()-salary()*0.1-100;//扣100元為健保費
	}
}
class PartTimeTeacher extends teacher{
	PartTimeTeacher(String s,double d,double ds){super(s,d,ds);}
	public double salary(){return totalHours * rate;}
}
class FullTimeTeacher extends teacher{
	FullTimeTeacher(String s,double d,double ds){super(s,d,ds);}
	public double salary(){return 9*rate+((totalHours-9) * rate*0.8);}
}
//新增行政主管，繼承專任教師
class Manager extends FullTimeTeacher{
	int rank;
	//建構子，初始化名字、時薪、總時數、階級
	Manager(String s,double d,double ds,int i)
	{super(s,d,ds);rank=i;}
	//實作薪資方法(複寫FullTimeTeacher.salary())
	public double salary(){return super.salary()+rank*500;}
	double getTotalSalary(){return salary();}
}

public class JPD06_2 {
    public static void main(String argv[]) {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        
        System.out.println("John-afterTaxIns：" + p1.afterTaxIns());
        System.out.println("Mary-afterTaxIns：" + p2.afterTaxIns());
        System.out.println("Peter-afterTaxIns：" + f1.afterTaxIns());
        System.out.println("Paul-afterTaxIns：" + f2.afterTaxIns());
        System.out.println("Eric-afterTaxIns：" + f3.afterTaxIns());
        //建立行政主管物件
        Manager am1 = new Manager("Fang", 500, 12, 3);
        System.out.println("Fang-Manager：" + am1.getTotalSalary());
        System.out.println("Fang-afterTaxIns：" + am1.afterTaxIns());


    }
}