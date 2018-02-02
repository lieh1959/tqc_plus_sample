package JPA603.JP06_2;

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

//建立一個抽象的 product方法，供A、B套餐繼承
abstract class product{
	product(){}
	//抽象取得成本
	abstract double getCost();
	//抽象取得售價
	abstract double getPrice();
	//建立利潤方法
	double getProfit(){return getPrice()-getCost();}
}

//A套餐方法
class A extends product{
	Unit a1,a2;
	//建構子，傳入兩個參數，供初始化
	A(Unit b1,Unit b2)
	{a1=b1;a2=b2;}
	double getCost(){return a1.getCost()+a2.getCost();}
	double getPrice(){return a1.getPrice()+a2.getPrice();}
}
//B套餐方法
class B extends product{
	Unit a1,a2,a3;
	//建構子，傳入三個參數，供初始化
	B(Unit b1,Unit b2,Unit b3)
	{a1=b1;a2=b2;a3=b3;}
	double getCost(){return a1.getCost()+a2.getCost()+a3.getCost();}
	double getPrice(){return a1.getPrice()+a2.getPrice()+a3.getPrice();}
}
class JPD06_2 {
    public static void main(String args[]) {
	//產生A套餐的物件，並傳入兩個原料物件
    A t1 = new A(new Apple(), new Banana());
    //產生B套餐的物件，並傳入三個原料物件
	B t2 = new B(new Banana(), new Pudding(), new Strawberry());
	B t3 = new B(new Apple(), new Banana(), new Mango());

        System.out.println("t1 price:" + t1.getPrice());
        System.out.println("t1 profit:" + t1.getProfit());
        System.out.println("t2 price:" + t2.getPrice());
        System.out.println("t2 profit:" + t2.getProfit());
        System.out.println("t3 price:" + t3.getPrice());
        System.out.println("t3 profit:" + t3.getProfit());
    }
}