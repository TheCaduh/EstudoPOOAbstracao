public class Loja {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Chevrolet";
        carro1.modelo = "Onix";
        carro1.ano = 2020;
        carro1.preco = 60000;
        carro1.km = 50000;

        Carro carro2 = new Carro();
        carro2.marca = "Ford";
        carro2.modelo = "Ka";
        carro2.ano = 2018;
        carro2.preco = 45000;
        carro2.km = 80000;

        Carro carro3 = new Carro();
        carro3.marca = "Fiat";
        carro3.modelo = "Argo";
        carro3.ano = 2021;
        carro3.preco = 70000;
        carro3.km = 30000;

        carro1.exibirAnuncio();
        carro2.exibirAnuncio();
        carro3.exibirAnuncio();
    }
}
