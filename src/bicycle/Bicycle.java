/*
    This file contains a Bicycle class
    name: JR Iriarte
    Date: Nov 18. 2019
    File: Bicycle.java
 */


package bicycle;

/**
 * This is a Bicycle class that has a brand,
 * year, and color
 *
 * @author: JR IRIARTE
 * @version 1.0
 */

public class Bicycle
{
    private String color;
    private double price;
    private double weight;

    /**
     * This creates a new bike with all
     * three fields set to the input
     *
     * @param color the new bike color
     * @param price the new bike price
     * @param weight the new bike weight
     */
    public Bicycle(String color, double price, double weight)
    {
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    /**
     * Creates a new Blue bike
     */

    public Bicycle()
    {
        this.color = "Blue";
        this.price = 50.00;
        this.weight = 20;
    }

    public String getColor()
    {
        return color;
    }

    public double getPrice()
    {
        return price;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }


    /**
     * Returns a string representation of the bike
     *
     * @return a string version of the bike
     */
    public String toString()
    {
        return "the bike color is: " + color + " and the costs: " + price;
    }
}
