package ex9;

public class Main {

	public static void main(String[] args) {
		
		MilleniumFalcon m = new MilleniumFalcon(1660, "Querosene", 89);
		System.out.println(m.toString());
		
		Apollo11 a = new Apollo11(1500, "Querosene");
		System.out.println(a.toString());
		
		NaveEspacial n = new NaveEspacial(1700);
		System.out.println(n.toString());

	}

}
