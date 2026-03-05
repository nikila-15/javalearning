package edu.cca.niki.oms.repository;

import java.util.ArrayList;
import java.util.List;

import edu.cca.niki.oms.blueprint.ProductCRUD;
import edu.cca.niki.oms.models.Product;

public class ProductRepository implements ProductCRUD{
    private List<Product> products=null;
	
	public ProductRepository() {
		products=new ArrayList();
		products.add(new Product("dell",6543.00));
		products.add(new Product("leno",3456.00));
		products.add(new Product("bimbu",6547.00));
		products.add(new Product("Apple",1234.00));
		// TODO Auto-generated constructor stub
	}
	@Override
	public Integer create(Product p) {
	 products.add(p);
	 return p.getId();
	}

	@Override
	public List<Product> readAll() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product readOne(Integer id) {
	  int index=-1;
	  for(int i=0;i<products.size();i++)
	  {
		  if(products.get(i).getId().equals(id)) {
			  index=i;
			  break;
		  }
	  }
	  if(index!=-1)
	  {
		  return products.get(index);
	  }
	  else {
		  return null;
	  }
	}

	@Override
	public Product update(Integer id, Product p) {
		Product pr=readOne(id);
		if(pr!=null) {
			pr.setName(p.getName());
			pr.setPrice(p.getPrice());
			}
		return pr;
	}

	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		/*Boolean isDeleted=false;
		Product pr=readOne(id);
		if(pr!=null)
		{
			isDeleted=products.remove(pr);
		}
		return isDeleted*/
		return products.remove(readOne(id));
	}
      
}
