package com.Vlad;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Branch number:");
        int newBranchNumber = scanner.nextInt();
        if (checkBranch()) {
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
            } else {
                return -1;
            }
        }
    }

    public boolean checkBranch(Branch branch) {
        return (findBranch(branch) >= 0);
    }

    public void printBranches() {
        for (int i = 0; i < branches.size(); i++) {
            System.out.println("Branch #"+ branches.get(i).getBranchNumber());
        }
    }

    public Branch getBranch(int x) {
        return branches.get(x);
    }

}
