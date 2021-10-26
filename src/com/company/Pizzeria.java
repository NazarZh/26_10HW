package com.company;

public class Pizzeria {
    /**It is a class that shows an information about an array. This class uses information from Pizza class*/
    public static void main(String[] args) {

        Pizza pz1= new Pizza(15.0,"peppers, chicken, sauce, cabbages,tomatoes","Chicken",2);
        Pizza[] pizzas = {pz1, new Pizza(30.0, "cheese, meat, tomatoes","MoreMeat", 4)};
        for (int i = 0; i < pizzas.length; i++) {
            System.out.printf("%.2fcm in radius, \"%s\" pizza consists of %s and costs %.2f dollars\n",pizzas[i].basis.r,pizzas[i].name,pizzas[i].composition,pizzas[i].cost);
        }
    }
}


