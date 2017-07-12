package com.Foxy.FoxyBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart {
@Id
@GeneratedValue
int citemid;
int cartid,proid,quantity,price;
String username,proname,status;
public int getCitemid() {
	return citemid;
}
public void setCitemid(int citemid) {
	this.citemid = citemid;
}
public int getCartid() {
	return cartid;
}
public void setCartid(int cartid) {
	this.cartid = cartid;
}
public int getProid() {
	return proid;
}
public void setProid(int proid) {
	this.proid = proid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getProname() {
	return proname;
}
public void setProname(String proname) {
	this.proname = proname;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
