// package csc320-assignment3;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
    int income;
    double taxRate;
    double taxWithholding;

    income = 0;
    taxRate = 0.0;
    taxWithholding = 0.0;
    
    System.out.print("Enter weekly income: ");

    Scanner scnr = new Scanner(System.in);

    income = scnr.nextInt();
    scnr.close();

    if(income < 500){
        taxRate = .1;
    }
    else if(income < 1500){
        taxRate = .15;
    }
    else if(income < 2500){
        taxRate = .2;
    }
    else{
        taxRate = .3;
    }
        

    taxWithholding = income * taxRate;

    System.out.print("Your weekly tax withholding: " + taxWithholding);


}
}
