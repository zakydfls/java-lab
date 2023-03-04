package firstJavaLab;

public class VolumeTabung {

	public static void main(String[] args) {
		double diameter, tinggi, jari, volume;
		final double phi;
		diameter = 5;
		tinggi = 10;
		phi = 3.14;
		jari = 0.5 * diameter;
		volume = phi * jari * jari * tinggi;
		System.out.println("Volume tabung adalah : " + volume);
	}

}
