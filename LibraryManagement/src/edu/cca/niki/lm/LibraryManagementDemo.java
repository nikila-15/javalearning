package edu.cca.niki.lm;
import java.util.Scanner;
import edu.cca.niki.lm.models.Library;
import edu.cca.niki.lm.service.LibraryService;


public class LibraryManagementDemo {

	public static void main(String[] args) {
		LibraryService service=new LibraryService();
		Scanner scan=new Scanner(System.in);
		int choice=0;
		while(choice!=6) {
			System.out.println("1.create 2.ReadAll 3.ReadOne 4.Update 5.Delete 6.Exit Enter:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1:service.createLibrary();break;
			case 2:service.showAllLibraries();break;
			case 3:service.showOneLibrary();break;
			case 4:service.updateLibrary();break;
			case 5:service.deleteLibrary();break;
		    default:choice=6;
			}
		}
		System.out.println("Program End!");
	}
	

}
