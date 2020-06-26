package com.Vlad;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = scanner.nextLine();
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double dbl) {
        transactions.add(dbl);
    }

    public void printTransactions() {
        System.out.println(name + "'s transactions:");
        System.out.println(transactions.toString());
    }

    public void setNewName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new name:");
        this.name = scanner.nextLine();
    }


}
