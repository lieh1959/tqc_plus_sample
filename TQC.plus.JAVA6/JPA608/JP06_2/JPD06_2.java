package JPA608.JP06_2;

import java.util.Iterator;
import java.util.Vector;

abstract class Food{
	int amount;
	int calorie;
	Food(int i)
	{amount=i;}
	void setCaloriePerGram(int i)
	{calorie=i;}
	int getAmount(){return amount;}
	abstract int getCalorie();
}

class Rice extends Food{
	Rice(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}

class Egg extends Food{
	Egg(int i)
	{super(i);calorie=2;}
	int getCalorie(){return getAmount()*calorie;}
}

class Cabbage extends Food{
	Cabbage(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}

class PorkRib extends Food{
	PorkRib(int i)
	{super(i);calorie=10;}
	int getCalorie(){return getAmount()*calorie;}
}

class Carrot extends Food{
	Carrot(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}
//建立便當盒的物件
class LunchBox{
	int calorie;
	Vector content;
	//建構子初始為向量的物件
	LunchBox(){content=new Vector();}
	//建立增加物件的方法
	void add(Food f)
	{content.add(f);}

	//建立取得整個便當盒卡洛里的方法
	int getCalorie()
	{
		int i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();)
		{
			Food f = (Food)iterator.next();
			i+=f.getCalorie();
		}
			return i;
	}
}




class JPD06_2
{
    public static void main(String args[])
    {
    	//建立economy的便當盒物件
        LunchBox economy = new LunchBox();
        //將各個元素加入便當盒物件
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        System.out.println("Total calories of an economy lunch box are " + economy.getCalorie() +".");
      
        //建立economy的便當盒物件
        LunchBox valuedChoice = new LunchBox();
        //將各個元素加入便當盒物件
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie()+".");
        
    }
}