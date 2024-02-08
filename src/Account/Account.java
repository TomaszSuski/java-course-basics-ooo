package Account;

import java.util.Scanner;

public class Account {

    private double ballance;

    public Account(double ballance) {
        this.ballance = ballance;
    }

    public void deposit(double amount) {
        this.ballance += amount;
    }

    public void withdraw(double amount) {
        if (this.ballance >= amount) {
            this.ballance -= amount;
        } else {
            System.out.println("Zbyt mało środków, wprowadź niższą kwotę");
            System.out.println("Dostępne środki: " + this.ballance);
        }
    }

    public double getBallance() {
        return this.ballance;
    }
}


