import java.util.Scanner;

public class StrukturKendali {
    char nHuruf;
    String predikat;
    double nilaiTugas, nilaiUTS, nilaiUAS;
    String nim, nama;

    char getNilHuruf(double nilai) 
    { 
    if(nilai>=85) 
        nHuruf='A'; 
    else if(nilai>=70 && nilai<85) 
        nHuruf='B'; 
    else if(nilai>=60 && nilai<70) 
        nHuruf='C'; 
    else if(nilai>=40 && nilai<60) 
        nHuruf='D'; 
    else 
        nHuruf='E'; 
    return nHuruf; 
    } 
    String getPredikat(char huruf){
    switch(huruf) 
    { 
    case 'A':predikat="Apik"; 
    break; 
    case 'B':predikat="Baik"; 
    break; 
    case 'C':predikat="Cukup"; 
    break; 
    case 'D':predikat="Dablek"; 
    break; 
    default:predikat="Elek"; 
    } 
    return predikat; 
    } 
    void inputData(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Nama        : ");
        nama = inp.nextLine();
        System.out.print("NIM         : ");
        nim = inp.nextLine();
        System.out.print("Nilai Tugas : ");
        nilaiTugas = inp.nextDouble();
        System.out.print("Nilai UTS   : ");
        nilaiUTS = inp.nextDouble();
        System.out.print("Nilai UAS   : ");
        nilaiUAS = inp.nextDouble();
        inp.close();
    }
    void cetakData(){
        double nilaiAkhir = nilaiTugas*0.2+nilaiUTS*0.35+nilaiUAS*0.45;
        System.out.println("Nama            : "+nama);
        System.out.println("NIM             : "+nim);
        System.out.println("Nilai Tugas     : "+nilaiTugas+" 20%    : "+nilaiTugas*0.2);
        System.out.println("Nilai UTS       : "+nilaiUTS+" 35%    : "+nilaiUTS*0.35);
        System.out.println("Nilai UAS       : "+nilaiUAS+" 45%    : "+nilaiUAS*0.45);
        System.out.println("Nilai Akhir     : "+(nilaiTugas*0.2+nilaiUTS*0.35+nilaiUAS*0.45));
        System.out.println("Nilai huruf     : "+getNilHuruf(nilaiAkhir));
        System.out.println("Predikat        : "+getPredikat(nHuruf));
    }
}
