package org.example.products;

public class Liquid implements SalesCalculation {
    private String liquidType;
    private double salesPrice;
    private double liters;
    private double cost;

    public Liquid(String liquidType, double salesPrice, double liters, double cost) {
        this.liquidType = liquidType;
        this.salesPrice = salesPrice;
        this.liters = liters;
        this.cost = cost;
    }


    @Override
    public String getName() {
        return liquidType;
    }

    @Override
    public double calcSalesPrice() {
        return salesPrice * liters;
    }

    @Override
    public double calcCost() {
        return cost * liters;
    }

    @Override
    public double calcProfit() {
        return calcSalesPrice() - calcCost();
    }
}
