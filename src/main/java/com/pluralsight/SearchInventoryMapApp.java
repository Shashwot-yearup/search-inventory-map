package com.pluralsight;

import java.util.Scanner;

public class SearchInventoryMapApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); //creates new invetory object

        inventory.loadInventory(); //loads the inventory

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();

        Product product = inventory.searchProduct(id); //search the product the user entered.

        //if check to check if product in there or not.
        if(product != null)
            System.out.println(product);
        else{
            System.out.println("product not found");
        }

        scanner.close();//close the scanner.
    }
}
