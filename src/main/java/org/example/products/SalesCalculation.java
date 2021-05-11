package org.example.products;

import java.util.List;

public interface SalesCalculation {

    String REPORT_HEADER = "Report for sales item: ";

    String getName();
    double calcSalesPrice();
    double calcCost();

    static void printReports(List<SalesCalculation> items){
        for(SalesCalculation item : items){
            System.out.println(item.getReport());
        }
    }

    default double calcProfit(){
        return calcSalesPrice() - calcCost();
    }

    default String getReport(){
        return REPORT_HEADER + this.getName() + "\n" + "Total cost: " + this.calcCost() + "\n" +
                "Total sales price: " + this.calcSalesPrice() + "\n" +
                "Profit: " + this.calcProfit() + "\n";
    }




}
