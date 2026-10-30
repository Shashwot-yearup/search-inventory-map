package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<Integer, Product> product = new HashMap<>();

    //method to load the inventory.
    public void loadInventory() {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("inventory.csv"))) { //try catch block to read the file.

            String line;

            while ((line = reader.readLine()) != null){ //while loop to do through each line until its empty.

                String[] data = line.split("\\|");//splits by the pipes.

                //parse the data into its correct data type.
                int productId = Integer.parseInt(data[0].trim());
                String productName = data[1].trim();
                double productPrice = Double.parseDouble(data[2].trim());

                Product products = new Product(productId, productName, productPrice);//creats a new product.

                product.put(productId, products);

            }

        } catch (Exception e) {
            System.out.println("Product not found!" + e.getMessage());
        }
    }
}
