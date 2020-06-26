package com.Vlad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank();

    public static void main(String[] args) {
        System.out.println("Welcome to the program");
        printMenu();
        while (optionInput()) {

        }

    }

    public static void printMenu() {
        System.out.println("Bank options menu:");
        System.out.println("press:\n0 - Exit\n1 - List branches\n 2 - Add branch\n" +
                "3 - List branch customers\n" +
                "4 - Add new customer\n5 - Find a customer\n6 - Add transaction\n7 - List customer transactions");
    }

    public static boolean optionInput() {
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();
        switch (opt) {
            case 0: {
                System.out.println("Good bye");
                return false;
            }
            case 1: {
                bank.printBranches();
                return true;
            }
            case 2: {
                bank.addBranch();
                return true;
            }
            case 3: {
                System.out.println("Enter branch number");
                int x = bank.findBranch(scanner.nextInt());
                bank.getBranch(x).printCustomers();
                return true;
            }
            case 4: {
                System.out.println("Enter branch number");
                int x = bank.findBranch(scanner.nextInt());
                bank.getBranch(x).addCustomer();
                return true;
            }
            case 5: {
                System.out.println("Enter branch number");
                int x = bank.findBranch(scanner.nextInt());
                bank.getBranch(x).findByName();
                bank.getBranch(x).
            }
        }


    }

}
