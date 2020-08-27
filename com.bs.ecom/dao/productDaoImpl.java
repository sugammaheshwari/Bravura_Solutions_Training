package dao;

import java.util.*;
import com.bs.ecom.product;
import customException.ProductNotFoundException;

public class productDaoImpl implements interfaceDao {

	ArrayList<product> products;
	
	public productDaoImpl() {
		products=daoUtil.getProductDatabase();
	}

	@Override
	public List<product> getAllproducts() {
		return products;
	}

	@Override
	public List<product> getProductByCost(int cost) {
		
		ArrayList<product> l=new ArrayList<>();
		Iterator<product> it=products.iterator();
		while(it.hasNext())
		{
			product p=it.next();
			if(p.getpCost()==cost)
				l.add(p);
		}
		return l;
	}

	@Override
	public product searchProduct(int sid) throws ProductNotFoundException {

		Iterator<product> it=products.iterator();
		while(it.hasNext())
		{
			product p=it.next();
			if(p.getpId()==sid)
				return p;
		}
		
		throw new ProductNotFoundException("Error : no such product exists with product id:"+sid);
	}

}
