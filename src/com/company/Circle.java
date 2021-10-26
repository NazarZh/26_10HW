package com.company;

class Circle {
    /** It is a class that has information about a circle, also it calculates the length and the square of the circle*/
    double r;
    double length;
    double square;
    String colour;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
        this.length = 2 * Math.PI * r;
        this.square = Math.PI * Math.pow(r,2.0);
    }

    public Circle(double r, String colour) {
        this.r = r;
        this.colour = colour;
        this.length = 2 * Math.PI * r;
        this.square = Math.PI * Math.pow(r,2.0);
    }
}
