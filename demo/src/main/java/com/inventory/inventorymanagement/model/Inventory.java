package com.inventory.inventorymanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int quantity;
	private long cost;
	private String category;
	private String status;
	
	
	
	public Inventory() {
		
	}

	public Inventory(long id, String name, int quantity, long cost, String category) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.category = category;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public long getCost() {
		return cost;
	}

	public String getStatus() {
		return status;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", quantity=" + quantity + ", cost=" + cost + ", category="
				+ category + "]";
	}
	
	
	
	
}
