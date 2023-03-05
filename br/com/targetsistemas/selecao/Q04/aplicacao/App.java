package br.com.targetsistemas.selecao.Q04.aplicacao;
import br.com.targetsistemas.selecao.Q04.modelo.Veiculo;
/*
 * 4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirao Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirao Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirao Preto?
 * ANOTAÇÕES:
 * A cidade de Franca será o km 100, e Ribeirao Preto, o km 0.
 * O referencial DISTÂNCIA será considerando a cidade de Ribeirao Preto como ponto final, já que os 2 veículos serão analisados na sua distância em relação a RP.
 * A velocidade será convertida de km/h para km/min, a fim de facilitar a medição no tempo.
 * Os pedágios serão entre os km 33/34 e 66/67 da estrada.
 */
public class App {
    public static void main(String[] args) {
        Veiculo caminhao = new Veiculo();
        Veiculo carro = new Veiculo();
    
        Veiculo.cadastrarCaminhao(caminhao); // Defini os dados de cadastro do caminhão na Classe Veículo, e do Carro, a mesma lógica.
        Veiculo.cadastrarCarro(carro);
        
        System.out.println("VIAGEM DO CAMINHAO\nDistância em relação a Ribeirao Preto: "+caminhao.distancia+"\nTempo total de viagem: "+caminhao.tempoDeViagem+"\n"); // Dizendo como está o caminhão na hora da partida.
        viagemVeiculo(caminhao); // Enviando o caminhão para a viagem.
        System.out.println("\nVIAGEM DO CARRO\nDistância em relação a Ribeirao Preto: "+carro.distancia+"\nTempo total de viagem: "+carro.tempoDeViagem+"\n"); // Dizendo como está o carro na hora da partida.
        viagemVeiculo(carro); // Enviando o carro para a viagem.
    }
    public static void viagemVeiculo(Veiculo veiculo) {
        while(veiculo.status == "deslocando"){ // Enquanto o carro estiver deslocando...
            if(veiculo.passePedagio == 's') // Se o carro tiver passe de pedágio (SemParar), o contador de tempo irá sempre crescer em 1 minuto.
                veiculo.tempoDeViagem += 1;
            else // Caso não tenha, ele vai ser enviado para um método que adiciona os pedágios.
                adicionarPedagios(veiculo); 
            calcularDistancia(veiculo); // De qualquer modo, a distância é calculada depois.
            System.out.println("Distância em relação a Ribeirao Preto: "+veiculo.distancia+"\nTempo total de viagem: "+veiculo.tempoDeViagem+"\n"); // A distância em relação a Ribeirão Preto e o tempo de viagem são exibidos a cada repetição do laço.
        }
    }
    public static void adicionarPedagios(Veiculo veiculo){
        if((veiculo.distancia >= 33 && veiculo.distancia <= 34) || (veiculo.distancia >= 66 && veiculo.distancia <= 67)) // Entre os km 33 e 34, e 66 e 67, o tempo de deslocamento aumenta em 5 minutos.
            veiculo.tempoDeViagem += 5;
        else
            veiculo.tempoDeViagem += 1;        
    }
    public static void calcularDistancia(Veiculo veiculo) {
        if(veiculo.deslocamento == "saindo") // Se o veículo estiver saindo de RP, a distância em relação a RP aumentará, porque o veículo está indo para mais longe da cidade.
            veiculo.distancia += veiculo.velocidade;
        else if (veiculo.deslocamento == "vindo")  // Se o veículo estiver vindo de outra cidade até RP, a distância em relação a RP diminuirá, porque o veículo está se aproximando da cidade.
            veiculo.distancia -= veiculo.velocidade;
        verificarChegada(veiculo); // Esse verificador serve pra saber se o carro já teria chegado ao seu destino ou se ainda estaria no deslocamento. Serve para encerrar o laço de repetição no método viagemVeiculo;

    }
    public static void verificarChegada(Veiculo veiculo){
        if(veiculo.deslocamento == "saindo" & veiculo.distancia >= 100)
            veiculo.status = "chegou";
        else if(veiculo.deslocamento == "vindo" & veiculo.distancia <= 0)
            veiculo.status = "chegou";
    }
}
