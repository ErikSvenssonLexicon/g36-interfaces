package org.example;

import org.example.products.CrushedRock;
import org.example.products.Liquid;
import org.example.products.Product;
import org.example.products.SalesCalculation;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SalesCalculation sand = new CrushedRock("Sand", 0.25, 0.15, 100000);
        SalesCalculation petrol = new Liquid("Petrol", 15.25, 10000, 5.30);
        SalesCalculation diapers = new Product("Libero comfort 6", 111.90, 40D, 3000);

        SalesCalculation.printReports(Arrays.asList(
                sand, petrol, diapers
        ));


    }
}
