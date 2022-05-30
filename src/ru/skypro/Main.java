package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Alla", "Pugacheva");
        changeValue(person);
        System.out.println(person);
    }

    private static void changeValue(Person value) {
        value.setName("Maxsim");
        value.setSurname("Galkin");
    }
}
