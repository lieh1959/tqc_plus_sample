package JPA608.JP06_1;
//建立抽象的食物類別
abstract class Food{
	int amount;
	int calorie;
	//建構子初始化份量
	Food(int i)
	{amount=i;}
	//建立設定卡洛里方法
	void setCaloriePerGram(int i)
	{calorie=i;}
	//建立取得份量的方法
	int getAmount(){return amount;}
	//建立取得份量的抽象方法，待繼承者去實作
	abstract int getCalorie();
}
//繼承食物
class Rice extends Food{
	Rice(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}
//繼承食物
class Egg extends Food{
	Egg(int i)
	{super(i);calorie=2;}
	int getCalorie(){return getAmount()*calorie;}
}
//繼承食物
class Cabbage extends Food{
	Cabbage(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}
//繼承食物
class PorkRib extends Food{
	PorkRib(int i)
	{super(i);calorie=10;}
	int getCalorie(){return getAmount()*calorie;}
}
//繼承食物
class Carrot extends Food{
	Carrot(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}

class JPD06_1
{
    public static void main(String args[])
    {
    	//建立米的物件
        Rice rice = new Rice(100);
        System.out.println( rice.getAmount() + " grams of rice has " + rice.getCalorie() + " calories.");
        //建立蛋的物件
        Egg egg = new Egg(30);
        System.out.println( egg.getAmount() + " grams of egg has " + egg.getCalorie() + " calories.");
        //建立高麗菜的物件
        Cabbage cabbage = new Cabbage(50);
        System.out.println( cabbage.getAmount() + " grams of cabbage has " + cabbage.getCalorie() + " calories.");
        //建立排骨的物件
        PorkRib porkRib = new PorkRib(300);
        System.out.println( porkRib.getAmount() + " grams of pork rib has " + porkRib.getCalorie() + " calories.");
        //建立胡蘿蔔的物件
        Carrot carrot = new Carrot(100);
        System.out.println( carrot.getAmount() + " grams of carrot has " + carrot.getCalorie() + " calories.");  
    }
}