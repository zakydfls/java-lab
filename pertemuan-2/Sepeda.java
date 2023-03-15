public class Sepeda { 
    //ini adalah tempat atribut
    int gear = 5;
    int roda;
    String jenisSepeda;
    String merkSepeda; 
     
    Sepeda(int jumlahRoda, String jenis, String merk){ 
        roda = jumlahRoda;
        jenisSepeda = jenis;
        merkSepeda = merk;
        System.out.println("Sepeda: "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda); 
        }
       
    //ini adalah tempat method
    void ngerem() { 
     System.out.println("Sepeda direm"); 
     } 
    }