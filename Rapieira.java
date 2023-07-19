package Arma;

public class Rapieira extends Espada {
    
    public Rapieira(String nome1, String metal1, String cabo1){
        super(nome1, metal1, cabo1);
    }

    public  void Cortar(){
        System.out.println("essa espada não corta!");
    }

    public void Estocar(){
        System.out.println("você usou um ataque perfurante!");
    }

     int Dano(){
        return 25;
     }
}
