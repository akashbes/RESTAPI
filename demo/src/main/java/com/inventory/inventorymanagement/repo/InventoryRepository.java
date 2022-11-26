package com.inventory.inventorymanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.inventorymanagement.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
