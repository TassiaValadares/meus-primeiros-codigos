
public class TestaSomatoria {

	public static void main(String[] args) {
		
		int contador = 0; // Declara��o e inicializa��o de vari�vel.
		int total = 0; // Declara��o e inicializa��o de vari�vel.
		
		while(contador <= 10) { // Condi��o
			
			total += contador; // A vari�vel total, recebe ela mesma e a vari�vel contador.
			
			System.out.println(total); // Ser� exibido um novo valor, em cada novo fluxo.
			
		   contador++; // incremento.
		}
		
	}
}
