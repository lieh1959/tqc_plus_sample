/* TQC+ JAVA6 - 606_1 */

//�إߤ@�ө�H�ݩ�
abstract class teacher{
	String name;
	double rate;
	double totalHours;
	double salary;
	//�غc�l��l�ƦW�r�B���~�B�`�ɼ�
	teacher(String s, double d,double ds){
		name =s;
		rate = d;
		totalHours =ds;
	}
	abstract double salary();
}
//�إ߭ݥ��Ѯv���O
class PartTimeTeacher extends teacher{
	PartTimeTeacher(String s,double d,double ds){
		super(s,d,ds);
	}
	//��@�~����k
	public double salary(){
		return totalHours * rate;
	}
}
//�إ߱M���Ѯv���O
class FullTimeTeacher extends teacher{
	FullTimeTeacher(String s,double d,double ds){
		super(s,d,ds);
	}
	//��@�~����k
	public double salary(){
		return 9*rate+((totalHours-9) * rate*0.8);
	}
}

public class JPA06_1 {
    public static void main(String argv[]) {
        //�إ߭ݥ��B�M���Ѯv������
    	PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        //�z�L��k�o���~����
        System.out.println("John-PartTime : " + p1.salary());
        System.out.println("Mary-PartTime : " + p2.salary());
        System.out.println("Peter-FulLTime : " + f1.salary());
        System.out.println("Paul-FulLTime : " + f2.salary());
        System.out.println("Eric-FulLTime : " + f3.salary());
    }
}
