package edu.cca.niki.lm.models;
public class Library {
	private Integer id;
	private String bname;//object member
	private Double price;
	private Integer racknumber;
	private Integer copy;
    static Integer nextId;//class member
    static {
    	nextId=100;
    }
    //default
  
	public Library()//same as class name constructors without parameters
	{
		this.id=nextId;
		nextId++;
		this.bname="";
		this.price=0.0;
		this.racknumber=0;
		this.copy=0;
	}

	public Library(Integer id,String bname,Double price,Integer racknumber,Integer copy)//with parameters --parameterized constructors
	{
		super();
		this.id=id;
		this.bname=bname;
		this.price=price;
		this.racknumber=racknumber;
		this.copy=copy;
	}
	public Library(String bname,Double price,Integer racknumber,Integer copy)//with parameters --parameterized constructors
	{    
		this.id=nextId;
		nextId++;
		this.bname=bname;
		this.price=price;
		this.racknumber=racknumber;
		this.copy=copy;
	}
	
	public Library(Library l)//copy constructor
	{
		this.id=l.id;
		this.bname=l.bname;
		this.price=l.price;
		this.racknumber=l.racknumber;
		this.copy=l.copy;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname =bname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getRacknumber() {
		return racknumber;
	}
	public void setRacknumber(Integer racknumber) {
		this.racknumber = racknumber;}
	public Integer getCopy() {
	    return copy;
	}

	public void setCopy(Integer copy) {
	    this.copy = copy;
	}
	public String toString()
	{ 
		return String.format("%-10d%-20s%-20.2f%-10d%-10d", id,bname,price,racknumber,copy);
	}
	
}

