package animal;
//goi vao package vi nam trong goi package nen ko can.
//import animal.Animal;
//import animal.Chicken;
//import animal.Tiger;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        for (Animal animal1 : animal){
            System.out.println( animal1.makeSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Aplle();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
