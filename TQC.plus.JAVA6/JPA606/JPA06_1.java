/* TQC+ JAVA6 - 606_1 */

//建立一個抽象屬性
abstract class teacher{
	String name;
	double rate;
	double totalHours;
	double salary;
	//建構子初始化名字、時薪、總時數
	teacher(String s, double d,double ds){
		name =s;
		rate = d;
		totalHours =ds;
	}
	abstract double salary();
}
//建立兼任老師類別
class PartTimeTeacher extends teacher{
	PartTimeTeacher(String s,double d,double ds){
		super(s,d,ds);
	}
	//實作薪水方法
	public double salary(){
		return totalHours * rate;
	}
}
//建立專任老師類別
class FullTimeTeacher extends teacher{
	FullTimeTeacher(String s,double d,double ds){
		super(s,d,ds);
	}
	//實作薪水方法
	public double salary(){
		return 9*rate+((totalHours-9) * rate*0.8);
	}
}

public class JPA06_1 {
    public static void main(String argv[]) {
        //建立兼任、專任老師的物件
    	PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        //透過方法得到薪水值
        System.out.println("John-PartTime : " + p1.salary());
        System.out.println("Mary-PartTime : " + p2.salary());
        System.out.println("Peter-FulLTime : " + f1.salary());
        System.out.println("Paul-FulLTime : " + f2.salary());
        System.out.println("Eric-FulLTime : " + f3.salary());
    }
}
