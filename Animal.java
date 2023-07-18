package POOjava;

public class Animal {
    public String nome;
    public int idade;

    public Animal(String _nome, int _idade){
        this.nome = _nome;
        this.idade = _idade;

    }


    public void Locomover(){
        System.out.println("O "+nome+" está se locomovendo");
    }

    public void EmitirSom(){
        System.out.println("O "+nome+" está emitindo um som");
    }
}

