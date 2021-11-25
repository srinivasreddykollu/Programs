package Kollu;

public class Inheritance {
    public static void main(String[] args){
        Animal animal=new Animal("priya",1,1,5,50);
        Dog dog=new Dog("prem",8,20,2,4,1,20,"long");
        dog.eat();
        System.out.println(dog.getName());
    }
}
