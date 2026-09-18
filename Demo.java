class Student{
	private String id;
	private String name;
	private int prf;
	private int dbms;
	
	public void printStudentDetails(){
		System.out.println(id+"\t"+name+"\t"+prf+"\t"+dbms);
	}
	
	public void setStudentDetails(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void setMarks(int prf, int dbms){
		this.prf = prf;
		this.dbms = dbms;
	}
		
	public void setPrfMarks(int prfM){
		this.prf = prfM;
	}
	
	public void setDbmsMarks(int dbmsM){
		this.dbms = dbmsM;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPrfMarks(){
		return prf;
	}
	
	public int getDbmsMarks(){
		return dbms;
	}

	
	public int getTotal(){
		return prf+dbms;
	}
}

class Demo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentDetails("S0001","Nimal");
		s1.setMarks(56,70);
		s1.printStudentDetails(); //S0001	Nimal	56 	70
		
		s1.setPrfMarks(89);
		s1.setDbmsMarks(90);
		s1.printStudentDetails(); //S0001	Nimal	89	90
		
		System.out.println("Student Id   : "+s1.getId());	//S0001
		System.out.println("Student Name : "+s1.getName());	//Nimal
		System.out.println("PRF Marks    : "+s1.getPrfMarks());//89
		System.out.println("DBMS Marks   : "+s1.getDbmsMarks());//90
		System.out.println("Total Marks  : "+s1.getTotal());//179
    }
}
