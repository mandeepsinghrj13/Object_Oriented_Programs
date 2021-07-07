package com.bridgelabz;
import java.util.Scanner;
public class InventryManagementMain 
{
	public static void main(String[] args) 
	{
		InventoryMenagementService inventoryService = new InventoryManagementServicImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("welcome to inventroy management");
		System.out.println("how many item you want to added : ");
		
		int numOfItems = scanner.nextInt();
		
		for(int index = 0; index < numOfItems; index++)
		{
			 Items newItem = new Items();
			 System.out.println("enter item name: ");
			 newItem.setItemName(scanner.next());
			 System.out.println("enter item weight: ");
			 newItem.setItemWeight(scanner.nextDouble());
			 System.out.println("enter item PricePerKg: ");
			 newItem.setItemPricePerKg(scanner.nextDouble());
			 inventoryService.addInventoryItem(newItem);
		}
		inventoryService.getInventoryDetails();		
		System.out.println("enter name you found");
		String ItemName = scanner.next();
		
		inventoryService.getInventoryDetailsByName(ItemName);
		inventoryService.calculateInventoryItemValue();
	}
}
