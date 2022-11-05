package ex10;

public class Main {

	public static void main(String[] args) {
		
		Bomba bomba = new Bomba();
		bomba.setTotalLitros(1000);
		bomba.setValorLitro(5.45f);
		System.out.println(bomba);
			
		BombaGasolina G = new BombaGasolina();
		G.setTotalLitros(2000);
		G.setValorLitro(4.8f);
		System.out.println(G);
			
		BombaEtanol E = new BombaEtanol();
		E.setTotalLitros(3000);
		E.setValorLitro(4.4f);
		System.out.println(E);
			
		BombaDiesel D = new BombaDiesel();
		D.setTotalLitros(4000);
		D.setValorLitro(8.5f);
		System.out.println(D);

		}

	}

