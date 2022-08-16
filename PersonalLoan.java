/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez;

/**
 *
 * @author arnol
 */
//PersonalLoan—A public class that extends Loan. The PersonalLoan constructor sets the
//interest rate to 2% more than the current prime interest rate. PersonalLoan.java

public class PersonalLoan extends Loan{

    public PersonalLoan() {
        setLoanNumber(loanNumber);
        setLastName(lastName);
        setLoanAmount(loanAmount);
        setTerm(term);
        setinterestRate(interestRate) = (PrimeIntRate * 0.02) + PrimeIntRate;
        setInterestRate(interestRate);
    }
}
