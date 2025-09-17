import javax.xml.transform.stream.StreamSource;
//Em Java toda classe que eu não tenho um ponto de partida ela define um tipo.
//A classe carro define o tipo de dado carro.
public class Carro {
    String marca;
    String modelo;
    int ano;
    double preco;
    int km;

//A ideia é que eu tenha esse metodo para chamar quantas vezes eu quiser exibir o anuncio.
    void exibirAnuncio() {
        System.out.println("=====Carro a venda=====");
        System.out.println("Marca: " + marca + "/" + modelo);
        System.out.println("Ano: " + ano + " + km: " + km );
        System.out.println("Preco R$: " + preco );
    }
}
