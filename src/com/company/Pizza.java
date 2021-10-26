package com.company;

public class Pizza extends Circle{
    /**It is a simple class that initialize information about pizza using information from Circle class.
     * This class extends Circle class*/
    Circle basis;// = new Circle();
    String composition;
    String name;
    double cost;

    public Pizza(double r, String composition, String name, double cost) {
        //super(r);
        //this.r = r;
        this.basis = new Circle(r);
        this.composition = composition;
        this.name = name;
        this.cost = cost;


    }
}
