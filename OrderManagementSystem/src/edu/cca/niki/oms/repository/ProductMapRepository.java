package edu.cca.niki.oms.repository;

import java.util.HashMap;
import java.util.Map;

import edu.cca.niki.oms.blueprint.GenericMapCRUD;
import edu.cca.niki.oms.models.Product;

public class ProductMapRepository implements GenericMapCRUD<Product,Integer> {
    private Map<Integer, Product> products;
	public ProductMapRepository() {
		products =new HashMap<Integer,Product>();
		Product pr=new Product("IPhone",209.00);
		products.put(pr.getId(),pr);
		
	}
	@Override
	public Integer create(Product item) {
		products.put(item.getId(),item);
		return item.getId();
	}
	@Override
	public Map<Integer, Product> readAll() {
		// TODO Auto-generated method stub
		return products;
	}
	@Override
	public Integer update(Integer id, Product item) {
	products.put(id, item);
		return id;
	}
	@Override
	public Integer delete(Integer id) {
		products.remove(id);
		return id;
	}
	@Override
	public Product readOne(Integer id) {
	
		return products.get(id);
	}

}
