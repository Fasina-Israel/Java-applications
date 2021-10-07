package Practise;

public class Loan {

    private double annualInterestRate;
    private int numbersOfYears;
    private double loanAmount;


    public Loan(double annualInterestRate, int numbersOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numbersOfYears = numbersOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumbersOfYears() {
        return numbersOfYears;
    }

    public void setNumbersOfYears(int numbersOfYears) {
        this.numbersOfYears = numbersOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 -(1 / Math.pow(1 + monthlyInterestRate, numbersOfYears * 12)));
                return monthlyPayment;

    }
    public double getTotalPayment(){
             double totalPayment = getMonthlyPayment() * numbersOfYears * 12;
             return totalPayment;
    }
}
