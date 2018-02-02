package JPA605.JP06_5;

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

class MISClass {
	private HashMap stu;
	MISClass()
	{stu = new HashMap();}
	
	public void put(String s,MIS mis)
	{stu.put(s, mis);}
	
	public void list() throws Exception
	{
		Map.Entry entry = null;
		MIS mis = null;
		for(Iterator iterator = stu.entrySet().iterator();iterator.hasNext();
				System.out.printf("%s : %.2f \n",entry.getKey(),mis.averageAll()))
		{
			entry = (Map.Entry)iterator.next();
			mis = (MIS)entry.getValue();
			//新增一個判斷方法
			if(mis.averageAll() >100)//如果平均大於100分，則丟出錯誤訊息
				throw new Exception("**"+entry.getKey()+":"+mis.averageAll());
		}
	}
	
}

public class JPD06_5 {
    public static void main(String argv[]) {
        MISClass c1 = new MISClass();
        c1.put("Peter", new IM("Peter", 89, 980, 77, 69));
        //將try-catch加入，主要是在列印出成績時，檢查是否有錯誤
        try{
        	c1.list();
        	}
        catch(Exception e){
        	System.out.println(e.getMessage());
        	}
    }
}