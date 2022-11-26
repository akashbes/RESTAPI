package com.inventory.inventorymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.inventorymanagement.model.Inventory;
import com.inventory.inventorymanagement.repo.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	public Inventory createItem(Inventory inv) {
		return inventoryRepository.save(inv);
	}

	public Inventory updateInventory(Long id, Inventory inventoryDetails) {
		Inventory inv = inventoryRepository.findById(id).get();
		inv.setStatus(inventoryDetails.getStatus());
		return inventoryRepository.save(inv);
	}

	public List<Inventory> getInventoryDetails() {
		return inventoryRepository.findAll();
	}

	public void removeItem(Long id) {
		inventoryRepository.deleteById(id);
	}

	public int getStock(Long id) {
		Inventory inv = inventoryRepository.findById(id).get();
		return inv.getQuantity();	
	}
	
	
	

}
