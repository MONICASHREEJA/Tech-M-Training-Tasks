class Customer {
    private int balance = 10000;


    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " going to withdraw Rs. " + amount);

        while (balance < amount) {
            System.out.println("Insufficient balance! Balance = Rs. " + balance + "\nWaiting for deposit...\n");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Withdrawal interrupted: " + e.getMessage());
                return;
            }
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew Rs. " + amount);
        System.out.println("Remaining Balance: Rs. " + balance + "\n");
    }


    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " going to deposit Rs. " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited Rs. " + amount);
        System.out.println("Updated Balance: Rs. " + balance + "\n");
        notify();
    }
}


class WithdrawThread extends Thread {
    private final Customer customer;
    private final int amount;

    public WithdrawThread(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void run() {
        customer.withdraw(amount);
    }
}


class DepositThread extends Thread {
    private final Customer customer;
    private final int amount;

    public DepositThread(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void run() {
        customer.deposit(amount);
    }
}


public class BankSystem {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Thread withdrawThread1 = new WithdrawThread(customer, 20000);
        Thread depositThread1 = new DepositThread(customer, 15000);
        Thread withdrawThread2 = new WithdrawThread(customer, 5000);
        Thread depositThread2 = new DepositThread(customer, 10000);

        
        withdrawThread1.start();
        depositThread1.start();
        withdrawThread2.start();
        depositThread2.start();
    }
}
