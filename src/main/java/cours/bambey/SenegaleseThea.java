package cours.bambey;

import java.util.List;
/**
 * Preparation du thé par les senegalais ! 
 */
public class SenegaleseThea extends TheaPreparation {

	@Override
	public String mettre_ingredient(List<String> ingredients) {
		String listeIngredients = String.join(", ", ingredients);
		return "Le the est parfumé avec le nombre d'ingrédient: "+listeIngredients;
	}

}
