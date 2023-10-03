import java.text.ParseException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.(??);
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {   int parametroUm =  parametroDois;
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
             sytem.out.println( "O segundo parâmetro deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)  {
            throw new ParseException(null, parametroDois);

        }
		
		int contagem = parametroDois - parametroUm;
        for ( int parametroUm < parametroDois){

        }

		//realizar o for para imprimir os números com base na variável contagem
	}
}