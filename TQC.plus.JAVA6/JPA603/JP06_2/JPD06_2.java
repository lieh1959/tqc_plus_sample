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

//�إߤ@�ө�H�� product��k�A��A�BB�M�\�~��
abstract class product{
	product(){}
	//��H���o����
	abstract double getCost();
	//��H���o���
	abstract double getPrice();
	//�إߧQ���k
	double getProfit(){return getPrice()-getCost();}
}

//A�M�\��k
class A extends product{
	Unit a1,a2;
	//�غc�l�A�ǤJ��ӰѼơA�Ѫ�l��
	A(Unit b1,Unit b2)
	{a1=b1;a2=b2;}
	double getCost(){return a1.getCost()+a2.getCost();}
	double getPrice(){return a1.getPrice()+a2.getPrice();}
}
//B�M�\��k
class B extends product{
	Unit a1,a2,a3;
	//�غc�l�A�ǤJ�T�ӰѼơA�Ѫ�l��
	B(Unit b1,Unit b2,Unit b3)
	{a1=b1;a2=b2;a3=b3;}
	double getCost(){return a1.getCost()+a2.getCost()+a3.getCost();}
	double getPrice(){return a1.getPrice()+a2.getPrice()+a3.getPrice();}
}
class JPD06_2 {
    public static void main(String args[]) {
	//����A�M�\������A�öǤJ��ӭ�ƪ���
    A t1 = new A(new Apple(), new Banana());
    //����B�M�\������A�öǤJ�T�ӭ�ƪ���
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