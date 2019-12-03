import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Navire {
	int taille;
	String nom;
	//int positionX;
	//int positionY;
	Direction direction;
	Coordonne coordonne;
	ArrayList<Case>caseList;
	
	public Navire(int taille,String nom,Coordonne coordonne,Direction direction) {
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
			if (this.coordonne.getX() == cas.getCoordonne().getX() && this.coordonne.getY() >= cas.getCoordonne().getY() && this.coordonne.getY() <= cas.getCoordonne().getY() + this.taille-1) {
				return true;
			}else {
				return false;
			}
		}
			else {
				if (this.direction == this.direction.NORD) {
					if (this.coordonne.getX() == cas.getCoordonne().getX() && this.coordonne.getY() <= cas.getCoordonne().getY()  && this.coordonne.getY() >= cas.getCoordonne().getY()  - this.taille-1) {
						return true;
					}else {
						return false;
					}
				}else { 
					if (this.direction == this.direction.EST) {
						if (this.coordonne.getY() == cas.getCoordonne().getY() && this.coordonne.getX() <= cas.getCoordonne().getY() && this.coordonne.getX() >= cas.getCoordonne().getX() + this.taille-1) {
							return true;
						}else {
							return false;
						}
						}else {
							if (this.direction == this.direction.OUEST) {
								if (this.coordonne.getY() == cas.getCoordonne().getY()  && this.coordonne.getX() >= cas.getCoordonne().getY() && this.coordonne.getX() <= cas.getCoordonne().getX() - this.taille-1) {
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
	
	public Boolean estCoule() {
		
		
	}
	      
	      
	    	  
	      }

	
