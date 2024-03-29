

public class CreationPions {

	public static void main(String[] args) {

		Pion p1 ;
		Pion p2 ;
		Pion p3 ;
		
		// Q1- Initialiser la variable p1 avec un pion rouge hors jeu.
		p1 = new Pion( "rouge" ) ;
		System.out.println( "\nQ1>" ) ;
		System.out.println( p1.enChaine() ) ;
		System.out.println( p1 ) ;
		
		
		// Q2- Initialiser la variable p2 avec un pion blanc placé en ligne 3 et en colonne 5.
		p2 = new Pion( "blanc" , 3 , 5 ) ; 
		System.out.println( "\nQ2>" ) ;
		System.out.println( p2.enChaine() ) ;
		System.out.println( p2 ) ;
		
		
		// Q3- Initialiser la variable p3 par recopie du pion référencé par la variable p2.
		p3 = p2 ; 
		System.out.println( "\nQ3>" ) ;
		System.out.println( p3.enChaine() ) ;
		System.out.println( p3 ) ;
		
	}

}
