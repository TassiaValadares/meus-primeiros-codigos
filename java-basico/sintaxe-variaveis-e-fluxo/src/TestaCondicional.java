
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais"); // Ser� exibido na tela.

		int idade = 20; // Vari�vel declarada e atribu�do um valor.

		int quantidadePessoas = 3; // Vari�vel declarada e atribu�do um valor.

		if (idade >= 18) { // A condi��o ser� validada, se estiver correta.
			// Se a condi��o for v�lida, as duas frases ser�o exibidas na tela.
			System.out.println("Voc� tem mais de 18 anos.");
			System.out.println("Seja bem-vindo!");
		} else { // Se n�o.
			if (quantidadePessoas >= 2) { // Haver� uma condi��o, validada se estiver correta.
				// Se a condi��o for v�lida, a frase ser� exibida na tela.
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar, " + "pois est� acompanhado.");
			} else { // Se as condi��es n�o forem validadas, a frase ser� exibida na tela.
				System.out.println(" Infefelizmente,voc� n�o pode entrar.");
			}
		}
	}
}
