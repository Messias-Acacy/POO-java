package Arma;

public class arena {
    public static void main(String[] args) {
        Espada arma1 = new Espada("generico","ferro","madeira");

        Rapieira arma2 = new Rapieira("Mighty Blade","luz","divino");
        
        arma1.Cortar();
        arma2.Cortar();
        arma2.Estocar();
        System.out.println(arma2.Dano());
    }
}
