Projeto de Estudo POO - Abstração: Classe Carro
Descrição
Este projeto é um estudo prático de Programação Orientada a Objetos (POO) em Java, focado no conceito de Abstração. A ideia central é criar uma classe que represente um tipo de dado abstrato, neste caso, Carro, com atributos e métodos que encapsulam as propriedades e comportamentos fundamentais de um carro.

Classe Carro
A classe Carro define um tipo de dado abstrato para representar um veículo com os seguintes atributos:

marca (String): fabricante do carro

modelo (String): modelo do carro

ano (int): ano de fabricação

preco (double): preço do veículo

km (int): quilometragem rodada

Método principal
O método exibirAnuncio() serve para imprimir os detalhes do carro formatados, simulando um anúncio para venda. Pode ser chamado quantas vezes for necessário para exibir as informações do objeto.

java
void exibirAnuncio() {
    System.out.println("=====Carro a venda=====");
    System.out.println("Marca: " + marca + "/" + modelo);
    System.out.println("Ano: " + ano + " + km: " + km );
    System.out.println("Preco R$: " + preco );
}
Objetivos do Projeto
Entender o conceito de abstração na POO.

Praticar a definição de classes, atributos e métodos em Java.

Aprender a exibir informações encapsuladas em objetos.

Como usar
Clone o repositório.

Abra a classe Carro em sua IDE Java preferida.

Crie objetos da classe e utilize o método exibirAnuncio() para visualizar informações.

Licença
Este projeto é para fins educacionais e está disponível para uso livre.
