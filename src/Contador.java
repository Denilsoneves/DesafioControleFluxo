import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
    Scanner terminal = ??;

    int parametroUm = terminal.??;
    int parametroDois = terminal.??;

    try {
        //chamando o método contendo a lógica de contagem
        contar(parametroUm, parametroDois);
    } catch (Exception e) {
        // TODO: handle exception
        // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
    }
}
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
        // realizar o for para iumprimir os numeros com a base variável contagem
    }
}