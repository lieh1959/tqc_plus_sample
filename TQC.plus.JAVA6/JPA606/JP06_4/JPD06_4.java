package JPA606.JP06_4;

import java.util.HashMap;
import java.util.Iterator;

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
	
	double afterTaxIns(){
		return salary()-salary()*0.1-100;
	}
	
	void compare(teacher tt)
	{
		if(tt.salary()>salary())
			System.out.printf("%s is higher than %s\n", tt.name,name);
		else
			System.out.printf("%s is higher than %s\n", name,tt.name);
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

class Manager extends FullTimeTeacher{
	int rank;
	Manager(String s,double d,double ds,int i)
	{super(s,d,ds);rank=i;}
	public double salary(){return super.salary()+rank*500;}
	double getTotalSalary(){return afterTaxIns();}
}

//�إߦѮv��Ʈw�����O
class TeacherDB{
	HashMap tea;
	//�غc�l��l�Ƭ�HashMap����
	TeacherDB()
	{tea = new HashMap();}
	//�إߤ@���x�s��ƪ���k
	void store(String s ,teacher t)
	{tea.put(s, t);	}
	
	//�إߤ@�Ӥ�k���o�Ҧ��Ѯv�[�`�~��
	double totalOfAll()
	{
		double d=0;
		for(Iterator iterator = tea.values().iterator();iterator.hasNext();)
		{
			teacher tt = (teacher)iterator.next();
			d  = d+tt.afterTaxIns();
		}
		return d;
	}
}

public class JPD06_4 {
    public static void main(String argv[]) {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        Manager am1 = new Manager("Fang", 500, 12, 3);
        //�إߤ@�ӦѮv��Ʈw������A�åB�v�@�s�JHashMap��        
        TeacherDB school = new TeacherDB();
        school.store("John", p1);
        school.store("Mary", p2);
        school.store("Peter", f1);
        school.store("Paul", f2);
        school.store("Eric", f3);
        school.store("Fang", am1);
        System.out.println("Total salary: " + school.totalOfAll());
    }
}