package com.nit.model;

import java.util.Date;

public class Payment {
private String prodName;
private int qunatity;
private double cost;
private Date date;
public Payment() {
	super();
}

public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public int getQunatity() {
	return qunatity;
}
public void setQunatity(int qunatity) {
	this.qunatity = qunatity;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
