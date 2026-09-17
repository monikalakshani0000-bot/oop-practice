class Box{
	private int length;
	private int width;
	private int height;
	
	public Box(){
	}
	public Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void printVolume(){
		int volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
}
class Demo {
	public static void main(String[] args) {
		Box[] br=new Box[3]; //Reference array, Box type
		br[0]=new Box(12,5,3);
		br[1]=new Box(120,50,30);
		br[2]=new Box(1,2,3);
		
		//Insert code here to get the following output	
		for(int i=0; i<br.length; i++){
			Box b1=br[i];
			b1.printVolume(); //br[i].printVolume();
		}
		System.out.println();
		for(Box b1 : br){
			b1.printVolume();
		}
	}
}
/*
Volume of the box : 180
Volume of the box : 18000
Volume of the box : 6
*/
