abstract class Animal {

    abstract void makeSound();
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

class main{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.makeSound();
    }
}
