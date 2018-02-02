class JPA108 {
  
  public static void main (String[] args) {
    int i = add(2, 3);
    double d = add(5.2, 4.3);
    String s = add("I love ", "Java!!");
    System.out.printf("%d %f %s %n", i, d, s);
  }

public  static int add(int a,int b){
	System.out.printf("Adding two integer: %d , %d \n",a,b);
	return (a+b);
}

public  static  double add(double a,double b){
	System.out.printf("Adding two doubles: %2.1f , %2.1f \n",a,b);
	return (a+b);
}

public  static  String add(String a,String b){
	System.out.printf("Adding two strings: %s, %s \n",a,b);
	return (a+b);
}
}