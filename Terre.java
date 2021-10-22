package CaseStudy_Singleton;

public class Terre {
	int age ;
	int population ;
	
	private static  Terre instance = null ;
	
	private Terre() {}
	
	// Get Instance par les client de facon sequentiel 
	public static Terre getInstanceSeq() {
		
		if(instance== null) {
			instance = new Terre();
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
