package POOjava;

public class Fazenda {
    public static void main(String[] args) {
        Ave papagaio = new Ave("Arara",20);
        Cachorro doguinho = new Cachorro("gafield",25);

        papagaio.Locomover();
        doguinho.Latir();


    }
}
