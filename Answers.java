package ru.mai.whoWantsToBeAMillioner;

import java.util.ArrayList;

public class Answers {

    /**
     * Объект класса подсказки
     */
    private Hints hint = new Hints();

    /**
     * Этот метод определяет размер приза
     * @param lastAnsweredQuestion этот параметр определяет на каком вопросе остановился игрок
     */
    public void assignPrize(int lastAnsweredQuestion) {
        int prizeAmount = lastAnsweredQuestion * 100;
        System.out.println(prizeAmount);
    }

    /**
     * Этот метод проверяет ответ и возврашает результат проверки
     * @param numOfAnswer номер выбранного варианта ответа
     * @param question вопрос, на который игрок дает ответ
     * @return правильный ответ или нет
     */
    public void checkAnswerAndPrintResult(String question, int numOfAnswer, int numOfQuestion) {
        System.out.println("check Answer And Print Result method");
        Manager manager = new Manager();
        if (Math.random() < 0.2) {
            System.out.println("Answer is wrong!\nHere is your prize");
            assignPrize(numOfQuestion);
            manager.sendThePrize("Player 1");
            manager.endGame();
        } else {
            System.out.println("Answer is true");
        }
    }

    /**
     * Этот метод принимает ответ игрока
     */
    private void acceptAnswer() {
        System.out.println("accept answer method");
    }

    /**
     * Этот метод позволяет игроку выбрать вариант ответа на поставленный вопрос
     * @param questionList Список вопросов и ответов к ним
     * @param numOfQuestion номер вопроса, который задан игроку
     */
    public int chooseAnswer(ArrayList questionList, int numOfQuestion) {
        System.out.println("Choose answer method");
        useHintOrNo(hint);
        int chosenAnswer = 1;
        acceptAnswer();
        return chosenAnswer;
    }

    /**
     *Этот метод спршивает игрока будет ли он использовать подсказку к данному вопросу и позволяет ему использовать ее
     * @param hint объект класса Hints, дает доступ к различным подсказкам
     */
    public void useHintOrNo(Hints hint) {
        double rand = Math.random();
        if (rand < 0.5) {
            if (rand < 0.1 && hint.getUseCallToFriendHintCounter() < 1) {
                hint.useCallToFriendHint();
            } else if (rand < 0.2 && rand > 0.1 && hint.getUseChangeQuestionHintCounter() < 1) {
                hint.useChangeQuestionHint();
            } else if (rand < 0.3 && rand > 0.2 && hint.getUseleadingsHintCounter() < 1) {
                hint.useleadingsHint();
            } else if (rand < 0.4 && rand > 0.3 && hint.getUseFiftyFiftyHintCounter() < 1) {
                hint.useFiftyFiftyHint();
            } else if (rand < 0.5 && rand > 0.4 && hint.getUseOneMistakeRuleHintCounter() < 1) {
                hint.useOneMistakeRuleHint();
            }
        }
    }
}
