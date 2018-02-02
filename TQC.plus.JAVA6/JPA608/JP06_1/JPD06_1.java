package JPA608.JP06_1;
//�إߩ�H���������O
abstract class Food{
	int amount;
	int calorie;
	//�غc�l��l�ƥ��q
	Food(int i)
	{amount=i;}
	//�إ߳]�w�d������k
	void setCaloriePerGram(int i)
	{calorie=i;}
	//�إߨ��o���q����k
	int getAmount(){return amount;}
	//�إߨ��o���q����H��k�A���~�Ӫ̥h��@
	abstract int getCalorie();
}
//�~�ӭ���
class Rice extends Food{
	Rice(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}
//�~�ӭ���
class Egg extends Food{
	Egg(int i)
	{super(i);calorie=2;}
	int getCalorie(){return getAmount()*calorie;}
}
//�~�ӭ���
class Cabbage extends Food{
	Cabbage(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}
//�~�ӭ���
class PorkRib extends Food{
	PorkRib(int i)
	{super(i);calorie=10;}
	int getCalorie(){return getAmount()*calorie;}
}
//�~�ӭ���
class Carrot extends Food{
	Carrot(int i)
	{super(i);calorie=1;}
	int getCalorie(){return getAmount()*calorie;}
}

class JPD06_1
{
    public static void main(String args[])
    {
    	//�إߦ̪�����
        Rice rice = new Rice(100);
        System.out.println( rice.getAmount() + " grams of rice has " + rice.getCalorie() + " calories.");
        //�إ߳J������
        Egg egg = new Egg(30);
        System.out.println( egg.getAmount() + " grams of egg has " + egg.getCalorie() + " calories.");
        //�إ߰��R�檺����
        Cabbage cabbage = new Cabbage(50);
        System.out.println( cabbage.getAmount() + " grams of cabbage has " + cabbage.getCalorie() + " calories.");
        //�إ߱ư�������
        PorkRib porkRib = new PorkRib(300);
        System.out.println( porkRib.getAmount() + " grams of pork rib has " + porkRib.getCalorie() + " calories.");
        //�إ߭J�ڽ�������
        Carrot carrot = new Carrot(100);
        System.out.println( carrot.getAmount() + " grams of carrot has " + carrot.getCalorie() + " calories.");  
    }
}