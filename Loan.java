/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchez;

/**
 *
 * @author arnol
 */
//Loan—A public abstract class that implements the LoanConstants interface. A Loan
//includes a loan number, customer last name, amount of loan, interest rate, and term. The
//constructor requires data for each of the fields except interest rate. Do not allow loan
//amounts greater than R100, 000. Force any loan term that is not one of the three defined
//in the LoanConstants class to a short- term, 1-year loan. Create a toString() method that
//displays all the loan data. Loan.java

public abstract class Loan implements LoanConstants{
    public int loanNumber;
    public String lastName;
    public int loanAmount;
    public int interestRate;
    public int term;
    public int PrimeIntRate
    
    public Loan{
        public int getLoanNumber() { return loanNumber; }
        public void setLoanNumber(int n) { loanNumber = n; }

        public String getLastName() { return lastName; }
        public void setLastName(String s) { lastName = s; }

        public int getLoanAmount() { return loanAmount; }
        public void setLoanAmount(int n) {
            n = loanAmount; 
            if (loanAmount > MaxLoanAmount)
                loanAmount = MaxLoanAmount;
            }

        public int getTerm() { return term; }
        public void setTerm(int n) { 
        // n = term; 
        if (n == 1) {
            term = Short_Term;
        } 
        else if (n == 3) {
            term = Medium_Term;
        } 
        else if (n == 5) {
            term = Long_Term;
        } 
        else {
            term = Short_Term;
        }
        
        public int getInterestRate() {return interestRate;}
        public void setInterestRate(int i) { interestRate = i; }

        public void toString() {
        System.out.println("Company Name: " + Company_Name);
        System.out.println("Loan Number: " + loanNumber);
        System.out.println("Last Name: " + lastName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Term on account: " + term);
    }
}    
    


    



