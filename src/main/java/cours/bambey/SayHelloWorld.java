package cours.bambey;
/**
 * Le contrat d'interface ! 
 * L'interface est FERMEe !
 * Seules les implementations possibles sont :   Wolofones,Halpularen,Occidentaux/
 */
public sealed interface SayHelloWorld permits Wolofones,Halpularen,Occidentaux{
	public String sayHello(String word);
}
