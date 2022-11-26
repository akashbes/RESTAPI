package com.inventory.inventorymanagement.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.inventorymanagement.model.Inventory;
import com.inventory.inventorymanagement.service.InventoryService;

@RestController("/api")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@RequestMapping(value = "/inventory", method = RequestMethod.POST)
	public Inventory createInventory(@RequestBody Inventory inv) {
		return inventoryService.createItem(inv);
	}
	
	@RequestMapping(value = "/inventory/{id}", method = RequestMethod.PUT)
	public Inventory updateStatus(@PathVariable(value = "id") Long id, @RequestBody Inventory inventoryDetails) {
		
		return inventoryService.updateInventory(id, inventoryDetails);
	}
	
	@RequestMapping(value = "/inventories", method = RequestMethod.GET)
	public List<Inventory> getInventoryDetails() {
		return inventoryService.getInventoryDetails();
	}
	
	@RequestMapping(value = "/inventory/{id}", method = RequestMethod.DELETE)
	public void removeItem(@PathVariable(value = "id") Long id) {
		inventoryService.removeItem(id);
	}
	
	@RequestMapping(value = "/inventory/{id}", method = RequestMethod.GET)
	public int getStock(@PathVariable(value = "id") Long id) {
		return inventoryService.getStock(id);
	}
	

}
