package edu.cca.niki.oms.models;

public class CartProduct {
 private String id;
 private String name;
 private double price;
 private Integer quantity;
 static Integer nextId;
 static {
	 nextId=2001;
 }
 
 public CartProduct() {
	this.id="CP"+nextId;
	nextId++;
	this.name="";
	this.price=0.0;
	this.quantity=0;
	// TODO Auto-generated constructor stub
 }
 public CartProduct(String id, String name, double price, Integer quantity) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
 }
 
 public CartProduct(String name, double price, Integer quantity) {
	 this.id="CP"+nextId;
		nextId++;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
 public String getId() {
	return id;
 }
 public void setId(String id) {
	this.id = id;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public double getPrice() {
	return price;
 }
 public void setPrice(double price) {
	this.price = price;
 }
 public Integer getQuantity() {
	return quantity;
 }
 public void setQuantity(Integer quantity) {
	this.quantity = quantity;
 }
 @Override
 public String toString() {

		return String.format("%-10s%-20s%-20.2f%-20d", id,name,price,quantity);
 }
 
}
