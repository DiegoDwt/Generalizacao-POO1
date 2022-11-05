package ex3;

public class ContaMain {

	public static void main(String[] args) {
		
		ContaSimples cs = new ContaSimples("Banco do Brasil", 1001, 26543, 800, 5000);
		System.out.println(cs.toString());
		cs.depositoPoupanca(400);
		System.out.println(cs.toString());

	}

}
