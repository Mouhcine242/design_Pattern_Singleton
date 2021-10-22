package CaseStudy_Singleton;

public class TerreAcessParall�le3 {
	
	int age ;
	int population ;
	private static  TerreAcessParall�le3 instance = null ;
	
	private TerreAcessParall�le3() {}
	
	public static TerreAcessParall�le3 getInstance() {
		if(instance == null) {
			synchronized (TerreAcessParall�le3.class) {
				if(instance == null) {
					instance = new TerreAcessParall�le3();
				}
				
			}
		}
		return instance;
	}
	public void ajouter(int poeple) {
		population=+poeple ;
		
	}
	
	public void afficher() {
		System.out.println("La terre est ag�e de "+age +"avec une population de "+population);
	}

}
