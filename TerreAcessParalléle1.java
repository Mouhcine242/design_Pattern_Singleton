package CaseStudy_Singleton;

public class TerreAcessParall�le1 {
	int age ;
	int population ;
	private static  TerreAcessParall�le1 instance = new TerreAcessParall�le1() ;
	
	private TerreAcessParall�le1() {}
	
	public static TerreAcessParall�le1 getInstance() {
		return instance ;
	}
	
	public void ajouter(int poeple) {
		population=+poeple ;
		
	}
	
	public void afficher() {
		System.out.println("La terre est ag�e de "+age +"avec une population de "+population);
	}
	
	

    

}
