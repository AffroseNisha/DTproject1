package com.Foxy.FoxyBackend.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue
	int proid;
		int catid,suppid,quantity,price;
		String proname,prodesc;
		
	@Transient
	MultipartFile pimage;


	public int getProid() {
		return proid;
	}


	public void setProid(int proid) {
		this.proid = proid;
	}


	public int getCatid() {
		return catid;
	}


	public void setCatid(int catid) {
		this.catid = catid;
	}


	public int getSuppid() {
		return suppid;
	}


	public void setSuppid(int suppid) {
		this.suppid = suppid;
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


	public String getProname() {
		return proname;
	}


	public void setProname(String proname) {
		this.proname = proname;
	}


	public String getProdesc() {
		return prodesc;
	}


	public void setProdesc(String prodesc) {
		this.prodesc = prodesc;
	}


	public MultipartFile getPimage() {
		return pimage;
	}


	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}
	
}