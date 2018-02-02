package JPA603.JP06_5;

import java.util.*;

class Unit
{
	double cost,price;
  Unit()
  {
	cost = 0.0;
	price = 0.0;
  }
public double getCost(){return cost;}
public double getPrice(){return price;}
}

class Apple extends Unit{Apple(){cost = 6.0;price=10.0;}}
class Banana extends Unit{Banana(){cost = 2.0;price=5.0;}}
class Pudding extends Unit{Pudding(){cost = 3.0;price=5.0;}}
class Strawberry extends Unit{Strawberry(){cost = 1.0;price=5.0;}}
class Mango extends Unit{Mango(){cost = 2.0;price=5.0;}}

abstract class product{
	product(){}
	abstract double getCost();
	abstract double getPrice();
	double getProfit(){return getPrice()-getCost();}
}

class A extends product{
	Unit a1,a2;
	A(Unit b1,Unit b2){a1=b1;a2=b2;}
	double getCost(){return a1.getCost()+a2.getCost();}
	double getPrice(){return a1.getPrice()+a2.getPrice();}
}

class B extends product{
	Unit a1,a2,a3;
	B(Unit b1,Unit b2,Unit b3){a1=b1;a2=b2;a3=b3;}
	double getCost(){return a1.getCost()+a2.getCost()+a3.getCost();}
	double getPrice(){return a1.getPrice()+a2.getPrice()+a3.getPrice();}
}

class Deliver{
	LinkedList ap;
	Deliver(){ap=new LinkedList();}
	void addProduct(product p){ap.add(p);}
	//建立一個檢查的方法，若有符合特定條件，則丟出Exception來警示
	double checkOut() throws notenoughorder
	{
		double d = getTotalPrice();
		if(d<50)
			throw new notenoughorder(this);
		else
			return d;
	}	
	
	double getTotalPrice()
	{
		double d=0.0;
		for(Iterator iterator=ap.iterator();iterator.hasNext();)
		{
			product p = (product)iterator.next();
			d+=p.getPrice();
		}
		return d;
	}
	
	double getTotalCost()
	{
		double d=0.0;
		for(Iterator iterator=ap.iterator();iterator.hasNext();)
		{
			product p = (product)iterator.next();
			d+=p.getCost();
		}
		return d;
	}	
	
	double getTotalProfit()
	{
		double d=0.0;
		for(Iterator iterator=ap.iterator();iterator.hasNext();)
		{
			product p = (product)iterator.next();
			d+=(p.getPrice()-p.getCost());
		}
		return d;
	}	
	
}


//建立一個Exception的方法，並傳入外送物件
class notenoughorder extends Exception{
	static Deliver d;
	notenoughorder(Deliver deliver){d=deliver;}
	//在裡面再建立一個order的方法，回傳外送總價
	static double order(){return d.getTotalPrice();}
}

class JPD06_5 {
    public static void main(String args[]) {
       //利用try-catch包住整個main的程式
    	try{
            Deliver d1 = new Deliver();
            d1.addProduct(new A(new Apple(), new Banana()));
            d1.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
            d1.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
            d1.addProduct(new B(new Apple(), new Banana(), new Mango()));
            System.out.println("a Price: " + d1.getTotalPrice());
            System.out.println("a Cost: " + d1.getTotalCost());
            System.out.println("a Profit: " + d1.getTotalProfit());
            System.out.println("");
            //進行外送的檢查
            d1.checkOut();            
            Deliver d2 = new Deliver();
            d2.addProduct(new B(new Apple(), new Banana(), new Mango()));
            d2.addProduct(new A(new Apple(), new Banana()));
            System.out.println("b Price: " + d2.getTotalPrice());
            System.out.println("b Cost: " + d2.getTotalCost());
            System.out.println("b Profit: " + d2.getTotalProfit());
             //進行外送的檢查
            d2.checkOut();   
       }
        catch(notenoughorder e)//抓取錯誤的catch
            {
        	//抓取到錯誤後，會進來此block，執行程式
        	 System.out.println("Not enough order for carry out:"+
             notenoughorder.order());	
            }
        }
    }


