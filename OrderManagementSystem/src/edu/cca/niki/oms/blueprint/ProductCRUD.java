package edu.cca.niki.oms.blueprint;

import java.util.List;

import edu.cca.niki.oms.models.Product;

public interface ProductCRUD {
	Integer create(Product p);
	List<Product>readAll();
	Product readOne(Integer id);
	Product update(Integer id,Product p);
	Boolean delete(Integer id);
	

}
