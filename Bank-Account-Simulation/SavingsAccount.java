public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, String accountNumber, double interestRate) {
        super(accountHolder, accountNumber);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
}
