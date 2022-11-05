package ex1;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Bob");
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa("João", "Rua das Couves");
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		PessoaFisica pf = new PessoaFisica("Juquinha", "Rua Dom pedro II", "065.324.654-12", "Casado");
		System.out.println(pf.toString());
		
		PessoaJuridica pj = new PessoaJuridica("Padaria dos sonhos", "Rua Dom BOsco", "29.345.234/0001-23", "LTDA");
		System.out.println(pj.toString());

	}

}
