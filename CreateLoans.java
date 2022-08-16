/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez;

/**
 *
 * @author arnol
 */

//CreateLoans—An application that creates an array of five Loans. Prompt the user for the
//current prime interest rate. Then, in a loop, prompt the user for a loan type and all relevant
//information for that loan. Store the created Loan objects in the array. CreateLoans.java.

import java.util.Scanner;

public class CreateLoans {

    public void main(String[] args) {
        int x = 0;
        int PrimeIntRate;
        String type;
        Scanner input = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        System.out.println("Enter current prime interest rate");
        PrimeIntRate = input.nextInt();
        PrimeIntRate = PrimeIntRate/100;
        input.nextLine();

        for(x = 0; x < 6; ++x) {
            System.out.println("Enter Loan Type: ");
            type = input.nextLine();
            if ("Business") {
                System.out.println("Account/Loan Number? ");
                int ln = input.nextInt();
                System.out.println("Last Name on Account? ");
                String last = input.nextLine();
                input.nextLine();
                System.out.println("Loan Amount: ");
                int la = input.nextInt();
                System.out.println("Term on Account? ");
                int term = input.nextInt();
                loans[x] = new BusinessLoan();
                System.out.println("Company Name: " + Loan.Company_Name);
                System.out.println("Loan Number: " + loans[x].getLoanNumber());
                System.out.println("Last Name: " + loans[x].getLastName());
                System.out.println("Loan Amount: " + loans[x].getLoanAmount());
                System.out.println("Interest Rate: " + loans[x].getInterestRate());
                System.out.println("Term on account: " + loans[x].getTerm());
            }
            else if ("Personal") {
               System.out.println("Account/Loan Number? ");
                int ln = input.nextInt();
                System.out.println("Last Name on Account? ");
                String last = input.nextLine();
                input.nextLine();
                System.out.println("Loan Amount: ");
                int la = input.nextInt();
                System.out.println("Term on Account? ");
                int term = input.nextInt();
                loans[x] = new PersonalLoan();
                System.out.println("Company Name: " + Loan.Company_Name);
                System.out.println("Loan Number: " + loans[x].getLoanNumber());
                System.out.println("Last Name: " + loans[x].getLastName());
                System.out.println("Loan Amount: " + loans[x].getLoanAmount());
                System.out.println("Interest Rate: " + loans[x].getInterestRate());
                System.out.println("Term on account: " + loans[x].getTerm());
            } 
            else {
                System.out.println("Try again.");
                System.exit(0);
            }
        }
    }
}