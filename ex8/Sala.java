package ex8;

public class Sala extends Ambiente {
	
	private boolean tv;
	
	public Sala (float area, boolean tv) {
		super(area);
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Sala Tv: ");
		builder.append(tv);
		return builder.toString();
	}

	

}
