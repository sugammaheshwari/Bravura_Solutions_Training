package day5;

import java.util.*;

public class mainclass {

	
	public static void main(String[] args)
	{
		
		List l1=new ArrayList();
		// generic list !
		
		
		l1.add(new customobj("sugam",22));
		l1.add(new customobj("Payas",24));
		l1.add(new customobj("Ankit",29));

		
		//new mainclass().remove_method(l1);
		//new mainclass().search_employee(l1);
		new mainclass().replace_employee(l1);
	
		for(Object x:l1)
			System.out.println(x);

	}
	
	public void remove_method(List l)
	{
		
		customobj ob1=new customobj("Payas",24);
		
		// now if we try to remove this object from the passed list , then it wont delete 
		// because = operator hasnt been overloaded yet , so it compares the reference 
		// and these wont be equal 
		
		// after overloading and = operator in customobj class
		// this problem will be fixed!
		
		l.remove(ob1);
		System.out.println(l.size());
		
	}
	
	public void search_employee(List l)
	{
		customobj ob1=new customobj("Payas",24);
		System.out.println(l.contains(ob1));
	}
	
	
	
	public void replace_employee(List l)
	{
		customobj ob1=new customobj("Sugam",24);
		customobj ob2=new customobj("Master suggs",24);
		
		int idx=l.indexOf(ob1);
		l.set(idx, ob2);
	}
	
}
