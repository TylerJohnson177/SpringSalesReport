package edu.wctc;

public class Sale
{
    private String name;
    private String country;
    private double cost;
    private double tax;
    private double shippingCost;


    public Sale(String name, String country, double cost, double tax, double shippingCost)
    {
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.tax = tax;
        this.shippingCost = shippingCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setShippingCost(double shippingCost)
    {
        this.shippingCost = shippingCost;
    }

    public double getShippingCost()
    {
        return shippingCost;
    }

}
