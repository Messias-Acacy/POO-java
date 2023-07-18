package POOjava;

public class Ave extends Animal {
    
    public Ave (String _nome, int _idade){
        super(_nome,_idade);
    }

    public void Cantando(){
        System.out.println("o "+nome+" está cantando!");
    }

    public void Voar(){
        System.out.println("O "+nome+" está voando!");
    }
}
