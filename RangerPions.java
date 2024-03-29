

public class RangerPions {

	public static void main(String[] args) {
		
		Pion [] pions = { 
				new Pion( "rouge" , 1 , 4 ) , 
				new Pion( "blanc" ) , 
				new Pion( "blanc" , 1 , 2 ) , 
				new Pion( "blanc" , 4 , 4 ) , 
				new Pion( "blanc" , 10 , 3 ) , 
				new Pion( "rouge" , 5 , 9 ) , 
				new Pion( "rouge" ) , 
				new Pion( "rouge" )
		} ;
		
		for(int i = 0 ; i < pions.length ; i += 1 ){
				if( pions[i].estHorsJeu()){
					pions[i].retirer() ; 
				}
		}
		
		
	}

}
