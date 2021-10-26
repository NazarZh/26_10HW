package com.company;

public class Main {

    public static void main(String[] args) {
	Circle crl = new Circle(2,"green");
        System.out.printf("%s circle is %fcm length and its square is %fcm^2\n",crl.colour,crl.length,crl.square);
    }
}
