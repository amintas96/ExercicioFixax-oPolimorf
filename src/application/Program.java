/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.print("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (typeProduct == 'i') {
                System.out.print("Customs fee:");
                double coustomsFee = sc.nextDouble();
                list.add(new ImportedProduct(coustomsFee, name, price));
            } else if (typeProduct == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY):");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(date, name, price));
            } else {
                list.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product c : list) {

            System.out.println(c.priceTag());
        }

    }

}
