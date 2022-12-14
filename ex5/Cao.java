package ex5;

public class Cao extends Mamifero {
	private String raca;

	public Cao(String habitat, int tempoGestacao, String raca) {
		super(habitat, tempoGestacao);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Cachorro [raca=");
		builder.append(raca);
		builder.append("]");
		return builder.toString();
	}
	
	
}