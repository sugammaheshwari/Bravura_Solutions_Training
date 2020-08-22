package day5;


import java.util.*;

public class collectionAPI {
	
	
	public static void main(String[] args)
	{
		
		int arr[]= {1,2,34,5,6,7};
		
//		for(int x:arr)
//			System.out.println(x);
//		// both are the same thing !
//		for(Integer x:arr)
//			System.out.println(x);
		
		List l1=new ArrayList();
		// generic list which can contain any data type !
		
		
		// printing objects in a list !
//		l1.add(10);
//		l1.add("Sugam");
//		l1.add(false);
//		
//		for(Object ob:l1)
//			System.out.println(ob);
//		
		
		List l2=new LinkedList();
		l2.add(10);
		l2.add("Sugam");l2.add(1000);
		l2.add(false);l2.add("Sugam");
		l2.add(false);l2.add("Sugam");
		l2.add(false);l2.add(-999);
		
		l2.remove("Sugam");
		
		
		Iterator itr=l2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			// prints current object and moves the iterator forward!
		}
	
	}
	
	
	
//	public void list_method(List obj)
//	{
//		
//	}

}
