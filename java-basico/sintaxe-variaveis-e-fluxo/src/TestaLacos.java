
public class TestaLacos {

	public static void main(String[] args) {
		
		// Laços entrelaçados  
		
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++ ) { /* No for podemos declarar 
		e inicializar uma variável, realizar uma condição e incrementar, somente em uma linha.*/
			
			for(int contador = 1; contador <= 10; contador++) { /* 	Os fluxos estão entrelaçados, sendo o segundo uma 
			ação do primeiro fluxo.*/
				
				
				System.out.println( multiplicador +  " x "  +  contador +  " : " +  multiplicador * contador);
				
				// A cada fluxo executado, será exibido na tela.
			}
			System.out.println(); // Pula linha.
			
		}
	}
}
