package ru.mai.whoWantsToBeAMillioner;

public class Manager {

    private int prize;

    /**
     * основной метод программы
     */
    public static void  main(String[] args) {
        System.out.println("Main method");
    }

    /**
     * Этот метод начинает игру
     */
    public void startGame() {
        System.out.println("Start game method");
    }

    /**
     * Этот метод позволяет присоединить друга для игры вдвоем
     */
    public void connectPlayers() {
        System.out.println("Connect people method");
    }

    /**
     * Этот метод позволяет перезапустить игру
     */
    public void restartGame() {
        System.out.println("restart game method");
    }

    /**
     * Этот метод отправляет приз
     * @param whoGetsThePrize кому отправить приз
     */
    private void sendThePrize(String whoGetsThePrize) {
        System.out.println("send the prize method");
    }


}
