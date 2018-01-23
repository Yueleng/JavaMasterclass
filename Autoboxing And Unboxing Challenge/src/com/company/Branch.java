package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    //getter
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    // Constructor
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    // method
    public boolean newCustormer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++){
            Customer currentCustomer = customers.get(i);  // avoid running two time customers.get(i)
            if (customerName.equals(currentCustomer.getName())) {
                return currentCustomer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
}

