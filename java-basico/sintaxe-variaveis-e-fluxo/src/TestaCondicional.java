
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais"); // Será exibido na tela.

		int idade = 20; // Variável declarada e atribuído um valor.

		int quantidadePessoas = 3; // Variável declarada e atribuído um valor.

		if (idade >= 18) { // A condição será validada, se estiver correta.
			// Se a condição for válida, as duas frases serão exibidas na tela.
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem-vindo!");
		} else { // Se não.
			if (quantidadePessoas >= 2) { // Haverá uma condição, validada se estiver correta.
				// Se a condição for válida, a frase será exibida na tela.
				System.out.println("Você não tem 18 anos, mas pode entrar, " + "pois está acompanhado.");
			} else { // Se as condições não forem validadas, a frase será exibida na tela.
				System.out.println(" Infefelizmente,você não pode entrar.");
			}
		}
	}
}
