import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		
	}
}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
	    
        if (parametroUm>parametroDois)
        throw new ParametrosInvalidosException();
        {
 
            System.out.println(" O parametro UM é maior que parametro DOIS");
 }
    
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;
        for ( int i=0; parametroUm<parametroDois;i--){
        int valoresSomados = (parametroUm) - (parametroDois);
        
        System.out.println("Imprimindo: " + valoresSomados);
        }
		//realizar o for para imprimir os números com base na variável contagem
	

    }
}