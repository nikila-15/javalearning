package edu.cca.niki.oms;

//import java.util.ArrayList;
import java.util.Scanner;

import edu.cca.niki.oms.service.OrderMapService;
//import edu.cca.niki.oms.service.CartProductMapService;
//import edu.cca.niki.oms.models.Admin;
//import edu.cca.niki.oms.models.Cashier;
//import edu.cca.niki.oms.models.Customer;
//import edu.cca.niki.oms.models.User;
//import edu.cca.niki.oms.service.CartProductService;
//import edu.cca.niki.oms.service.OrderService;
//import edu.cca.niki.oms.service.ProductMapService;
//import edu.cca.niki.oms.service.UserService;
import edu.cca.niki.oms.service.UserMapService;


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
		}*//*
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
		CartProductService service=new CartProductService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.createCartProduct();break;
			case 2:service.readAllCartProducts();break;
			case 3:service.showOneCartProduct();break;
			case 4:service.updateCartProduct();break;
	        case 5:service.deleteCartProduct();break;
		    default:choice=6;
			}
		}
		System.out.println("Program End!");
*//*
Admin ad=new Admin("niks","nana@gmail.com",true);
Cashier ch=new Cashier("kumar","tt@gmail.com",true);
Customer cu=new Customer("jjkkkh","uu@gmail.com",false);
 
  System.out.println(ad);
  System.out.println(ad.calcilateDiscount(60000.00));
  System.out.println(ch);

  System.out.println(ad.calcilateDiscount(90000.00));
  System.out.println(cu);+++
  System.out.println(ad.calcilateDiscount(50000.00));

User us;

us=new Admin("niks","nana@gmail.com",true);
System.out.println(us);
System.out.println(us.calcilateDiscount(60000.00));

us=new Cashier("kumar","tt@gmail.com",true);
System.out.println(us);
System.out.println(us.calcilateDiscount(90000.00));


us=new Customer("jjkkkh","uu@gmail.com",false);
System.out.println(us);

System.out.println(us.calcilateDiscount(50000.00));*/
/*
		UserService service=new UserService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.createUser();break;
			case 2:service.ShowAllUsers();break;
		case 3:service.showOneUser();break;
		case 4:service.updateUser();break;
		case 5:service.deleteUser();break;
		    default:choice=6;
			}
		}
		System.out.println("Program End!");
		OrderService service=new OrderService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.create();break;
			case 2:service.readAll();break;
		case 3:service.readOne();break;
		case 4:service.update();break;
		case 5:service.delete();break;
		    default:choice=6;
			}
		}
		System.out.println("Program End!");
		scan.close();*/
		/*ProductMapService service=new ProductMapService();
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
		}*/
		/*CartProductMapService service=new CartProductMapService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.createCartProduct();break;
			case 2:service.readAllCartProducts();break;
			case 3:service.showOneCartProduct();break;
			case 4:service.updateCartProduct();break;
	        case 5:service.deleteCartProduct();break;
		    default:choice=6;
			}
		}*/
		/*
		UserMapService service=new UserMapService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.createUser();break;
			case 2:service.ShowAllUsers();break;
		case 3:service.showOneUser();break;
		case 4:service.updateUser();break;
		case 5:service.deleteUser();break;
		    default:choice=6;
			}
		}*/
		OrderMapService service=new OrderMapService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.create();break;
			case 2:service.readAll();break;
		case 3:service.readOne();break;
		case 4:service.update();break;
		case 5:service.delete();break;
		    default:choice=6;
			}
		}
		System.out.println("Program End!");
		scan.close();
} }
		
