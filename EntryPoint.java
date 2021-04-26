package ru.mai.whoWantsToBeAMillioner;

/**
 * Этот класс является точкой входа в программу
 */
public class EntryPoint {

    /**
     * основной метод программы
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Main method");
        Manager manager = new Manager();
        manager.startGame();
    }
}
