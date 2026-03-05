package edu.cca.niki.oms;

import java.util.ArrayList;
import java.util.Scanner;

import edu.cca.niki.oms.models.Product;
import edu.cca.niki.oms.service.ProductService;

public class OrderManagementDemo {

	public static void main(String[] args) {
	/*	ArrayList products=new ArrayList();
		
		products.add(new Product("dell",6543.00));
		products.add(new Product("leno",3456.00));
		products.add(new Product("bimbu",6547.00));
		products.add(new Product("Apple",1234.00));
		
		//products[4]=new Product();
		//p1.id=100;
       // Product p6=new Product();
        
     
		System.out.printf("%-10s%-20s%-20s\n","Id","name","Price");
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i));
		}*/
		ProductService service=new ProductService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.createProduct();break;
			case 2:service.showAllProducts();break;
			case 3:service.showOneProduct();break;
			case 4:service.updateProduct();break;
			case 5:service.deleteProduct();break;
		    default:choice=6;
			}
		}
		System.out.println("Program End!");
	}
	

}
