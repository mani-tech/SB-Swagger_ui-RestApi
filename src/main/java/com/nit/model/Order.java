package com.nit.model;

public class Order {
	
private int oid;
private String prodName;
private int quantity;
private String date;
private String deliveryDate;
public Order() {
	super();
}
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}

public String getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(String deliveryDate) {
	this.deliveryDate = deliveryDate;
}
@Override
public String toString() {
	return "Order [oid=" + oid + ", prodName=" + prodName + ", quantity=" + quantity + ", date=" + date + "]";
} 

}
