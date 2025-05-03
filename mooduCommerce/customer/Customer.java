package com.mooduCommerce.customer;
public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println(" Customer Email: " + email);
    }
}