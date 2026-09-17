class Date{
	int year;
	int month;
	int day;
	
	Date(){
		year=1970;
		month=1;
		day=1;
	}		
	
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	
	public void set(int y, int m, int d ){
		this.year = y;
		this.month = m;
		this.day = d;		
	}
	
	public Date(int y, int m, int d ){
		this.year = y;
		this.month = m;
		this.day = d;		
	}
	
	public void setYear(int y){
		this.year = y;		
	}
	
	public void setMonth(int m){
		this.month = m;		
	}
	
	public void setDay(int d){
		this.day = d;		
	}
	
	public String toString(){
		return year+"-"+month+"-"+day;
	}

	 
}
class Demo {
	public static void main(String[] args) {
		Date d1=new Date();
		d1.printDate(); //1970-1-1 (Default date);
		
		d1.set(1999,12,31);	
		d1.printDate(); //1999-12-31
		
		Date d2=new Date(2020,3,14);
		d2.printDate(); //2020-3-14
		
		Date d3=new Date();
		d3.setYear(2026);
		d3.setMonth(9);
		d3.setDay(17);
		System.out.println(d3.toString());//2026-9-17
	}
}



