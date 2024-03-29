

public class Pion {
	
	private String couleur ;
	private int ligne = 0 ;
	private int colonne = 0 ;
	
	public Pion(String couleur) {
		super();
		this.couleur = couleur;
	}

	public Pion(String couleur, int ligne, int colonne) {
		super();
		this.couleur = couleur;
		this.ligne = ligne;
		this.colonne = colonne;
	}

	public int getLigne() {
		return ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public String getCouleur() {
		return couleur;
	}
	
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public boolean estEnJeu() {
		if( this.ligne == 0 && this.colonne == 0 ) {
			return false ;
		}
		return true ;
	}
	
	public boolean estHorsJeu() {
		if( this.ligne != 0 && this.colonne != 0 ) {
			return false ;
		}
		return true ;
	}
	
	public void placer( int ligne , int colonne ) {
		this.ligne = ligne ;
		this.colonne = colonne ;
	}
	
	public void retirer() {
		this.ligne = 0 ;
		this.colonne = 0 ;
	}
	
	public void deplacerNord() {
		this.ligne -= 1 ;
	}
	
	public void deplacerSud() {
		this.ligne += 1 ;
	}
	
	public void deplacerOuest() {
		this.colonne -= 1 ;
	}
	
	public void deplacerEst() {
		this.colonne += 1 ;
	}

	public String enChaine() {
		return "Pion " + this.couleur + " : " + this.ligne + "," + this.colonne ; 
	}
}
