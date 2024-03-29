

public class ValidationPositionnement {

	public static void main(String[] args) {
		
		Pion [] pions = { 
				new Pion( "rouge" , 1 , 4 ) , 
				new Pion( "blanc" ) , 
				new Pion( "blanc" , 1 , 3 ) , 
				new Pion( "blanc" , 4 , 4 ) , 
				new Pion( "blanc" , 10 , 3 ) , 
				new Pion( "rouge" , 4 , 4 ) , 
				new Pion( "rouge" , 7 , 2) , 
				new Pion( "rouge" , 4 , 1)
		} ;
		
		boolean ok = true ; 
		int i = 0 ; 
		
		while( i < 7 && ok ){
			if(pions[i].estEnJeu()){
				int j = i + 1 ; 
				while( j < 8 && ok ){
					if(pions[j].estEnJeu()){
						if( pions[i].getLigne() == pions[j].getLigne() && pions[i].getColonne() == pions[j].getColonne()){
							ok = false ;
						}
					}
					j = j + 1 ; 
				}
			}
			i = i + 1 ; 	
		}
		if ( ok = true ){
			System.out.println("Positionnement validé.") ;
		}
		else {
			System.out.println("Positionnement rejeté.") ; 
		}
		

	}

}
