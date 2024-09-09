import java.util.*;
class ATM {
    private double balance = 1000.0;
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    } 
    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("ATM Menu");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 2:
                    System.out.print("enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalud choice. Please try again.");
            } 
        } while (choice != 4);
        scanner.close();
    }
}