package com.company;

public class Main {

    public static void main(String[] args) {
	     Bank bank = new Bank("TD Bank");

	     bank.addBranch("Wyndotte");
	     bank.addCustomer("Wyndotte", "Alan", 100.02);
	     bank.addCustomer("Wyndotte", "Mike", 30.40);
	     bank.addCustomer("Wyndotte", "Percy", 220.12);

	     bank.addBranch("Markham");
	     bank.addCustomer("Markham", "Bob", 32.45);

	     bank.addCustomerTransaction("Wyndotte", "Alan", 44.22);
	     bank.addCustomerTransaction("Wyndotte", "Mike", -30.22);
	     bank.addCustomerTransaction("Wyndotte", "Percy", -2.22);

	     bank.listCustomers("Wyndotte", true);
	     bank.listCustomers("Markham", true);


	     if (!bank.addCustomer("North York", "Peter", 122)) {
             System.out.println("North York branch not exist or Peter already exist" );
         }

         if (!bank.addBranch("Wyndotte")) {
             System.out.println("Wyndotte branch already exists");
         }

         if (!bank.addCustomerTransaction("Wyndotte", "Nancy", 10000.34)) {
             System.out.println("Nancy does not exist at branch Wyndotte");
         }

         if (!bank.addCustomer("Wyndotte", "Mike", 12.21)) {
             System.out.println("Mike already exists");
         }

    }
}
