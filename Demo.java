class Box{
	int length=12;
	int width=5;
	int height=3;
	Box(){
		
	}
	Box(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		System.out.println("Length of b1 : "+b1.length);	//
		System.out.println("Width  of b1 : "+b1.width);	//
		System.out.println("Height of b1 : "+b1.height);	//
		
		Box b2=new Box(120,50,30);
		System.out.println("Length of b2 : "+b2.length);	//
		System.out.println("Width  of b2 : "+b2.width);	//
		System.out.println("Height of b2 : "+b2.height);	//
	}
}
