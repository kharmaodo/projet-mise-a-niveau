package cours.bambey;

import java.util.List;
/**
 * Classe abstraite pour la préparation du thé à travers les cultures.
 * 
 */
public abstract class TheaPreparation {

	protected String bouillir_eau() {
		return "Le thé est en ebullition";
	}

	protected String mettre_the() {
		return "Le thé est ajouté";
	}

	public abstract String mettre_ingredient(List<String> ingredients);

	protected String servir() {
		return "Le thé est servi";
	}
}
