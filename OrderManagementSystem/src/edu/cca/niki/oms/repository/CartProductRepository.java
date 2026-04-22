package edu.cca.niki.oms.repository;

import java.util.ArrayList;
import java.util.List;

//import edu.cca.niki.oms.blueprint.CartCRUD;
import edu.cca.niki.oms.blueprint.GenericCRUD;
import edu.cca.niki.oms.models.CartProduct;
//import edu.cca.niki.oms.models.Product;

public class CartProductRepository implements GenericCRUD<CartProduct,String>{
	private List<CartProduct>cartProducts;
	public CartProductRepository()
	{
		cartProducts=new ArrayList<CartProduct>();
		cartProducts.add(new CartProduct("Laptop",43566.00,6));
		cartProducts.add(new CartProduct("hone",87867.00,8));
		cartProducts.add(new CartProduct("kiko",22226.00,4));
		cartProducts.add(new CartProduct("lolkkk",8066.00,6));
	}
	public String create(CartProduct cartProduct) {
		cartProducts.add(cartProduct);
		return cartProduct.getId();
		// TODO Auto-generated method stub
	
	}

	@Override
	public List<CartProduct> readAll() {
		// TODO Auto-generated method stub
		return cartProducts;
	}

	@Override
	public CartProduct readOne(String id) {
		// TODO Auto-generated method stub
		int index=-1;
		for(int i=0;i<cartProducts.size();i++) {
			if(cartProducts.get(i).getId().equals(id)) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			return cartProducts.get(index);
		}else {
		return null;}
	}

	@Override
	public CartProduct update(String id, CartProduct cart) {
		// TODO Auto-generated method stub
		CartProduct pr=readOne(id);
		if(pr!=null) {
			pr.setName(cart.getName());
			pr.setPrice(cart.getPrice());
			pr.setQuantity(cart.getQuantity());
			
		}
		return pr;
	
	}

	@Override
	public Boolean delete(String id) {
		// TODO Auto-generated method stub
		return  cartProducts.remove(readOne(id));
	}
	@Override
	public CartProduct update(String t1, String t2, String t3, String t4) {
		// TODO Auto-generated method stub
		return null;
	}

}
