package com.Foxy.FoxyBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {
	@Id
	@GeneratedValue
int SuppId;
String SuppName,Address;
public int getSuppId() {
	return SuppId;
}
public void setSuppId(int suppId) {
	SuppId = suppId;
}
public String getSuppName() {
	return SuppName;
}
public void setSuppName(String suppName) {
	SuppName = suppName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

}
