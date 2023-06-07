package eksepsi;

import java.io.*;

public class LoanFundsException extends Exception {
    private double amount;

    public LoanFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
