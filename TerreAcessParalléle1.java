package CaseStudy_Singleton;

public class TerreAcessParalléle1 {
	int age ;
	int population ;
	private static  TerreAcessParalléle1 instance = new TerreAcessParalléle1() ;
	
	private TerreAcessParalléle1() {}
	
	public static TerreAcessParalléle1 getInstance() {
		return instance ;
	}
	
	public void ajouter(int poeple) {
		population=+poeple ;
		
	}
	
	public void afficher() {
		System.out.println("La terre est agée de "+age +"avec une population de "+population);
	}
	
	

    

}
