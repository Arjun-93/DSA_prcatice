package COC;


public class Dog extends Animal{

    public Dog() {


    }

    // You can override Animal methods
    public String makeSound(){

        return "Woof";

    }

    public static void main(String[] args) {

        Dog fido = new Dog();

        fido.setName("Fido");

        System.out.println(fido.getName());

    }

}
