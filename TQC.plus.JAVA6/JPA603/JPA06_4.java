/* TQC+ JAVA6 - 603_4 */

import java.util.*;

class Unit
{
	double cost,price;
	Unit(){
		cost = 0.0;
		price = 0.0;
	}
	public double getCost(){
		return cost;
	}
	public double getPrice(){
		return price;
	}
}

class Apple extends Unit{
	Apple(){
		cost = 6.0;
		price=10.0;
	}
}
class Banana extends Unit{
	Banana(){
		cost = 2.0;
		price=5.0;
	}
}
class Pudding extends Unit{
	Pudding(){
		cost = 3.0;
		price=5.0;
	}
}
class Strawberry extends Unit{
	Strawberry(){
		cost = 1.0;
		price=5.0;
	}
}
class Mango extends Unit{
	Mango(){
		cost = 2.0;
		price=5.0;
	}
}

abstract class product{
	product(){}
	abstract double getCost();
	abstract double getPrice();
	double getProfit(){
		return getPrice()-getCost();
	}
}

class A extends product{
	Unit a1,a2;
	A(Unit b1,Unit b2){
		a1=b1;
		a2=b2;
	}

	double getCost(){
		return a1.getCost()+a2.getCost();
	}
	double getPrice(){
		return a1.getPrice()+a2.getPrice();
	}
}

class B extends product{
	Unit a1,a2,a3;
	B(Unit b1,Unit b2,Unit b3){
		a1=b1;
		a2=b2;
		a3=b3;
	}

	double getCost(){
		return a1.getCost()+a2.getCost()+a3.getCost();
	}
	double getPrice(){
		return a1.getPrice()+a2.getPrice()+a3.getPrice();
	}
}

class Deliver{
	//建立一個LinkedList來存放套餐的物件
	LinkedList ap;
	//利用建構子產生LinkedList的物件
	Deliver(){
		ap=new LinkedList();
	}
	//建立加入套餐的物件
	void addProduct(product p){
		ap.add(p);
	}

	double getTotalPrice(){
		double d=0.0;
		for(Iterator iterator=ap.iterator();iterator.hasNext();){
			product p = (product)iterator.next();
			d+=p.getPrice();//累加售價
		}
		return d;
	}

	double getTotalCost(){
		double d=0.0;
		for(Iterator iterator=ap.iterator();iterator.hasNext();){
			product p = (product)iterator.next();
		 	d+=p.getCost();//累加成本
		}
		return d;
	}

	double getTotalProfit(){
		double d=0.0;
		for(Iterator iterator=ap.iterator();iterator.hasNext();){
			product p = (product)iterator.next();
		 	d+=(p.getPrice()-p.getCost());//累加利潤
		}
		return d;
	}

}

class JPA06_4 {
	public static void main(String args[]){
		//產生外送物件
		Deliver d1 = new Deliver();
    	//將A套餐的物件放入，A套餐又放入兩個原料來組成
		d1.addProduct(new A(new Apple(), new Banana()));
   		//將B套餐的物件放入，B套餐又放入三個原料來組成
		d1.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
		System.out.println("a Price: " + d1.getTotalPrice());
		System.out.println("a Cost: " + d1.getTotalCost());
		System.out.println("a Profit: " + d1.getTotalProfit());
		Deliver d2 = new Deliver();
		d2.addProduct(new B(new Apple(), new Banana(), new Mango()));
		d2.addProduct(new A(new Apple(), new Banana()));
		d2.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
		d2.addProduct(new B(new Apple(), new Banana(), new Mango()));
		System.out.println("b Price: " + d2.getTotalPrice());
		System.out.println("b Cost: " + d2.getTotalCost());
		System.out.println("b Profit: " + d2.getTotalProfit());
	}
}