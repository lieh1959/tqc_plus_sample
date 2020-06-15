/* TQC+ JAVA6 - 608_3 */

import java.util.Iterator;
import java.util.Vector;

abstract class Food{
	int amount;
	int calorie;
	//�s�W��즨��
	int unitCost;

	Food(int i){
		amount=i;
	}
	void setCaloriePerGram(int i){
		calorie=i;
	}
	//�]�w��즨����k
	void setUnitCost(int i){
		unitCost=i;
	}

	//���o������k
	int getCost(){
		return unitCost*amount;
	}
	int getAmount(){
		return amount;
	}

	abstract int getCalorie();
}

class Rice extends Food{
	Rice(int i){//�b�l���O���]�w�n������
		super(i);
		calorie=1;
		unitCost=1;
	}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class Egg extends Food{
	Egg(int i){//�b�l���O���]�w�n������
		super(i);
		calorie=2;
		unitCost=2;}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class Cabbage extends Food{
	Cabbage(int i){//�b�l���O���]�w�n������
		super(i);
		calorie=1;
		unitCost=3;
	}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class PorkRib extends Food{
	PorkRib(int i){//�b�l���O���]�w�n������
		super(i);
		calorie=10;
		unitCost=8;}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class Carrot extends Food{
	Carrot(int i){
		super(i);
		calorie=1;
		unitCost=3;
	}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class LunchBox{
	int calorie;
	Vector content;
	LunchBox(){
		content=new Vector();
	}
	//�s�W�@���ܼơA���ܼƭ��H�����i�H�o����
	double priceRatio;
	void setPriceRatio(double d){
		priceRatio=d;
	}
	double getPrice(){
		double i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();){
			Food f = (Food)iterator.next();
			i+=f.getCost()*priceRatio;
		}
		return i;
	}


	void add(Food f){
		content.add(f);
	}

	int getCalorie(){
		int i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();){
			Food f = (Food)iterator.next();
			i+=f.getCalorie();
		}
			return i;
	}
}

class JPA06_3{
    public static void main(String args[]){
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        //�]�w�ܼƭ�
        economy.setPriceRatio(1.2);
        System.out.println("Total calories of an economy lunch box are " + economy.getCalorie());
        System.out.println("The price of an economy lunch box is " + economy.getPrice());

        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        //�]�w�ܼƭ�
        valuedChoice.setPriceRatio(1.3);
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie());
        System.out.println("The price of a valued-choice lunch box is " + valuedChoice.getPrice());
    }
}
