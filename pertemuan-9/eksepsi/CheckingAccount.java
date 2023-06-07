package eksepsi;

import java.io.*;

public class CheckingAccount {
    private double saldo;
    private int rekening;
    private double loan = 200000;

    public CheckingAccount(int rekening) {
        this.rekening = rekening;
    }

    public void simpanUang(double jumlahsetor) {
        saldo += jumlahsetor;
    }

    // public void setHutang(double loan) {
    // this.loan = loan;
    // }

    public void bayarHutang() throws LoanFundsException {
        if (loan <= saldo) {
            saldo -= loan;
        } else {
            throw new LoanFundsException(loan);
        }
    }

    public void tarikUang(double jumlahtarik) throws InsufficientFundsException {
        if (jumlahtarik <= saldo) {
            saldo -= jumlahtarik;
        } else {
            double kebutuhan = jumlahtarik - saldo;
            throw new InsufficientFundsException(kebutuhan);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAngka() {
        return rekening;
    }
}