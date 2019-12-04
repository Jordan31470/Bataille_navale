import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class Grille {
	
	
	private final int LIGNES = 10;
	private final int COLONNES = 10;
	
	private List<Navire> BateauxList;
	private HashMap<String,Case>grille;
	
	public Grille() {
		for ( int l=0; l < this.LIGNES; l++) {
			for(int c=0; c< this.COLONNES; c++) {
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
		
		switch (bateau.getDirection()) {
		case NORD :
			for (int i= 1; i<= bateau.getTaille();i++) {
				Case value = this.grille.get(getCaseY+""+getCaseX+(-i));
				bateau.getCaseList().add(value);
			}
		case SUD :
			for (int i= 1; i<= bateau.getTaille();i++) {
				Case value = this.grille.get(getCaseY+""+getCaseX+i);
				bateau.getCaseList().add(value);
			}	
		case EST :
			for (int i= 1; i<= bateau.getTaille();i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+i);
				bateau.getCaseList().add(value);
			}
		case OUEST :
			for (int i= 1; i<= bateau.getTaille();i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+(-i));
				bateau.getCaseList().add(value);
			}
		default:
			break;
		}
		
	}
	public void tirer(Case c)throws Exception  {
		if(c.isUtilise()) {
			throw new IllegalArgumentException("La case a deja ete utilisee");			
		}
		for (Navire currentNavire : this.BateauxList) {
				currentNavire.estDansCase(c);
				currentNavire.tirer(c);
				if(currentNavire.getTaille()==0) {
					System.out.println("le bateau coule");
				}
				break;
		}
			
				
				
				
			
			
		}
		
	
}
