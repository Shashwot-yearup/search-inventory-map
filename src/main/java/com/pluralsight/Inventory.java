package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<Integer, Product> product = new HashMap<>();

    public void loadInventory() {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("inventory.csv"))) {

        } catch (Exception e) {
            System.out.println("Product not found!" + e.getMessage());
        }
    }
}
