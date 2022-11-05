package ex8;

public class Cozinha extends Ambiente {
	
	private boolean microondas;
	
	public Cozinha (float area, boolean microondas) {
		super(area);
	}

	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Cozinha Microondas: ");
		builder.append(microondas);
		return builder.toString();
	}
	
	

}
