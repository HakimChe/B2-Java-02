

public class DeplacementPion {

	public static void main(String[] args) {

		Pion p  ;
		p = new Pion( "rouge" , 1 , 4 ) ;
		
		int i = 0 ;  
		
		while( i < 9 ){
			p.deplacerSud() ; 
			System.out.println( " Pion rouge : " + p.enChaine())  ;
			i += 1 ; 
		}
		
	}

}
