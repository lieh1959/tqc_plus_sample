package JPA602.JP06_4;

import java.util.Iterator;
import java.util.LinkedList;

class Unit
{	int cost;
	Unit(){cost = 0;}
	public int getcost()
	{return cost;}}

class LCD extends Unit
{
	 LCD(int i){
		if(i==10)
			cost=2000;
		else if(i==15)
			cost=2500;
		else
			cost=3000;
	}
}

class CPU extends Unit
{
 CPU(double d )
 {
	 if(d==1.66)
	 cost=6000;
	 if(d==2.2)
		 cost=8000;
	 if(d==2.4)
		 cost=11000;
 }
}

class HD extends Unit
{
HD(String s)
{
if(s=="120G")
	cost = 2400;
else
	cost = 2800;
}}

abstract class Note extends AllPC{
	double cost;
	LCD l;
	CPU c;
	HD dd;
	Note(int i,double d,String s){
		l = new LCD(i);
		c = new CPU(d);
		dd = new HD(s);
	}
	abstract public double getCost();
	abstract public double getPrice();
}

class MiniNote extends Note{
	MiniNote()
	{super(10,1.66,"120G");
	cost = l.getcost()+c.getcost()+dd.getcost();
	}
	
	public double getCost(){return cost*1.4;}
	public double getPrice(){return cost*2.0;}
}

class Note15 extends Note{
	Note15()
	{
		super(15,2.2,"160G");
	    cost = l.getcost()+c.getcost()+dd.getcost();
	}
	
	public double getCost(){return cost*1.4;}
	public double getPrice(){return cost*2.0;}
}

abstract class PCandMultiPC extends AllPC
{
    double  cost;
    CPU l;
    HD c;
   PCandMultiPC()
   {
	l = new CPU(2.4);
	c = new HD("160G");
   }
abstract public double getCost();
abstract public double getPrice();
}

class PC extends PCandMultiPC
{
    public double getCost()
    {return (l.getcost()+c.getcost()+500);}
    public double getPrice()
    {return (l.getcost()+c.getcost())*1.8;}   	
}

class MultiPC extends PCandMultiPC
{
	double total;
	MultiPC(int a,int b)
	{total = a*l.getcost()+b*c.getcost();}

	public double getCost()
    {return (total*1.2);}
    public double getPrice()
    {return (total*1.8);}   	

}

abstract class AllPC 
{
    AllPC(){}
	abstract public double getCost();
	abstract public double getPrice();	
}

//建立一個訂單的方法
class Order{
	//使用LinkedList來儲存每筆電腦物件
	LinkedList pcs;
	//利用建構子來建立LinkedList物件
	Order(){pcs = new LinkedList();}
	void in(AllPC allpc)
	{pcs.add(allpc);}
	public double revenue()
	{
		double d =0.0;
		//利用iterator來依序讀取LinkedList內的物件
		for(Iterator iterator = pcs.iterator();iterator.hasNext();)
		{
			//將下一個物件讀入
			AllPC allpc = (AllPC)iterator.next();
			d=d+allpc.getPrice();
		}
	return d;
	}
	
}

class JPD06_4 {
    public static void main(String args[]){
        //建立訂單物件
    	Order ord = new Order();
        //寫入訂單
    	ord.in(new MiniNote());
        ord.in(new Note15());
        ord.in(new PC());
        System.out.println(ord.revenue());
    }
}