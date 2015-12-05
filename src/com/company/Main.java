package com.company;

public class Main {

    public static void main(String[] args) {

        MyOwnList lista = new MyOwnList();

        lista.addToList(4);
        lista.addToList("lalala");
        lista.addToList(3.99);
        lista.addToList(4);
        lista.addToList("lalala");
        lista.addToList(3.99);
        lista.addToList(4);
        lista.addToList("lalala");
        lista.addToList(3.99);
        lista.addToList(4);
        lista.addToList("lalala");
        lista.addToList(3.99);

        lista.printElements();

        System.out.println(lista.getSize());

        lista.deleteElement(10);

        lista.printElements();

        System.out.println(lista.getSize());

        System.out.println(lista.isOnTheList("lalalabum"));

    }
}
