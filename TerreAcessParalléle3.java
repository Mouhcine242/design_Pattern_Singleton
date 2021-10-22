package CaseStudy_Singleton;

public class TerreAcessParalléle3 {
	
	int age ;
	int population ;
	private static  TerreAcessParalléle3 instance = null ;
	
	private TerreAcessParalléle3() {}
	
	public static TerreAcessParalléle3 getInstance() {
		if(instance == null) {
			synchronized (TerreAcessParalléle3.class) {
				if(instance == null) {
					instance = new TerreAcessParalléle3();
				}
				
			}
		}
		return instance;
	}
	public void ajouter(int poeple) {
		population=+poeple ;
		
	}
	
	public void afficher() {
		System.out.println("La terre est agée de "+age +"avec une population de "+population);
	}

}
