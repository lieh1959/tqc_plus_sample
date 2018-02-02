package JPA605.JP06_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

abstract class MIS{
	private String name;
	private int chi;
	private int eng;
	private static  int count =0;
	public MIS(String s,int i,int j)
	{name = s;chi = i;eng = j;count++;}
	public abstract double averageElect();
	public double averageMust(){return (double)((chi+eng)/2.0);}
	public double averageAll()
	{return averageElect()*0.6 + averageMust()*0.4;}
	public static  int getCount(){return count;}
}

class IT extends MIS {
	private int pl;
	private int db;
	private int ds;
	
	IT(String s,int i,int j,int k,int l,int ii)
	{
		super(s,i,j);
		pl=k;
		db=l;
		ds=ii;
	}
	
	public double averageElect(){return (pl+db+ds)/3.0;}
}

class IM extends MIS{
	private int econ;
	private int acct;
IM(String s,int i,int j,int k ,int l)
{
super(s,i,j);
econ = k;
acct =l;
}
public double averageElect(){return (econ+acct)/2.0;}

}

class ITM extends IT{
	private int acct;
	ITM(String s,int i,int j,int k,int l,int ii,int jj)
	{
		super(s,i,j,k,l,ii);
		acct=jj;
	}
	public double averageElect(){return (super.averageElect()+acct)/2.0;}
	public double averageAll()	{return (super.averageMust()*0.4 + super.averageElect()*0.4 + acct*0.2);}
}

//建立MISClass方法
class MISClass {
	private HashMap stu;
	//建構子初始化為HashMap
	MISClass()
	{stu = new HashMap();}
	//建立方法，將學生的key,value放到HashMap
	public void put(String s,MIS mis)
	{stu.put(s, mis);}
	
	public void list() 
	{
		//取出Map值用
		Map.Entry entry = null;
		MIS mis = null;
		//透過Iterator將整份的Map(key,value)放入
		for(Iterator iterator = stu.entrySet().iterator();iterator.hasNext();)
		{
			//判斷是否還有下一個
			entry = (Map.Entry)iterator.next();
			//取出MIS物件
			mis = (MIS)entry.getValue();
			System.out.printf("%s : %.2f \n",entry.getKey(),mis.averageAll());
		}
	}
}

public class JPD06_4 {
    public static void main(String argv[]) {
        //建立MIS物件IT、IM、ITM
    	MIS s1 = new IT("John", 88, 90, 76, 68, 84);
        MIS s2 = new IM("Paul", 92, 80, 76, 68);
        MIS s3 = new ITM("Mary", 79, 88, 94, 92, 83, 69);
        //System.out.printf("John's elect score: %.2f all score %.2f\n", s1.averageElect(), s1.averageAll());
        //System.out.printf("Paul's elect score: %.2f all score %.2f\n", s2.averageElect(), s2.averageAll());
        //System.out.printf("Mary's elect score: %.2f all score %.2f\n", s3.averageElect(), s3.averageAll());
        //建立MISClass物件
        MISClass c1 = new MISClass();
        //將產生好的物件放入Map中，key=名字，value=MIS物件
        c1.put("John", s1);
        c1.put("Paul", s2);
        c1.put("Mary", s3);
        c1.list();
    }
}