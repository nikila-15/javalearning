package edu.cca.niki.lm.service;

import java.util.List;
import java.util.Scanner;

import edu.cca.niki.lm.models.Library;
import edu.cca.niki.lm.repository.LibraryRepository;

public class LibraryService { 
private LibraryRepository repository=null;
private Scanner scan=null;
public LibraryService() {
	 
	   repository=new LibraryRepository();
       scan=new Scanner(System.in);
}
public void showAllLibraries()
{    
	   List<Library>libraries=repository.readAll();
	   System.out.printf("%-10s%-20s%-20s%-20s%-20s\n","Id","Bname","Price","Racknumber","Copy");
		for(int i=0;i<libraries.size();i++)
		{
			System.out.println(libraries.get(i));
		}
}
public void showOneLibrary() {
	   System.out.println("Enter Libraries Id to show:");
	   Integer id=scan.nextInt();scan.nextLine();
	   Library l=repository.readOne(id);
	   if(l!=null){

			System.out.printf("%-10s%-20s%-20s%-20s%-20s\n","Id","Bname","Price","Racknumber","Copy");
			System.out.println(l);
	   }else {
		   System.out.println("BookId not found ");
	   }
	   
}
public void createLibrary() {
	   System.out.println("Enter Book Name:");
	   String bname=scan.nextLine();
	   System.out.println("Enter Book price:");
	   Double price=scan.nextDouble();scan.nextLine();
	   System.out.println("Enter Book Racknumber:");
	   Integer racknumber=scan.nextInt();scan.nextLine();
	   System.out.println("Enter Books Copy:");
	   Integer copy=scan.nextInt();scan.nextLine();
	   Library l=new Library(bname,price,racknumber,copy);
	   Integer id=repository.create(l);
	   System.out.println("Book "+id+" Created Successfully...");
			   
}
public void updateLibrary() {
	   System.out.println("Enter Library Id to update:");
	   Integer id=scan.nextInt();
	   scan.nextLine();
	   if(repository.readOne(id)!=null) {
	   System.out.println("Enter upated Book Name:");
	   String bname=scan.nextLine();
	   System.out.println("Enter upated Book Price:");
	   Double price=scan.nextDouble();
	   System.out.println("Enter upated Book Racknumber:");
	   Integer racknumber=scan.nextInt();
	   System.out.println("Enter upated Book Copy:");
	   Integer copy=scan.nextInt();
	   scan.nextLine();
	   Library l=new Library(id,bname,price,racknumber,copy);
	   if(repository.update(id, l)!=null) {
	   System.out.println("Books updated successfully...");
	           }
	   }
    else {
	   System.out.println("not found...");
}
	   }
public void deleteLibrary() {
	   System.out.println("Enter Book Id to delete:");
	   Integer id=scan.nextInt();
	   scan.nextLine();
	   if(repository.delete(id))
	   {
	   System.out.println("Books deleted successfully...");
	  
	   }
    else
	   System.out.println("not found...");
}

}
