package day5;


// implementing the over-riding of hashCode() method !!!!1

public class customobj {
	
	String name;
	int age;
	public customobj(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	// RULE :
	//if hash-codes are different then object are different , no need to call equals
	// if hashcode of two objects are same then we have to check if they are meaningfully equal or not using equals method
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		customobj other = (customobj) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return ("name= "+ this.name + " ; age= " +this.age); 
	}
	
	
	
	

}
