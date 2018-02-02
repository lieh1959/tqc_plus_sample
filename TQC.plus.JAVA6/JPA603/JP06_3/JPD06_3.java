package JPA603.JP06_3;

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
//ミC甅繺よ猭パA甅繺э硑τㄓ度эΘセ场だ
class C extends product{
	Unit a1,a2;
	C(Unit b1,Unit b2)
	{a1=b1;a2=b2;}
	double getCost(){return a1.getCost()+a2.getCost()+2;}
	double getPrice(){return (a1.getPrice()+a2.getPrice())*1.5;}
}
//ミD甅繺よ猭パB甅繺э硑τㄓ度эΘセ场だ
class D extends product{
	Unit a1,a2,a3;
	D(Unit b1,Unit b2,Unit b3)
	{a1=b1;a2=b2;a3=b3;}
	double getCost(){return a1.getCost()+a2.getCost()+a3.getCost()+2;}
	double getPrice(){return (a1.getPrice()+a2.getPrice()+a3.getPrice())*1.5;}
}

class JPD06_3 {
    public static void main(String args[]) {
        //ミ甅繺ン盢ン肚甅繺い
    	C t1 = new C (new Apple(), new Banana());
	    D t2 = new D (new Banana(), new Pudding(), new Strawberry());
	    D t3 = new D (new Apple(), new Banana(), new Mango());

        System.out.println("t1 cost:" + t1.getCost());
    	System.out.println("t1 price:" + t1.getPrice());
        System.out.println("t1 profit:" + t1.getProfit());
        System.out.println("t2 cost:" + t2.getCost());
    	System.out.println("t2 price:" + t2.getPrice());
        System.out.println("t2 profit:" + t2.getProfit());
        System.out.println("t3 cost:" + t3.getCost());
    	System.out.println("t3 price:" + t3.getPrice());
        System.out.println("t3 profit:" + t3.getProfit());
    }
}