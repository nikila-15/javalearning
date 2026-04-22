package edu.cca.niki.oms.repository;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;

//import edu.cca.niki.oms.blueprint.GenericCRUD;
import edu.cca.niki.oms.blueprint.GenericMapCRUD;
import edu.cca.niki.oms.models.Admin;
import edu.cca.niki.oms.models.Cashier;
import edu.cca.niki.oms.models.Customer;
//import edu.cca.niki.oms.models.Product;
import edu.cca.niki.oms.models.User;

public class UserMapRepository implements GenericMapCRUD<User,String> {
	  private Map<String, User> users;
	  public UserMapRepository() {
			users =new HashMap<String,User>();
			User ur;
			ur=new Admin("Niki","niki@gmail.com",true);
			ur=new Cashier("Suba","suba@gmail.com",true);
			ur=new Customer("Anbu","anbu@gmail.com",true);
			users.put(ur.getId(),ur);
			
		}
	  @Override
	  public String create(User item) {
		users.put(item.getId(), item);
		return item.getId();
	  }
	  @Override
	  public Map<String, User> readAll() {
	
		return users;
	  }
	  @Override
	  public String update(String id, User item) {
	users.put(id, item);
		return id;
	  }
	  @Override
	  public String delete(String id) {
		users.remove(id);
		return id;
	  }
	  @Override
	  public User readOne(String id) {
		
		return users.get(id);
	  }

	 
}
