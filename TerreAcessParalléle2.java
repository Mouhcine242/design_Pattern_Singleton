package CaseStudy_Singleton;

public class TerreAcessParall�le2 {
	int age ;
	int population ;
	private static  TerreAcessParall�le2 instance = null ;
	
	private TerreAcessParall�le2() {}
	
	public static synchronized TerreAcessParall�le2 getInstance() {
		if(instance == null) {
			instance = new TerreAcessParall�le2();
			
		}
		return instance ;
		
		
	}
	public void ajouter(int poeple) {
		population=+poeple ;
		
	}
	
	public void afficher() {
		System.out.println("La terre est ag�e de "+age +"avec une population de "+population);
	}

}
