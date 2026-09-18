class A{
	int a;
	static int b;
}
class Demo {
	public static void main(String[] args) {
		A a1=new A();
		a1.a=1;
		a1.b=2;
		
		A a2=new A();
		a2.a=10;
		a2.b=20;
		
		A a3=new A();
		a3.a=100;
		a3.b=200;
		
		System.out.println("a1 : "+a1.a+" "+a1.b); //1 200
		System.out.println("a2 : "+a2.a+" "+a2.b); //10 200
		System.out.println("a3 : "+a3.a+" "+a3.b); //100 200
		
	}
}
