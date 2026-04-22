package edu.cca.niki.oms.blueprint;

import java.util.ArrayList;

import edu.cca.niki.oms.models.Order;

public interface OrderCRUD {
String create(Order order);
ArrayList<Order>readAll();
String update(Order product);
String delete(String id);
Order readOne(String id);
}
