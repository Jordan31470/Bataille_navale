import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Navire {
	private int taille;
	private String nom;
	private Direction direction;
	private Coordonne coordonne;
	private List<Case>caseList;
	
	
	public int getTaille() {
		return taille;
	}
	public String getNom() {
		return nom;
	}
	public Direction getDirection() {
		return direction;
	}
	public Coordonne getCoordonne() {
		return coordonne;
	}
	public List<Case> getCaseList() {
		return caseList;
	}
	
	public Navire(int taille,String nom,Coordonne coordonne,Direction direction) {
		this.direction = direction;
		this.taille = taille;
		this.nom = nom;
		//this.positionX = positionX;
		//this.positionY = positionY;
		this.coordonne = coordonne;
	}
	public void tirer(Case c) {
		
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
		for (Case currentCase :this.caseList) {
			Case c = currentCase;
			if(! c.isTouche()) {
				return false;
			}
		}
		return true;
		
		
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caseList == null) ? 0 : caseList.hashCode());
		result = prime * result + ((coordonne == null) ? 0 : coordonne.hashCode());
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + taille;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Navire other = (Navire) obj;
		if (caseList == null) {
			if (other.caseList != null)
				return false;
		} else if (!caseList.equals(other.caseList))
			return false;
		if (coordonne == null) {
			if (other.coordonne != null)
				return false;
		} else if (!coordonne.equals(other.coordonne))
			return false;
		if (direction != other.direction)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (taille != other.taille)
			return false;
		return true;
	}
	      
	      
	    	  
	      }

	
