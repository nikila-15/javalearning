package edu.cca.niki.oms.models;

public  class Customer extends User{

	public Customer(String id, String name, String email, Boolean type) {
		super(id, name, email, type);
	}

	public Customer( String name, String email, Boolean type) {
		super( name, email, type);
	}
	public Customer() {
		 super();
	 }
	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return "CUSTOMER";
	}

	@Override
	public Double calcilateDiscount(Double amount) {
		// TODO Auto-generated method stub

		return (this.type)?amount*0.90:amount*0.95;
	}


}
