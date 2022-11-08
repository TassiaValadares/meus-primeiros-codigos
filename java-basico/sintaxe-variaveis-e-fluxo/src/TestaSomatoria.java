
public class TestaSomatoria {

	public static void main(String[] args) {
		
		int contador = 0; // Declaração e inicialização de variável.
		int total = 0; // Declaração e inicialização de variável.
		
		while(contador <= 10) { // Condição
			
			total += contador; // A variável total, recebe ela mesma e a variável contador.
			
			System.out.println(total); // Será exibido um novo valor, em cada novo fluxo.
			
		   contador++; // incremento.
		}
		
	}
}
