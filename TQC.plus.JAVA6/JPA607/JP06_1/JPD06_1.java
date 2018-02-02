package JPA607.JP06_1;
//建立NB的類別
class NB{
	int cost;
	NB(int i){if(i==1)cost=10000;else cost=8500;}
	int getCost(){return cost;}
}
public class JPD06_1 {
    public static void main(String args[]){
        NB e1 = new NB(1); 
        System.out.println("一台17'筆記型電腦成本:"+e1.getCost());
        NB e2 = new NB(2);
        System.out.println("一台14'筆記型電腦成本:"+e2.getCost());
       }
}