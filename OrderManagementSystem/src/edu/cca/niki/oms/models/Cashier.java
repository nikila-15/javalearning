package edu.cca.niki.oms.models;

public class Cashier extends User{
	public Cashier(String id, String name, String email, Boolean type) {
		super(id, name, email, type);
	}

	public Cashier( String name, String email, Boolean type) {
		super( name, email, type);
	}
	public Cashier() {
		 super();
	 }
	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return "Cashier";
	}

	@Override
	public Double calcilateDiscount(Double amount) {
		// TODO Auto-generated method stub

		return amount*0.70;
	}

}
