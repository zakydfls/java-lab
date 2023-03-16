package week2;

public class AksiSepeda { 
    public static void main(String[] args) { 
     //membuat objek
     Sepeda sepedaBalap = new Sepeda(2,"Sepeda Balap","Tesla"); 
     Sepeda sepedaGunung = new Sepeda(2, "Sepeda Gunung", "ABC");
     Sepeda sepedaBayi = new Sepeda(3, "Sepeda Bayi", "Cosmos");
     //mengakses atribut dan method
     int gearSepedaBalap = sepedaBalap.gear;
     int gearSepedaGunung = sepedaGunung.gear + 3; 
     int gearSepedaBayi = sepedaBayi.gear - 1;
     System.out.println("Gear sepeda balap = " + gearSepedaBalap); 
     System.out.println("Gear sepeda gunung = " + gearSepedaGunung);
     System.out.println("Gear sepeda bayi = " + gearSepedaBayi);
     sepedaBalap.ngerem(); 
     } 
    }
