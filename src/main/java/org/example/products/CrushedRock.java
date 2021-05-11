package org.example.products;

public class CrushedRock implements SalesCalculation {

    private final String name;
    private final double salesPrice;
    private final double cost;
    private final double weight;

    public CrushedRock(String name, double salesPrice, double cost, double weight) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcSalesPrice() {
        return salesPrice * weight;
    }

    @Override
    public double calcCost() {
        return cost * weight;
    }
}
