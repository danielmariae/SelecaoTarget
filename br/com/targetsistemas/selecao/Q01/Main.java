package br.com.targetsistemas.selecao.Q01;
/*
 * Nesta questão, foi feito a refatoração de Portugol para Java, a minha linguagem nativa.
 */
public class Main{
    public static void main(String[] args) {
        int indice=13, soma=0, k=0;
        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}