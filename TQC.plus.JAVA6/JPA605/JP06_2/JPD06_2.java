package JPA605.JP06_2;



abstract class MIS{
	private String name;
	private int chi;
	private int eng;
	public MIS(String s,int i,int j)
	{name = s;chi = i;eng = j;}
	public abstract double averageElect();
	//���D�즨�Z���o��k
	public double averageMust(){return (double)((chi+eng)/2.0);}
	public double averageAll()
	{return averageElect()*0.6 + averageMust()*0.4;}
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
//�A�~�Ӧ�IT
class ITM extends IT{
	private int acct;
	//�غc�l��l�Ʀ��Z
	ITM(String s,int i,int j,int k,int l,int ii,int jj)
	{
		super(s,i,j,k,l,ii);
		acct=jj;
	}
	//��@MIS����k�A�ƼgIT����k
	public double averageElect(){return (super.averageElect()+acct)/2.0;}
	public double averageAll()	{return (super.averageMust()*0.4 + super.averageElect()*0.4 + acct*0.2);}
	
}

public class JPD06_2 {
   public static void main(String argv[]) {
       //�إ�MIS����ITM 
	   MIS s3 = new ITM("Mary", 79, 88, 94, 92, 83, 69);
        System.out.printf("Mary's elect score: %.2f all score %.2f\n", s3.averageElect(), s3.averageAll());
    }
}