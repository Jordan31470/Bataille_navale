
public class Case {
	private Coordonne coordonne;
	private boolean touche;
	private boolean utilise;
	
	 public Coordonne getCoordonne() {
		return coordonne;
	}

	public boolean isTouche() {
		return touche;
	}
	
	public Case(Coordonne coordonne) {
		this.coordonne = coordonne;
		this.touche = false;
		this.utilise =false;
	}

	public boolean isUtilise() {
		return utilise;
	}

	public void setUtilise(boolean utilise) {
		this.utilise = utilise;
	}

	public void setCoordonne(Coordonne coordonne) {
		this.coordonne = coordonne;
	}
	
}
