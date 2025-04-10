package org.example;

public class Main {

    public static void main(String[] args) {

        //DatenTypen namen = new DatenTyp() <- Konstruktor
        Mathe bolognese = new Mathe();

        Student st1 = new Student(1, "Max", 22);

        System.out.println(st1.getAge());

        

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}