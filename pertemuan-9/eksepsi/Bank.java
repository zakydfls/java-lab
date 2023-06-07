package eksepsi;

public class Bank {

    public static void main(String[] args) throws LoanFundsException {
        // int loan = 20000;
        CheckingAccount ca = new CheckingAccount(101);
        System.out.println("Menyimpan Rp 300000");
        System.out.println("Hutang Rp 200000");
        ca.simpanUang(200000);

        try {
            System.out.println("\nTarik Uang Rp 100.000");
            ca.tarikUang(100000);
            System.out.println("Bayar hutang Rp. 200.000");
            ca.bayarHutang();
            // System.out.println("\nTarik Uang Rp 600000");
            // ca.tarikUang(600000);
        } catch (InsufficientFundsException e) {
            System.out.println(
                    "Maaf saldo yang akan Anda ambil kurang Rp " + e.getAmount() + " dari total permintaan Anda");
            e.printStackTrace();
        } catch (LoanFundsException z) {
            System.out.println(
                    "Maaf saldo anda kurang dari biaya yang dibutuhkan untuk membayar hutang sebesar " + z.getAmount());
        }

    }

}