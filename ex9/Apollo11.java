package ex9;

public class Apollo11 extends NaveEspacial {
	
	private String tipoCombustivel;
	
	public Apollo11 (double velocidadeMaxima, String tipoCombustivel) {
		super(velocidadeMaxima);
		setTipoCombustivel(tipoCombustivel);
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Nave Apollo11 Tipo Combustivel: ");
		builder.append(tipoCombustivel);
		builder.append(" ");
		return builder.toString();
	}
	
		


}
