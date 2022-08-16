/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez;

/**
 *
 * @author arnol
 */

//BusinessLoan—A public class that extends Loan. The BusinessLoan constructor sets
//the interest rate to 1% more than the current prime interest rate. BusinessLoan.java

public class BusinessLoan extends Loan{

    public BusinessLoan() {
        setLoanNumber(loanNumber);
        setLastName(lastName);
        setLoanAmount(loanAmount);
        setTerm(term);
        setinterestRate(interestRate) = (PrimeIntRate * 0.01) + PrimeIntRate;
        setInterestRate(interestRate);
    }

}