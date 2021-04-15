package ru.mai.whoWantsToBeAMillioner;

public class Answers {

    /**
     * Этот метод определяет размер приза
     * @param lastAnsweredQuestion этот параметр определяет на каком вопросе остановился игрок
     * @return размер приза
     */
    private int assignPrize(int lastAnsweredQuestion) {
        int prizeAmount = 0;
        System.out.println("Assign prize method");
        return prizeAmount;
    }

    /**
     * Этот метод проверяет ответ и возврашает результат проверки
     * @param numOfAnswer номер выбранного варианта ответа
     * @param question вопрос, на который игрок дает ответ
     * @return правильный ответ или нет
     */
    private boolean checkAnswerAndPrintResult(String question, int numOfAnswer) {
        boolean bool = false;
        System.out.println("check Answer And Print Result method");
        return bool;
    }

    /**
     * Этот метод принимает ответ игрока
     */
    private void acceptAnswer() {
        System.out.println("accept answer method");
    }

    /**
     * Этот метод позволяет игроку выбрать вариант ответа на поставленный вопрос
     * @param question вопрос, на который игроку нужно ответить
     * @return номер выбранного варианта ответа
     */
    public int chooseAnswer(String question) {
        int chosenAnswer = 0;
        System.out.println("Choose answer method");
        return chosenAnswer;
    }
}
