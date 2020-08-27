package View;

import java.util.*;
import com.bs.ecom.*;
import service.*;
import com.bs.ecom.*;
import customException.ProductNotFoundException;

public class mainclass {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt(),cost=-1,pid=-1;
		
		if(opt==2) cost=sc.nextInt();
		else if(opt==3) pid=sc.nextInt();
		sc.close();
	
		List<product> l=permform_query(opt,cost,pid);
		if(l!=null)
			for(product p:l)
				System.out.println(p);
			
		
		System.out.print("thank you for your Query !!!");
	}
	
	
	public static List<product> permform_query(int opt,int cost,int pid)
	{
		interfaceProductService ps1=new productServiceImpl();
		product p=null;
		
		switch(opt)
		{
		case 1: return ps1.getProductCatelogue();
		case 2: return ps1.getProductCatelogueByCost(cost);
		case 3:
			{	
				try {
					p=ps1.find_product(pid);
					System.out.println(p);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			return null;
			}
		}

		return null;
	}

	
	
	
}
