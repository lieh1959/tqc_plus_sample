package JPA603.JP06_1;
//�إߤ@�Ӧ@�Ϊ���k�A�H�Ѩ�L��k�~��
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
//�إߨC�ӭ�ƪ���k�A�åB�~��Unit�A�~�Ө��k�M����
class Apple extends Unit{Apple(){cost = 6.0;price=10.0;}}
class Banana extends Unit{Banana(){cost = 2.0;price=5.0;}}
class Pudding extends Unit{Pudding(){cost = 3.0;price=5.0;}}
class Strawberry extends Unit{Strawberry(){cost = 1.0;price=5.0;}}
class Mango extends Unit{Mango(){cost = 2.0;price=5.0;}}


class JPD06_1 {   
    public static void main(String args[]) {
        //���ͭӭ�ƪ�����
    	Apple ab = new Apple();
        Banana bb = new Banana();
        Pudding pt = new Pudding();
        System.out.println("Apple cost:" + ab.getCost());
        System.out.println("Apple price:" + ab.getPrice());
        System.out.println("Banana cost:" + bb.getCost());
        System.out.println("Banana price:" + bb.getPrice());
        System.out.println("Pudding cost:" + pt.getCost());
        System.out.println("Pudding price:" + pt.getPrice());
    }
}