package br.com.targetsistemas.selecao.Q02;
public class Main {
    public static void main(String[] args) {
        int pergunta = 3; // O número 8 pertence na sequência de Fibonacci?
        System.out.println("Número digitado: "+pergunta); // Imprime o número perguntado;
        int[] fibonacciArray = new int[pergunta+2]; // Cria um array para a determinar a quantidade necessária de caracteres para verificar se o número pertence na sequência de Fibonacci.

        fibonacciArray[0] = 0; // Define 0 e 1 como valores iniciais.
        fibonacciArray[1] = 1; 


        calcularSequencia(fibonacciArray); // Joga o Array para um método que vai calcular a sequência, somando os 2 que já estão calculados e calculando um novo. 

        char pertence = 'n'; // Define que o número, por padrão, não está contido na sequência de Fibonacci.

        for (int i = 0; i < fibonacciArray.length; i++) { // Verifica se nas posições, há o número de interesse.
            if(pergunta == fibonacciArray[i]) 
                pertence = 's';    
        }

        if(pertence == 's') // Se pertence o número, printado será que pertence a sequência.
            System.out.println("Este número pertence a sequência de Fibonacci.");
        else // Caso contrário, será printado que não pertence.
            System.out.println("Este número não pertence a sequência de Fibonacci.");
    }

    private static void calcularSequencia(int[] fibonacciArray) {
        for (int i = 0; i < ((fibonacciArray.length)-2); i++) { // O contador termina no tamanho -2 por já ser suficiente para determinar a sequência completa, evitando erros.
            fibonacciArray[i+2] = fibonacciArray[i]+fibonacciArray[i+1]; // Soma e resultado na posição 2 números a frente do contador.
        }
    }
}
