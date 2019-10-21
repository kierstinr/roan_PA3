public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public void setInitialBalance(double initSavings) {
        savingsBalance = initSavings;
    }

    public double calculateMonthlyInterest() {
        annualInterestRate = 0.04;
        double base = (savingsBalance * annualInterestRate) / 12;
        double total = base + savingsBalance;
        savingsBalance+= base;
        return total;
    }

    public double modifyInterestRate() {
        annualInterestRate = 0.05;
        double base = (savingsBalance * annualInterestRate) / 12;
        double total = base + savingsBalance;
        return total;
    }
}
