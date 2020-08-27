package service;

import java.util.*;
import customException.ProductNotFoundException;
import com.bs.ecom.product;

public interface interfaceProductService {

	public List<product> getProductCatelogue();
	public List<product> getProductCatelogueByCost(int cost);
	public product find_product(int sid) throws ProductNotFoundException;

}
