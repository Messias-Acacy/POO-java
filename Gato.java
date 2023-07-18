package POOjava;

public class Gato extends Animal {
    
    public Gato(String _nome, int _idade){
        super(_nome,_idade);
    }


    public void Miar(){
        System.out.println("O "+nome+" está miando!");
    }

    public void Locomover(){
        System.out.println("O "+nome+" está andando!");
    }
}
