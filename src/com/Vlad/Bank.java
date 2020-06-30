package com.Vlad;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Branch number:");
        int newBranchNumber = scanner.nextInt();
        if (checkBranch(newBranchNumber)) {
            Branch branch = new Branch(newBranchNumber);
            this.branches.add(branch);
            System.out.println("New Branch #" + newBranchNumber + " added");
        } else {
            System.out.println("Branch #" + newBranchNumber + " already exists in records");
        }
    }

    public int findBranch(int x) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branchCheck = new Branch(i);
            if (branchCheck.getBranchNumber() == x) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkBranch(int i) {
        return (findBranch(i) >= 0);
    }

    public void printBranches() {
        for (Branch branch : branches) {
            System.out.println("Branch #" + branch.getBranchNumber());
        }
    }

    public Branch getBranch(int x) {
        return branches.get(x);
    }

}
