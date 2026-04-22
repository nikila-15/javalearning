package edu.cca.niki.oms.models;

public class Admin extends User{
	public Admin(String id, String name, String email, Boolean type) {
		super(id, name, email, type);
	}

	public Admin( String name, String email, Boolean type) {
		super( name, email, type);
	}
 public Admin() {
	 super();
 }
	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return "ADMIN";
	}

	@Override
	public Double calcilateDiscount(Double amount) {
		// TODO Auto-generated method stub

		return amount*0.50;
	}

}
