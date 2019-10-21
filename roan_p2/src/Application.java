public class Application {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setInitialBalance(2000.00);
        saver2.setInitialBalance(3000.00);

        double month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12;
        month1 = saver1.calculateMonthlyInterest();
        month2 = saver1.calculateMonthlyInterest();
        month3 = saver1.calculateMonthlyInterest();
        month4 = saver1.calculateMonthlyInterest();
        month5 = saver1.calculateMonthlyInterest();
        month6 = saver1.calculateMonthlyInterest();
        month7 = saver1.calculateMonthlyInterest();
        month8 = saver1.calculateMonthlyInterest();
        month9 = saver1.calculateMonthlyInterest();
        month10 = saver1.calculateMonthlyInterest();
        month11 = saver1.calculateMonthlyInterest();
        month12 = saver1.calculateMonthlyInterest();

        System.out.println("Balance for month 1, savings account 1: " + month1);
        System.out.println("Balance for month 2, savings account 1: " + month2);
        System.out.println("Balance for month 3, savings account 1: " + month3);
        System.out.println("Balance for month 4, savings account 1: " + month4);
        System.out.println("Balance for month 5, savings account 1: " + month5);
        System.out.println("Balance for month 6, savings account 1: " + month6);
        System.out.println("Balance for month 7, savings account 1: " + month7);
        System.out.println("Balance for month 8, savings account 1: " + month8);
        System.out.println("Balance for month 9, savings account 1: " + month9);
        System.out.println("Balance for month 10, savings account 1: " + month10);
        System.out.println("Balance for month 11, savings account 1: " + month11);
        System.out.println("Balance for month 12, savings account 1: " + month12);

        double month21, month22, month23, month24, month25, month26, month27, month28, month29, month210, month211, month212;
        month21 = saver2.calculateMonthlyInterest();
        month22 = saver2.calculateMonthlyInterest();
        month23 = saver2.calculateMonthlyInterest();
        month24 = saver2.calculateMonthlyInterest();
        month25 = saver2.calculateMonthlyInterest();
        month26 = saver2.calculateMonthlyInterest();
        month27 = saver2.calculateMonthlyInterest();
        month28 = saver2.calculateMonthlyInterest();
        month29 = saver2.calculateMonthlyInterest();
        month210 = saver2.calculateMonthlyInterest();
        month211 = saver2.calculateMonthlyInterest();
        month212 = saver2.calculateMonthlyInterest();

        System.out.println();
        System.out.println("Balance for month 1, savings account 2: " + month21);
        System.out.println("Balance for month 2, savings account 2: " + month22);
        System.out.println("Balance for month 3, savings account 2: " + month23);
        System.out.println("Balance for month 4, savings account 2: " + month24);
        System.out.println("Balance for month 5, savings account 2: " + month25);
        System.out.println("Balance for month 6, savings account 2: " + month26);
        System.out.println("Balance for month 7, savings account 2: " + month27);
        System.out.println("Balance for month 8, savings account 2: " + month28);
        System.out.println("Balance for month 9, savings account 2: " + month29);
        System.out.println("Balance for month 10, savings account 2: " + month210);
        System.out.println("Balance for month 11, savings account 2: " + month211);
        System.out.println("Balance for month 12, savings account 2: " + month212);

        System.out.println();
        month1 = saver1.modifyInterestRate();
        month2 = saver2.modifyInterestRate();
        System.out.println("Balance for month 13, savings account 1: " + month1);
        System.out.println("Balance for month 13, savings account 2: " + month2);
    }
}
