package br.com.targetsistemas.selecao.Q05;

public class Main {
    public static void main(String[] args) {
        String palavra = "Target"; // Definindo a palavra a ser invertida.
        System.out.println(palavra); // Imprimindo a palavra digitada;
        char[] letrasCorretas  = palavra.toCharArray(); // Convertendo caracteres a um array;
        char[] letrasInvertidas = new char[palavra.length()]; // Criando array de letras invertidas;

        int j = 0; // Definindo a variável int "j" aqui fora, para não redefinir toda vez no laço de repetição.

        for (int z = ((palavra.length())-1); z >= 0; z--)  {
            letrasInvertidas[j] = letrasCorretas[z];
            j++;
        } // Lógica: A posição 0 do char[] letrasInvertidas recebe a posição 4 do char[] letrasCorretas;
        String palavraInvertida = new String(letrasInvertidas); // Concatenando com um construtor de Strings "letrasInvertidas";
        System.out.println(palavraInvertida); // Imprimindo a palavra invertida na tela.
    }
}
