package exer3Animais;

public class Cachorro extends Animal implements ComerAnimal{

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void comer() {
        System.out.println("Comendo carne");
    }
}
