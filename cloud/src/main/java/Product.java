package com.example.cloud;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@SuppressWarnings("unused")
@Entity
public class Product {
 
    @Id
    private Long id;
 
    private String name;
    private String category;
    private double price;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getResultList() {
		String list;
		return name;
	}
	public void setParameter() {
		return;
	}
	
	
 
    
}