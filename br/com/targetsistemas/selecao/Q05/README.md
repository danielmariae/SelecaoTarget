# Questão 05:

*5) Escreva um programa que inverta os caracteres de um string.*
*IMPORTANTE:*
*a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;*
*b) Evite usar funções prontas, como, por exemplo, reverse;*

Primeiro, defini uma String palavra, com o valor "Target" e isso foi impresso no Terminal.

Após isso, usei o método toCharArray(), a fim de separar os caracteres da String palavra. Cada um numa posição de um Array.
Depois, 

Depois, foi criado um array onde as letras da palavra inversa ficariam. Esse array contém o tamanho igual ao número de caracteres na String palavra.

Foi também definido uma variável int j, iniciliazada com 0, para armazenar os caracteres invertidos no Array letrasInvertidas.

Após isso, foi criado um laço de repetição com contador, inicializando com o tamanho da palavra - 1, a fim de evitar estouro de memória, percorrendo o Array letrasCorretas em ordem decrescente, encerrando no 0.

Exemplo de funcionamento:
Se a letra 'T' estava na posição 4 do array com as letrasCertas, na posição 0, será atribuída a letra T também, de modo que a palavra fique invertida.
A letra na posição 3 das letrasCertas iria para a posição 1 das letrasInvertidas, e assim seguindo a sequência.

Depois, fora criada a String palavraInvertida, que receberia a concatenação do array letrasInvertidas.

No fim, imprimimos a palavra invertida para o usuário. Não foi usado o método reverse(), como a questão solicitou a nós.