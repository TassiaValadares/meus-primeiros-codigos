
public class TestaLacos {

	public static void main(String[] args) {
		
		// La�os entrela�ados  
		
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++ ) { /* No for podemos declarar 
		e inicializar uma vari�vel, realizar uma condi��o e incrementar, somente em uma linha.*/
			
			for(int contador = 1; contador <= 10; contador++) { /* 	Os fluxos est�o entrela�ados, sendo o segundo uma 
			a��o do primeiro fluxo.*/
				
				
				System.out.println( multiplicador +  " x "  +  contador +  " : " +  multiplicador * contador);
				
				// A cada fluxo executado, ser� exibido na tela.
			}
			System.out.println(); // Pula linha.
			
		}
	}
}
