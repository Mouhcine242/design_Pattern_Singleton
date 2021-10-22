package CaseStudy_Singleton;

public class TerreAcessParalléle2 {
	int age ;
	int population ;
	private static  TerreAcessParalléle2 instance = null ;
	
	private TerreAcessParalléle2() {}
	
	public static synchronized TerreAcessParalléle2 getInstance() {
		if(instance == null) {
			instance = new TerreAcessParalléle2();
			
		}
		return instance ;
		
		
	}
	public void ajouter(int poeple) {
		population=+poeple ;
		
	}
	
	public void afficher() {
		System.out.println("La terre est agée de "+age +"avec une population de "+population);
	}

}
