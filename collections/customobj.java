package day5;

public class customobj {
	
	String name;
	int age;
	public customobj(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(!(obj instanceof customobj)) return false;
		boolean res=true;
		
		customobj cob1=(customobj)obj;
		
		res=res|| cob1.name.equals(this.name);
		res=res|| (cob1.age==this.age);
		
		return res;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return ("name= "+ this.name + " ; age= " +this.age); 
	}
	
	
	
	

}
