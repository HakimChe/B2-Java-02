

public class VisualisationPions {

	public static void main(String[] args) {
		
		Pion [] pions = { 
				new Pion( "rouge" , 1 , 4 ) , 
				new Pion( "blanc" , 7 , 3 ) , 
				new Pion( "blanc" , 1 , 2 ) , 
				new Pion( "blanc" , 4 , 4 ) , 
				new Pion( "blanc" , 10 , 3 ) , 
				new Pion( "rouge" , 5 , 9 ) , 
				new Pion( "rouge" , 8 , 7 ) , 
				new Pion( "rouge" , 2 , 10 )
		} ;
		for(int i = 0 ; i < pions.length ; i += 1){
				System.out.println( pions[i].enChaine()) ; 
		}
		
	}

}
