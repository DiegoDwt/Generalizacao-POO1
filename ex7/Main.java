package ex7;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(22, "Bob", "Rua das couves");
		
		System.out.println(p.toString());
		

		Professor prof = new Professor(33, "João", "Avenida Central", "Inglês");
		
		System.out.println(prof.toString());
		
		
		Aluno a = new Aluno(44, "Gian", "Rua Duque de Caxias", 2022123);
		
		System.out.println(a.toString());
		
	}

}
