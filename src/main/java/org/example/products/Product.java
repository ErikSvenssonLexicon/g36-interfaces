package org.example.products;

public class Product implements SalesCalculation{
    private String productName;
    private double sellPrice;
    private double buyPrice;
    private int amount;

    public Product(String productName, double sellPrice, double buyPrice, int amount) {
        this.productName = productName;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public double calcSalesPrice() {
        return sellPrice * amount;
    }

    @Override
    public double calcCost() {
        return buyPrice * amount;
    }

    @Override
    public double calcProfit() {
        return calcSalesPrice() - calcCost();
    }
}
