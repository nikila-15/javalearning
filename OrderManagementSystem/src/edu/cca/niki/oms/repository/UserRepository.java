package edu.cca.niki.oms.repository;

import java.util.ArrayList;

import edu.cca.niki.oms.blueprint.GenericCRUD;
//import edu.cca.niki.oms.blueprint.UserCRUD;
import edu.cca.niki.oms.models.Admin;
//import edu.cca.niki.oms.models.CartProduct;
import edu.cca.niki.oms.models.Cashier;
import edu.cca.niki.oms.models.Customer;
import edu.cca.niki.oms.models.User;

public class UserRepository implements GenericCRUD<User,String> {

	public ArrayList<User> users;


	public UserRepository() {

		users = new ArrayList<User>();

		users.add(new Admin("suba","suba@gmail.com",true));

		users.add(new Admin("niki","niki@gmail.com",true));

		users.add(new Cashier("priya","priya@gmail.com",true));

		users.add(new Cashier("anitha","ani@gmail.com",true));

		users.add(new Customer("renu","renu@gmail.com",true));

		users.add(new Customer("mithra","mithu@gmail.com",true));

	}

	



	@Override

	public String create(User user) {

		users.add(user);

		return user.getId();

	}



	@Override

	public ArrayList<User> readAll() {

		// TODO Auto-generated method stub

		return users;

	}



	@Override

	public User readOne(String id) {

		int index=-1;

		for(int i=0;i<users.size();i++) {

			if(users.get(i).getId().equals(id)) {

				index=i;

				break;

			}

		}

		if(index!=-1) 

			return users.get(index);

		else

			return null;

		

	}



	@Override

	public User update(String id,String username,String useremail,String usertype) {

		User existingUser=readOne(id);

		if(existingUser!=null) {

			existingUser.setEmail(useremail);

			existingUser.setName(username);

			existingUser.setType(usertype.equals("Y")?true:false);

			return existingUser;

		}

		else {

			return null;

		}

		

	}

	




	@Override

	public Boolean delete(String id) {

		/*User existingUser=readOne(id);

		if(existingUser!=null)

			return users.remove(existingUser);

		else

			return false;*/

		

		return users.remove(readOne(id));

	}





	@Override
	public User update(String id, User p) {
		// TODO Auto-generated method stub
		return null;
	}







}