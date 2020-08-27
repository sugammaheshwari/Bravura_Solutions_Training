package dao;

import com.bs.ecom.*;
import java.util.List;
import customException.ProductNotFoundException;

public interface interfaceDao {

	public List<product> getAllproducts();
	public List<product> getProductByCost(int cost);
	public product searchProduct(int sid) throws ProductNotFoundException;
}
