package edu.cca.niki.oms.service;

import java.util.List;
import java.util.Scanner;

import edu.cca.niki.oms.models.Admin;
import edu.cca.niki.oms.models.Cashier;
import edu.cca.niki.oms.models.Customer;
import edu.cca.niki.oms.models.User;
import edu.cca.niki.oms.repository.UserRepository;

public class UserService {
        private UserRepository repo;
        private Scanner scan=null;
        public UserService() {
        	repo=new UserRepository();
        	scan=new Scanner(System.in);
        }
        public void ShowAllUsers()
        {
        	List<User>users=repo.readAll();
        	System.out.printf("%-10s%-25s%-25s%-10s%-10s\n","id","name","email","Role","is premium?");
        	for(int i=0;i<users.size();i++)
    		{
    			System.out.println(users.get(i));
    		}
        }

public void createUser() {
	System.out.println("1.Admin User 2.Customer user 3.Cashier user Which user");
	Integer userRole=scan.nextInt();scan.nextLine();
	System.out.println("Enter User name:");
	String userName=scan.nextLine();
	System.out.println("Enter user email:");
	String userEmail=scan.nextLine();
	System.out.println("Enter is premiuim user<y/n>:");
	String userType=scan.nextLine();
	User user;
	if(userRole==1)
		user=new Admin(userName,userEmail,userType.equals("Y"));
	else if(userRole==2)
		user=new Customer(userName,userEmail,userType.equals("Y"));
	else
		user=new Cashier(userName,userEmail,userType.equals("Y"));
	String createdUserId=repo.create(user);
	System.out.println("User created successfully:"+ createdUserId);
				
}
public void showOneUser() {
	System.out.println("Enter user id to show:");
	String id=scan.nextLine();
	User user=repo.readOne(id);
	if(user!=null) {
    	System.out.printf("%-10s%-25s%-25s%-10s%-10s\n","id","name","email","Role","is premium?");
    	System.out.println(user);
   
	}
	else
		System.out.println("User Id"+id+"Not Exist");
}
public void updateUser() {
	System.out.println("Enter User Id to update:");
	String id=scan.nextLine();
	System.out.println("Enter Updated Name:");
	String userName=scan.nextLine();

	System.out.println("Enter Updated Email:");
	String userEmail=scan.nextLine();
    System.out.println("Enter User Role to update 1.CUSTOMER 2.ADMIN 3.CASHIER:");
    Integer userRole=scan.nextInt();scan.nextLine();
	System.out.println("Enter Updated Is premium user<Y/N>:");
	String userType=scan.nextLine(); 
	User user;

		if(userRole==1)
			user=new Customer(userName,userEmail,userType.equals("Y"));
		else if(userRole==2)
			user=new Admin(userName,userEmail,userType.equals("Y"));
		else
			user=new Cashier(userName,userEmail,userType.equals("Y"));
		
					repo.update(id, user);
					System.out.println("User updated  successfully");
					//repo.create(user);
					//System.out.println("User created successfully:");
	//if(repo.update(id, userName, userEmail, userType)!=null)
		//System.out.println("Succesfully updated:"+id);
//	else
	//	System.out.println("user Id"+id+"not exist!");

}public void deleteUser() {
	System.out.println("Enter User Id to delete:");
	String id=scan.nextLine();
	if(repo.delete(id))
	
System.out.println("Successfully deleted:"+id);
	else System.out.println("User Id:"+id+"Not Exist!");
}
}