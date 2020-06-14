/* TQC+ JAVA6 - 606_3 */

abstract class teacher{
	String name;
	double rate;
	double totalHours;
	double salary;
	teacher(String s, double d,double ds){
		name =s;
		rate = d;
		totalHours =ds;
	}
	abstract double salary();

	double afterTaxIns(){
		return salary()-salary()*0.1-100;
	}
	//建立一個比較薪水高低的方法
	void compare(teacher tt){
		//使用tt.name指外部傳進來比較的名字
		if(tt.salary()>salary())
			System.out.printf("%s is higher than %s\n", tt.name,name);
		else
			System.out.printf("%s is higher than %s\n", name,tt.name);
	}
}

class PartTimeTeacher extends teacher{
	PartTimeTeacher(String s,double d,double ds){
		super(s,d,ds);
	}
	public double salary(){
		return totalHours * rate;
	}
}

class FullTimeTeacher extends teacher{
	FullTimeTeacher(String s,double d,double ds){
		super(s,d,ds);
	}
	public double salary(){
		return 9*rate+((totalHours-9) * rate*0.8);
	}
}

class Manager extends FullTimeTeacher{
	int rank;
	Manager(String s,double d,double ds,int i){
		super(s,d,ds);rank=i;
	}
	public double salary(){
		return super.salary()+rank*500;
	}
	double getTotalSalary(){
		return afterTaxIns();
	}
}

public class JPA06_3 {
    public static void main(String argv[]) {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        Manager am1 = new Manager("Fang", 500, 12, 3);

        //(物件)am1與(物件)f3誰的薪水高
        am1.compare(f3);
        p1.compare(f3);
    }
}