package Arma;

public class Espada {
    String nome;
    String metal;
    String cabo;



    public Espada(String inserir_nome,String inserir_tipo_metal, String inserir_tipo_cabo){
        this.nome = inserir_nome;
        this.metal = inserir_tipo_metal;
        this.cabo = inserir_tipo_cabo;
    }

    public void Cortar(){
        System.out.println("A espada chamada "+nome+" feita de "+metal+" cortou!");
    } 
    
}
