
public class Case {
	private Coordonne coordonne;
	
	 public Coordonne getCoordonne() {
		return coordonne;
	}

	public boolean isTouche() {
		return touche;
	}

	private boolean touche;
	
	public Case(Coordonne coordonne) {
		this.coordonne = coordonne;
		this.touche = false;
	}
	
}
