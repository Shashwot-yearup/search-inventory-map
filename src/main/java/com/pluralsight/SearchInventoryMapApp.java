package com.pluralsight;

import java.util.Scanner;

public class SearchInventoryMapApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); //creates new invetory object

        inventory.loadInventory();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();


    }
}
