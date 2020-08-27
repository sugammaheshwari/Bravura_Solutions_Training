package service;

import dao.*;
import java.util.List;

import com.bs.ecom.product;

import customException.ProductNotFoundException;
import dao.productDaoImpl;

public class productServiceImpl implements interfaceProductService {

	interfaceDao productDao;
	// note here we could have made productDaoImpl productDao , but we want to showcase the use of 
	// interface and thus we proceeded with the above !
	
	public productServiceImpl()
	{
		productDao=new productDaoImpl();
	}
	
	@Override
	public List<product> getProductCatelogue() {
		return productDao.getAllproducts();
	}

	@Override
	public List<product> getProductCatelogueByCost(int cost) {
		return productDao.getProductByCost(cost);
	}

	@Override
	public product find_product(int sid) throws ProductNotFoundException {
		
		return productDao.searchProduct(sid);
	}

}
