
public class Navire {
	int taille;
	String nom;
	//int positionX;
	//int positionY;
	Direction direction;
	Coordonne coordonne;
	
	public Navire(int taille,String nom, int positionX,int positionY,Direction direction) {
		this.direction = direction;
		this.taille = taille;
		this.nom = nom;
		//this.positionX = positionX;
		//this.positionY = positionY;
		this.coordonne = coordonne;
	}
	public void tirer() {
		
	}

	public Boolean estDansCase(Case cas) { 
		if (this.direction == this.direction.SUD) {
			if (this.coordonne.x == cas.coordonne.x && this.coordonne.y >= cas.coordonne.y && this.coordonne.y <= cas.coordonne.y + this.taille-1) {
				return true;
			}else {
				return false;
			}
		}
			else {
				if (this.direction == this.direction.NORD) {
					if (this.coordonne.x == cas.coordonne.x && this.coordonne.y <= cas.coordonne.y  && this.coordonne.y >= cas.coordonne.y  - this.taille-1) {
						return true;
					}else {
						return false;
					}
				}else { 
					if (this.direction == this.direction.EST) {
						if (this.coordonne.y == cas.coordonne.y && this.coordonne.x <= cas.coordonne.y && this.coordonne.x >= cas.coordonne.x + this.taille-1) {
							return true;
						}else {
							return false;
						}
						}else {
							if (this.direction == this.direction.OUEST) {
								if (this.coordonne.y == cas.coordonne.y  && this.coordonne.x >= cas.coordonne.y && this.coordonne.x <= cas.coordonne.x - this.taille-1) {
									return true;
								}else {
									return false;
					}
					}
							return false;
					}
				}
				
		}
	}
}
