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
	//�W�[�@�Ӧ��|�᪺�~���`�B��k
	double afterTaxIns(){
		return salary()-salary()*0.1-100;//��100�������O�O
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
//�s�W��F�D�ޡA�~�ӱM���Юv
class Manager extends FullTimeTeacher{
	int rank;
	//�غc�l�A��l�ƦW�r�B���~�B�`�ɼơB����
	Manager(String s,double d,double ds,int i)
	{super(s,d,ds);rank=i;}
	//��@�~���k(�ƼgFullTimeTeacher.salary())
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
        
        System.out.println("John-afterTaxIns�G" + p1.afterTaxIns());
        System.out.println("Mary-afterTaxIns�G" + p2.afterTaxIns());
        System.out.println("Peter-afterTaxIns�G" + f1.afterTaxIns());
        System.out.println("Paul-afterTaxIns�G" + f2.afterTaxIns());
        System.out.println("Eric-afterTaxIns�G" + f3.afterTaxIns());
        //�إߦ�F�D�ު���
        Manager am1 = new Manager("Fang", 500, 12, 3);
        System.out.println("Fang-Manager�G" + am1.getTotalSalary());
        System.out.println("Fang-afterTaxIns�G" + am1.afterTaxIns());


    }
}