package POOjava;

public class Cachorro extends Animal {
    //metodo construtor herdado
    public Cachorro(String _nome, int _idade){
        super(_nome,_idade);
    }


    public void Locomover(){
        System.out.println("O "+nome+" está andando!");
    }

    public void Latir(){
        System.out.println("O "+nome+" está latindo!");
    }



}
