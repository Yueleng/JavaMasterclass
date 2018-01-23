package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    // method
    public boolean addBranch(String branchName) {
        if (findBranch(branchName ) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public  boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            return currentBranch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            return currentBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++){
            Branch currentBranch = branches.get(i);  // avoid running two time branches.get(i)
            if (branchName.equals(currentBranch.getName())) {
                return currentBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            System.out.println("Branch not found");
        }

        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j ++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j) );
                    }
                }
            }
            return true;
        }
        return false;
    }
}
