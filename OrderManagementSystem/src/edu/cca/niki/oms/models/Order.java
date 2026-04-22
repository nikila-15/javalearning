package edu.cca.niki.oms.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Order {
private String id;
private String customerId;
private LocalDate orderDate;
private Map<String,CartProduct>products;
private Double totalPrice;
private Double discountPrice;
private String paymentType;
private Boolean paymentStatus;
static Integer nextId;
static {
	nextId=1001;
}
public Order()
{
	this.id="X"+nextId;
	nextId++;
	this.customerId="";
	this.orderDate=null;
	this.products=null;
	this.totalPrice=0.0;
	this.discountPrice=0.0;
	this.paymentStatus=false;
			
}
public Order( String customerId, LocalDate orderDate, Map<String,CartProduct> products, Double totalPrice,
		Double discountPrice, String paymentType, Boolean paymentStatus) {
	this.id="X"+nextId;
	nextId++;
	this.customerId = customerId;
	this.orderDate = orderDate;
	this.products = products;
	this.totalPrice = totalPrice;
	this.discountPrice = discountPrice;
	this.paymentType = paymentType;
	this.paymentStatus = paymentStatus;
}
public Order(String id, String customerId, LocalDate orderDate, Map<String,CartProduct> products, Double totalPrice,
		Double discountPrice, String paymentType, Boolean paymentStatus) {
	super();
	this.id = id;
	this.customerId = customerId;
	this.orderDate = orderDate;
	this.products = products;
	this.totalPrice = totalPrice;
	this.discountPrice = discountPrice;
	this.paymentType = paymentType;
	this.paymentStatus = paymentStatus;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public Map<String,CartProduct> getProducts() {
	return products;
}
public void setProducts(Map<String,CartProduct> products) {
	this.products = products;
}
public Double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(Double totalPrice) {
	this.totalPrice = totalPrice;
}
public Double getDiscountPrice() {
	return discountPrice;
}
public void setDiscountPrice(Double discountPrice) {
	this.discountPrice = discountPrice;
}
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}
public Boolean getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(Boolean paymentStatus) {
	this.paymentStatus = paymentStatus;
}
@Override
public String toString() {
	return String.format("%-10s%-15s%-20tF%-20.2f%-20.2f%-15s%-15s\n", this.id,this.customerId,this.orderDate,this.totalPrice,this.discountPrice,this.paymentType,this.paymentStatus);
	
}


}
