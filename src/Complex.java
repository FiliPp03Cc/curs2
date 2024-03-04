
public class Complex {
	
	private static int numarAfisari = 0;

	private double re, img;

	public Complex(double re, double img) {
		this.re = re;
		this.img = img;
	}

	public double modulComplex() {
		return Math.sqrt(re * re + re * img);
	}
	
	public static double modulComplex(Complex c) {
		return Math.sqrt(c.getRe() * c.getRe() + c.getImg() * c.getImg()) ;
	}
	
	public void afisareComplex() {
		System.out.println(this);
		numarAfisari++;
	}
	
	public Complex suma(Complex c) {
		return new Complex(re + c.getRe(), img + c.getImg());
	}

	public double getRe() {
		return re;
	}

	public double getImg() {
		return img;
	}
	
	public static int getnumarAfisari() {
		return numarAfisari;
	}

	public static void numarAfisari() {
		System.out.println("S-au afisat " + numarAfisari + "numere complexe.");
	}
	
	
}
