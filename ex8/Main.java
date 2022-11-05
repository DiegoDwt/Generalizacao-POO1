package ex8;

public class Main {

	public static void main(String[] args) {
		
		Quarto q = new Quarto(16, 2);
		System.out.println(q.toString());
		
		Sala s = new Sala(25, true);
		System.out.println(s.toString());
		
		Banheiro b = new Banheiro(9, false);
		System.out.println(b.toString());
		
		Cozinha c = new Cozinha(16, true);
		System.out.println(c.toString());
	}

}
