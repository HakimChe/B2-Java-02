

public class ManipulationPions {

	public static void main(String[] args) {
		
		Pion p1 , p2 ;
		p1 = new Pion( "rouge" , 2 , 7 ) ;
		p2 = new Pion( "blanc" , 9 , 3 ) ;
		
		
		// Q1- Afficher le pion référencé par la variable p1.
		System.out.println( "Q1> " ) ;
		System.out.println( p1.enChaine() ) ;	
		
		
		// Q2- Affecter à la variable ligne1 la ligne du pion référencé par la variable p1.
		int ligne1 = p1.getLigne() ; 
		System.out.println( "Q2> " + ligne1 ) ;
		
		
		// Q3- Affecter à la variable couleur1 la couleur du pion référencé par la variable p1.
		String couleur1 = p1.getCouleur() ; 
		System.out.println( "Q3> " + couleur1 ) ;
		
		
		// Q4- Modifier la colonne du pion référencé par la variable p1. Le pion se trouve maintenant en colonne 8 
		p1.setColonne(8) ;  
		System.out.println( "Q4> " + p1.enChaine() ) ;
		
		
		// Q5- Déplacer le pion référencé par la variable p2, d'une case vers l'ouest.
		p2.deplacerOuest() ; 
		System.out.println( "Q5> " + p2.enChaine() ) ;
		
		
		// Q6- Retirer le pion référencé par la variable p2.
		p2.retirer() ; 
		System.out.println( "Q6> " + p2.enChaine() ) ;
		
		
		// Q7- Indiquer si le pion référencé par la variable p1 est jeu.
		System.out.println( "Q7> " ) ;
		if(p1.estEnJeu() == true){
			System.out.println("Le pion est en jeu.") ; 
		}
		else{
			System.out.println("Le pion n'est pas en jeu.") ;
		}
		 
	
		// Q8- Indiquer si le pion référencé par la variable p2 est jeu. 
		System.out.println( "Q8> " ) ;
		if(p2.estEnJeu() == true){
			System.out.println("Le pion est en jeu.") ; 
		}
		else{
			System.out.println("Le pion n'est pas en jeu.") ;
		}
		
		
		// Q9- Placer le pion référencé par la variable p2 en ligne 8 et en colonne 2.
		p2.placer(8,2) ; 
		System.out.println( "Q9> " + p2.enChaine() ) ;
		
		
		// Q10- Indiquer si les deux pions se trouvent sur la même case.
		System.out.println( "Q10> " ) ;
		int colonne_p1 = p1.getColonne() ; 
		int ligne_p1 = p1.getLigne() ; 
		String pos_p1 = colonne_p1 + " :"  + ligne_p1 ; 
		
		int colonne_p2 = p2.getColonne() ; 
		int ligne_p2 = p2.getLigne() ; 
		String pos_p2 = colonne_p2 + " : " + ligne_p2 ; 
		
		if(pos_p1 == pos_p2){
				System.out.println("Les deux pions sont sur la même case.") ; 
		}
		else{
			System.out.println("Les deux pions ne sont pas sur la même case.") ; 
		}
		
	
		
	}

}
