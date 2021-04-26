package ru.mai.whoWantsToBeAMillioner;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Этот класс управляет игрой
 */
public class Manager {

    /**
     * Этот метод начинает игру
     */
    public void startGame() {
        System.out.println("Start game method");
        connectPlayers();
        ArrayList<String> questionList;
        Generator generator = new Generator();
        generator.generateFirstPart();
        generator.generateSecondPart();
        generator.generateThirdPart();
        questionList = generator.getQuestionList();
        int numOfQuestion = 0;
        try {
            Answers answer = new Answers();
            do {
                askQuestion(questionList, numOfQuestion);
                numOfQuestion++;
                if (numOfQuestion == 30 ) {
                    System.out.println("YOU WON THE GAME!\n\nHERE IS YOUR PRIZE!!");
                    answer.assignPrize(29);
                    sendThePrize("Player 1");
                }
            } while(numOfQuestion < 30);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.exit(-1);
        }
    }

    /**
     * Этот метод задает игроку вопрос и предлагает 4 вариант ответа
     * @param questionList список вопросов и ответов к нему
     * @param numOfQuestion номер вопроса
     */
    public void askQuestion(ArrayList questionList, int numOfQuestion) {
        System.out.println("Ask question " + numOfQuestion +  " method");
        Answers answer = new Answers();
        int chosenAnswer = answer.chooseAnswer(questionList, numOfQuestion);
        answer.checkAnswerAndPrintResult(questionList.get(numOfQuestion).toString(), chosenAnswer, numOfQuestion);
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
        startGame();
    }

    /**
     * Этот метод завершает игру
     */
    public void endGame() {
        System.out.println("Do you want to restart game?");
        Scanner scan = new Scanner(System.in);
        try {
            if (scan.nextInt() == 1) {
                restartGame();
            } else {
                System.out.println("The game is over");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("The game is over");
            System.exit(0);
        }
    }

    /**
     * Этот метод отправляет приз
     * @param whoGetsThePrize кому отправить приз
     */
    public void sendThePrize(String whoGetsThePrize) {
        System.out.println("send the prize to " + whoGetsThePrize);
    }

}
