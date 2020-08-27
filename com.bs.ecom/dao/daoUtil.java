package dao;

import java.util.ArrayList;
import com.bs.ecom.product;

public class daoUtil {

	static ArrayList<product> l1=new ArrayList<>();
	
	public static ArrayList<product> getProductDatabase()
	{
		l1.add(new product(1,"lappy",10000));
		l1.add(new product(2,"word",1000));
		l1.add(new product(3,"macbook",110000));
		l1.add(new product(4,"office",5000));
		l1.add(new product(5,"limited edition macx",9999999));
		return l1;
	}
	
}
