package CaseStudy_Singleton;

public class TreeParThread extends Thread {
	
	int age ;
	int population ;
	
	private TreeParThread () {}
	
	private static TreeParThread instance  = null;
	
	public void  run() {
		if(instance == null) {
			instance = new TreeParThread();
		}
		
	}
	
	public static TreeParThread getInstance() {
		
		instance.start();
		
		return instance ;
		
	}
	public void ajouter(int poeple) {
		population=+poeple ;
		
	}
	
	public void afficher() {
		System.out.println("La terre est agée de "+age +"avec une population de "+population);
	}

}
