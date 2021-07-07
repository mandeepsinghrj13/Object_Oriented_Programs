package com.bridgelabz;
public interface InventoryMenagementService 
{
	public abstract void addInventoryItem(Items item);
	public abstract void getInventoryDetails();
	public abstract void getInventoryDetailsByName(String itemName); 
	public abstract void calculateInventoryItemValue();
}
