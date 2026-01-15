package cours.bambey;

public class MainTest {

	public static void main(String[] args) {
		SayHelloWorld wolof = new Wolofones();
		String jolof = wolof.sayHello("Moussa");
		System.out.println(jolof);

		SayHelloWorld peul = new Halpularen();
		String fouta = peul.sayHello("Moussa");
		System.out.println(fouta);

		SayHelloWorld francais = new Occidentaux();
		String france = francais.sayHello("Moussa");
		System.out.println(france);
		
		
		
//		SayHelloWorld oiseaux = new Oiseaux();
//		String canard = oiseaux.sayHello("Coincoin");
//		System.out.println(canard);

	}

}
