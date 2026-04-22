package edu.cca.niki.oms.service;

//import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.cca.niki.oms.models.CartProduct;
//import edu.cca.niki.oms.models.Product;
import edu.cca.niki.oms.repository.CartProductMapRepository;
//import edu.cca.niki.oms.repository.CartProductRepository;

public class CartProductMapService {
	private CartProductMapRepository repo;
    private Scanner scan;
    public CartProductMapService()
    {
   	 repo=new CartProductMapRepository();
   	 scan =new Scanner(System.in);
   	 
    }
    public void readAllCartProducts() {
    	  Map<String,CartProduct>cartproducts=repo.readAll();
         System.out.printf("%-10s%-20s%-20s%-10s\n","Id","name","Price","quantity");
         for(CartProduct product:cartproducts.values())
			{
				System.out.println(product);
			}
    }
    public void createCartProduct() {

 	   System.out.println("Enter Cart Product Name:");
 	   String name=scan.nextLine();
 	   System.out.println("Enter Cart Product price:");
 	   Double price=scan.nextDouble();scan.nextLine();
 	 System.out.println("Enter quantity :");
	   Integer quantity=scan.nextInt();scan.nextLine();
 	   CartProduct cp=new CartProduct(name,price,quantity);
 	   String id=repo.create(cp);
 	   System.out.println(" cartProduct "+id+" Created Successfully...");
    }
    public void showOneCartProduct() {
 	   System.out.println("Enter Cart Products Id to show:");
	   String id=scan.nextLine();
	   CartProduct cp=repo.readOne(id);
	   if(cp!=null){

			System.out.printf("%-10s%-20s%-20s%-10s\n","Id","name","Price","Quantity");
			System.out.println(cp);
	   }else {
		   System.out.println(" Cart ProductId not found ");
	   
    }
}
    public void updateCartProduct() {
   	 System.out.println("Enter Product Id to update:");
 	   String id=scan.nextLine();
 	   if(repo.readOne(id)!=null) {
 	   System.out.println("Enter upated Cart product Name:");
 	   String name=scan.nextLine();
 	   System.out.println("Enter upated Cart product Price:");
 	   Double price=scan.nextDouble();
 	 System.out.println("Enter upated Cart product Quantity:");
	   Integer quantity=scan.nextInt();
 	   scan.nextLine();
 	   CartProduct cp=new CartProduct(id,name,price,quantity);
 	   if(repo.update(id, cp)!=null) {
 	   System.out.println("CartProduct updated successfully...");
    }
 	 else {
        System.out.println("Product not found...");
    }
}	
    }
    public void deleteCartProduct() {
   	   System.out.println("Enter Card Product Id to delete:");
   	   String id=scan.nextLine();
   	   scan.nextLine();
   	   if(repo.delete(id)!=null)
   	   {
   	   System.out.println("cart Product deleted successfully...");
   	  
   	   }
          else
   	   System.out.println("not found...");
   }
}
