package edu.cca.niki.oms.service;

//import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.cca.niki.oms.models.Product;
import edu.cca.niki.oms.repository.ProductMapRepository;

public class ProductMapService {
	private ProductMapRepository repo;
	private Scanner scan;
	public ProductMapService() {
		repo=new ProductMapRepository();
		scan=new Scanner(System.in);
	}
	 public void showAllProducts()
	   {    
		   Map<Integer,Product>products=repo.readAll();
		   System.out.printf("%-10s%-20s%-20s\n","Id","name","Price");
			for(Product product:products.values())
			{
				System.out.println(product);
			}
	   }
	   public void showOneProduct() {
		   System.out.println("Enter Products Id to show:");
		   Integer id=scan.nextInt();scan.nextLine();
		   Product p=repo.readOne(id);
		   if(p!=null){

				System.out.printf("%-10s%-20s%-20s\n","Id","name","Price");
				System.out.println(p);
		   }else {
			   System.out.println("ProductId not found ");
		   }
		   
	   }
	   public void createProduct() {
		   System.out.println("Enter Product Name:");
		   String name=scan.nextLine();
		   System.out.println("Enter Product price:");
		   Double price=scan.nextDouble();scan.nextLine();
		   Product p=new Product(name,price);
		   Integer id=repo.create(p);
		   System.out.println("Product "+id+" Created Successfully...");
				   
	   }
	   public void updateProduct() {
		   System.out.println("Enter Product Id to update:");
		   Integer id=scan.nextInt();
		   scan.nextLine();
		   if(repo.readOne(id)!=null)
		   System.out.println("Enter updated product Name:");
		   String name=scan.nextLine();
		   System.out.println("Enter updated product Price:");
		   Double price=scan.nextDouble();
		   scan.nextLine();
		   Product p=new Product(id,name,price);
		   if(repo.update(id, p)!=null) {
		   System.out.println("Product updated successfully...");
		  
		   }
	       else
		   System.out.println("not found...");
	   }
	   public void deleteProduct() {
		   System.out.println("Enter Product Id to delete:");
		   Integer id=scan.nextInt();
		   scan.nextLine();
		   if(repo.delete(id)!=null)                                                                        
		   {
		   System.out.println("Product deleted successfully...");
		  
		   }
	       else
		   System.out.println("not found...");
	}

}
