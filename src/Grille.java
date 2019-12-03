import java.util.HashMap;
import java.util.List;


public class Grille {
	
	List<Navire> Bateaux;
	HashMap<String,Case>grille;
	int ligne = 10;
	int colonne = 10;
	
	
	public Grille() {
		for ( int l=0; l < this.ligne; l++) {
			for(int c=0; c< this.colonne; c++) {
				this.grille.put(l+""+c,new Case(new Coordonne(l,c)));
			}
				
			
		}

}
	public String StatusCase(Case c) {
		if(c.isTouche()) {
			return("Touche");
		}else {
			return ("Pas Touche");
		}
	}
	public void placerBateaux(Navire bateau,Case c) {
		int getCaseX = c.getCoordonne().getX();
		int getCaseY = c.getCoordonne().getY();
		switch (bateau.direction) {
		case NORD :
			for (int i= 1; i<= bateau.taille;i++) {
				Case value = this.grille.get(getCaseY+""+getCaseX+(-i));
				bateau.caseList.add(value);
			}
		case SUD :
			for (int i= 1; i<= bateau.taille;i++) {
				Case value = this.grille.get(getCaseY+""+getCaseX+i);
				bateau.caseList.add(value);
			}	
		case EST :
			for (int i= 1; i<= bateau.taille;i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+i);
				bateau.caseList.add(value);
			}
		case OUEST :
			for (int i= 1; i<= bateau.taille;i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+(-i));
				bateau.caseList.add(value);
			}
		
		}
		
	}
	public void tirer() {
		
	}
}