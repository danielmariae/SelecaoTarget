package br.com.targetsistemas.selecao.Q04.modelo;

public class Veiculo {

    public String tipo; // Para a questão, apenas o tipo basta. 
    public double velocidade; // Velocidade (inicialmente em km/h, mas que será convertida para km/min);
    public double distancia; // Distância em km;
    public int tempoDeViagem; // Será um tempo medido em minutos.
    public char passePedagio; // Verifica se o carro tem passe para pedágios ou não. Caso não tenha, será adicionado +5 minutos no tempo de viagem.
    public String deslocamento; // Verifica se o carro está fazendo um deslocamento vindo ou saindo (em relação a Ribeirão Preto).
    public String status; // Diz se o veículo já chegou ou não.

    public static void cadastrarCaminhao(Veiculo veiculo){
        veiculo.velocidade = (80.0/60.0); // Se o veículo em 60min percorre 80km, em 1 minuto percorre o resultado da expressão anterior. 
        veiculo.distancia = 100; // Caminhão inicia em 100, pois, é a distância em relação a Ribeirão Preto que será considerada
        veiculo.tipo = "Caminhão";
        veiculo.tempoDeViagem = 0;
        veiculo.passePedagio = 'n';
        veiculo.deslocamento = "vindo";
        veiculo.status = "deslocando";
    }

    public static void cadastrarCarro(Veiculo veiculo){
        veiculo.velocidade = (110.0/60.0); // Se o veículo em 60min percorre 110, em 1 minuto percorre o veiculo.resultado da expressão anterior. 
        veiculo.distancia = 0; // Carro inicia em 0, pois, é a distância em relação a Ribeirão Preto que será considerada.
        veiculo.tipo = "Carro";
        veiculo.tempoDeViagem = 0;
        veiculo.passePedagio = 's';
        veiculo.deslocamento = "saindo";
        veiculo.status = "deslocando";
    }
}

