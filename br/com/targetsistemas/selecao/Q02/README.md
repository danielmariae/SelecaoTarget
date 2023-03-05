# Questão 02

*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.*

Para resolução desse problema, a Sequência de Fibonacci foi criada com base no número desejado. 
Se o número desejado fosse, por exemplo, 3, a sequência teria 3 + 2 elementos, pois sabe-se que na sequência de Fibonacci, todo número é a soma de outros dois.

Foi usado um Array de Ints, para determinar o valor e ir adicionado neste array, a medida que forem feitas as somas dos 2 anteriores com o posterior.

O array se chama fibonacciArray.

Primeiro se determina que os 2 primeiros elementos são 0 e 1.
Depois, foi criado um método estático e privado com o nome calcularSequencia, que teria um laço de repetição com um contador "i" iniciando em 0 e terminando no digito -2 do tamanho do Array.

A fórmula para cálculo era:
`fibonacciArray[i+2] = fibonacciArray[i]+fibonacciArray[i+1];`
Isso pega o número na posição atual do contador, o consequente, e soma na posição contador + 2, para literalmente determinar o que a sequência de Fibonacci é.

Após a finalização do laço de repetição, cria-se a variável char (letra) pertence, que será o que determina a saída PERTENCE ou NÃO PERTENCE a sequência de Fibonacci.

Ele é definido por padrão como 'n', uma vez que em tese, ainda não pertenceria.
Depois, é jogado para um laço de repetição que percorre todo o array com a sequência (fibonacciArray), que caso encontre o número desejado, irá atualizar a variável pertence para 's', indicando que o número pertence a sequência de Fibonacci.

