package ex2;

public class ItemMain {

	public static void main(String[] args) {
		
		Livro l = new Livro(101, "Pai Rico, Pai Pobre", "Robert Kiyosaki");
		System.out.println(l.toString());
		
		Midia m = new Midia(865, "Show ao vivo", "Sony", 65);
		System.out.println(m.toString());
		
		Cd cd = new Cd(777, "Album", "Sony", 72, 15, "Jimmy Hendrix", "Rainbow Bridge");
		System.out.println(cd.toString());
		
		Vhs v = new Vhs(987, "Ao vivo", "Sony", 60, "Ópera");
		System.out.println(v.toString());

	}

}
