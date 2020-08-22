package day5;

// if we don't over-ride hashCode() method in the customobj class 
// then the JRE would have made 3 objects in the set 
// after over-riding it gives the size of set as 2.


import java.util.*;

public class Collection2 {

	
	public static void main2 (String[] args)
	{
		SortedSet set=new TreeSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		System.out.println(set.size());
		
		
		for(Object ob:set)
			System.out.println(ob);
	}
	
	public static void main(String[] args)
	{
			
		customobj ob1=new customobj("Sugam",22);
		customobj ob2=new customobj("Payas",24);
		customobj ob3=new customobj("Sugam",22);
		
		
		Set<customobj> set=new HashSet<customobj>();
		set.add(ob1);
		set.add(ob2);
		set.add(ob3);

		System.out.println(set.size());
		
	}
	
}
