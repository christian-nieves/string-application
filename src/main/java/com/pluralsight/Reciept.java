package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String apple = "Apple";
        double applePrice = 2.99;
        int quantity = 3;
        double totalPrice = quantity * applePrice;

        System.out.println("You bought " + quantity + " " + apple + "s " + "for " + "$" + totalPrice + ".");
    }
}
