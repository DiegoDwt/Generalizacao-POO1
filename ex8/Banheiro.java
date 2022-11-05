package ex8;

public class Banheiro extends Ambiente {
	
	private boolean banheira;
	
	public Banheiro (float area, boolean banheira) {
		super(area);
	}
	

	public boolean getBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Banheiro Banheira: ");
		builder.append(banheira);
		return builder.toString();
	}
	
		

}
