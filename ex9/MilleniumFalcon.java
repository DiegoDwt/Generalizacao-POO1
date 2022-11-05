package ex9;

public class MilleniumFalcon extends Apollo11 {
	
	private float hiperpropulsor;

	public MilleniumFalcon(double velocidadeMaxima, String tipoCombustivel, float hiperpropulsor) {
		super(velocidadeMaxima, tipoCombustivel);
		setHiperpropulsor(hiperpropulsor);
	}

	public float getHiperpropulsor() {
		return hiperpropulsor;
	}

	public void setHiperpropulsor(float hiperpropulsor) {
		this.hiperpropulsor = hiperpropulsor;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - MilleniumFalcon [hiperpropulsor=");
		builder.append(hiperpropulsor);
		builder.append("]");
		return builder.toString();
	}
	
	
}