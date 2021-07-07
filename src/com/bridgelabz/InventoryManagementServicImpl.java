package com.bridgelabz;
import java.util.Iterator;
import java.util.LinkedList;
public class InventoryManagementServicImpl implements InventoryMenagementService 
{
	LinkedList<Items> itemList = new LinkedList<Items>();
	@Override
	public void addInventoryItem(Items item) 
	{
		if(itemList.contains(item))
		{ 
			System.out.println("inventory items exists");
		}
		else
		{
			itemList.add(item);
		}
			
	}
	@Override
	public void getInventoryDetails() 
	{
		for(Items item: itemList)
		{
			System.out.println(item);
		}
	}
	@Override
	public void getInventoryDetailsByName(String itemName) 
	{
		for(Items item: itemList) 
		{
			if( item.getItemName().equals(itemName))
			{
				System.out.println(item);
				break;
			}
		}
	}
	@Override
	public void calculateInventoryItemValue() 
	{
		for(Items item: itemList) 
		{
			double itemValue = item.getItemWeight()*item.getItemPricePerKg();
			System.out.println("value of inventory "+item.getItemName()+" is: "+ itemValue);
		}
	}	
	
}
