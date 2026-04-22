package edu.cca.niki.oms.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import edu.cca.niki.oms.models.CartProduct;
import edu.cca.niki.oms.models.Order;
import edu.cca.niki.oms.models.User;
import edu.cca.niki.oms.repository.CartProductMapRepository;
import edu.cca.niki.oms.repository.CartProductRepository;
import edu.cca.niki.oms.repository.OrderMapRepository;
import edu.cca.niki.oms.repository.UserMapRepository;
import edu.cca.niki.oms.repository.UserRepository;

public class OrderMapService {
	private OrderMapRepository repo;
    private Scanner scan;
    private CartProductMapRepository CartRepo;
    private UserMapRepository userRepo;
    public OrderMapService()
    {
   	 repo=new OrderMapRepository();
   	 scan =new Scanner(System.in);
	 CartRepo=new CartProductMapRepository();
	userRepo=new UserMapRepository();
    }
    public void readAll() {
    	
    	Map<String,Order>orders=repo.readAll();
    	System.out.printf("%-10s%-20s%-25s%-25s%-20s%-20s\n","ID","Customer Id","Order Date","Total Price","Discounted Price","Payment Type","Payment status");
    for(Order order:orders.values()) {
    	System.out.println(order);
    }
    }
    public void create() {
    	if(CartRepo.readAll().size()==0) {
    		System.out.println("Cart is Empty ....First fill the Empty cart" );
    		return;
    	}
    	Order order=new Order();
    	System.out.println("Enter Customer ID:");
    	String customerId=scan.nextLine();
    	System.out.println("Enter Order Date(dd-MM-yyyy):");
    	String dateString=scan.nextLine();
    	LocalDate orderDate=LocalDate.parse(dateString,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    	order.setCustomerId(customerId);
    	order.setOrderDate(orderDate);
    	order.setProducts((Map<String,CartProduct>) CartRepo.readAll());
    	Double totalPrice=0.0;
    	Map<String,CartProduct>products=(Map<String,CartProduct>) CartRepo.readAll();
    	for(CartProduct product:products.values()) {
    		totalPrice=totalPrice+(product.getPrice()*product.getQuantity());
    	}
    	order.setTotalPrice(totalPrice);
    	User user=userRepo.readOne(customerId);
    	order.setDiscountPrice(user.calcilateDiscount(totalPrice));
        order.setPaymentType("card");
        order.setPaymentStatus(true);
        repo.create(order);
        System.out.println("Order Created Successfully!");
    }

    public void update() {
    	Order order=new Order();
    	Map<String,CartProduct>products=CartRepo.readAll();
    	System.out.println("Enter Order ID to update:");
    	String orderId=scan.nextLine();
    	System.out.println("Enter Customer Id:");
    	String customerId=scan.nextLine();
    	System.out.println("Enter Order Date (dd-MM-yyyy):");
    	String dateString=scan.nextLine();
    	LocalDate orderDate=LocalDate.parse(dateString,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    	order.setId(orderId);
    	order.setCustomerId(customerId);
    	order.setOrderDate(orderDate);
    	order.setProducts((Map<String,CartProduct>)CartRepo.readAll());
    	Double totalPrice=0.0;
    	for(CartProduct product:products.values()) {
    		totalPrice=totalPrice+(product.getPrice()*product.getQuantity());
    	}
    	order.setTotalPrice(totalPrice);
    	User user = userRepo.readOne(customerId);

    	if(user == null) {
    	    System.out.println("Invalid Customer ID! Please enter a valid ID.");
    	    return;
    	}

    	order.setDiscountPrice(user.calcilateDiscount(totalPrice));
       order.setPaymentType("Card");
       order.setPaymentStatus(true);
       repo.update(orderId,order);
       System.out.println("Order Updated Successfully!");
    }
    public void delete() {
    	System.out.println("Enter Order Id to Delete:");
    	String orderId=scan.nextLine();
    	repo.delete(orderId);
    	System.out.println("Order Deleted Successfully!");
    } 
    public void readOne() {
    	System.out.println("Enter Order Id:");
    	String orderId=scan.nextLine();
    	Order order=repo.readOne(orderId);
    	System.out.printf("%-10s%-15s%-20s%-20s%-20s%-15s%-15s\n","Id","Customer Id","Order Date","Total Price","Discounted Price","Payment Type","Payment Status");
    	System.out.println(order);
    }
}
