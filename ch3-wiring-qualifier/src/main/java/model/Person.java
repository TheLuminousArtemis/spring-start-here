package model;

public class Person {
    private Parrot parrot;
    private String name;

    public Person(Parrot parrot, String name){
        this.parrot = parrot;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "parrot=" + parrot +
                ", name='" + name + '\'' +
                '}';
    }

    public Parrot getParrot() {
        return parrot;
    }
}
