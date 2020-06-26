package com.Vlad;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    private int branchNumber;
    private ArrayList<Customer> branchCustomers;


    public Branch(int branchNumber) {
        this.branchNumber = branchNumber;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setNewBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public int findCustomer(Customer customer) {
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer custCheck = branchCustomers.get(i);
            if (custCheck.getName().equals(customer.getName())) {
                return i;
            }
        }
        return -1;
    }

    public int findByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name");
        String name = scanner.nextLine();
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer custCheck = branchCustomers.get(i);
            if (custCheck.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkCustomer(Customer customer) {
        return (findCustomer(customer) >= 0);
    }

    public void addCustomer() {
        if (checkCustomer()) {
            Customer newCustomer = new Customer();
            this.branchCustomers.add(newCustomer);
            newCustomer.addTransaction(0.00);
            System.out.println("New customer " + newCustomer.getName());
        } else {
            System.out.println("Customer already listed");
        }
    }

    public void printCustomers() {
        System.out.println(branchCustomers.toString());
    }


}
