package edu.cca.niki.oms.models;

public class Product {
	private Integer id;
	private String name;//object member
	private Double price;
    static Integer nextId;//class member
    static {
    	nextId=501;
    }
    //default
  
	public Product()//same as class name constructors without parameters
	{
		this.id=nextId;
		nextId++;
		this.name="";
		this.price=0.0;
	}

	public Product(Integer id,String name,Double price)//with parameters --parameterized constructors
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public Product(String name,Double price)//with parameters --parameterized constructors
	{    
		this.id=nextId;
		nextId++;
		this.name=name;
		this.price=price;
	}
	
	public Product(Product p)//copy constructor
	{
		this.id=p.id;
		this.name=p.name;
		this.price=p.price;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String toString()
	{ 
		return String.format("%-10d%-20s%-20.2f", id,name,price);
	}
	
}
