package ex5;

public class Main {

	public static void main(String[] args) {
		Cao c = new Cao("Doméstico", 60, "Buldog");
		System.out.println(c.toString());
		
		Gato g = new Gato("Doméstico", 65, "Siamês");
		System.out.println(g.toString());
		
		Tartaruga t = new Tartaruga("Marinho", true, "tartaruga-verde");
		System.out.println(t.toString());
		
		Lagarto l = new Lagarto("Mata", true, "calango-verde");
		System.out.println(l.toString());

	}

}

