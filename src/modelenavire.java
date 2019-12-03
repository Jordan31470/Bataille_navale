
public enum modelenavire {
	PORTE_AVION(5),CROISEUR(4),CONTRE_TORPILLEURS(3),TORPILLEUR(2);
	
	private int taille;

	private modelenavire(int taille) {
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}

}
		