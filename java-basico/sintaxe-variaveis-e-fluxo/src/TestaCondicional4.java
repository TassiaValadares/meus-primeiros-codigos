
public class TestaCondicional4 {

	public static void main(String[] args) {
		
		int idade = 20;  // Variável declarada e atribuído um valor.
		
		boolean acompanhado = true;// Boolean declarado e sua condição.
		   
		    // Condição que vai ser validada, se as duas condições forem corretas.
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem-Vindo!"); // Se a condição for verdadeira, será exibida na tela.
		} else {
			System.out.println("Infelizmente, você não pode entrar."); /* Se a condição for falsa, 
			será exibida na tela.*/
		}
	}
}
