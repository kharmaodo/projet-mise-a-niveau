package cours.bambey;

import java.util.List;
/**
 * Préparons le thé à travers les culture.
 * 
 */
public class MainAbstractTest {

	public static void main(String[] args) {
		TheaPreparation ataya = new SenegaleseThea();
		
		System.out.println("Etape 1: "+ataya.bouillir_eau());
		System.out.println("Etape 2: "+ataya.mettre_the());
		System.out.println("Etape 3: "+ataya.mettre_ingredient(List.of("clou de girofle", "nana", "citronelle")));
		System.out.println("Etape 4: "+ataya.servir());
	}

}
