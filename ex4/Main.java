package ex4;

public class Main {

	public static void main(String[] args) {
		
			Carro c = new Carro(true, 4);
			System.out.println(c.toString());
			
			Moto m = new Moto(true, 1100);
			System.out.println(m.toString());
			
			Caminhao ca = new Caminhao(true, 4);
			System.out.println(ca.toString());


	}

}
