package ru.mai.whoWantsToBeAMillioner;

/**
 * Этот класс позволяет игроку использовать подсказки для ответа на вопрос
 */
public class Hints {

    /**
     * Это поле хранит количество использований подсказки от ведущего
     */
    private int useleadingsHintCounter = 0;

    /**
     * Это поле хранит количество использований подсказки замена вопроса
     */
    private int useChangeQuestionHintCounter = 0;

    /**
     * Это поле хранит количество использований подсказки 50 на 50
     */
    private int useFiftyFiftyHintCounter = 0;

    /**
     * Это поле хранит количество использований подсказки право на ошибку
     */
    private int useOneMistakeRuleHintCounter = 0;

    /**
     * Это поле хранит количество использований подсказки звонок другу
     */
    private int useCallToFriendHintCounter = 0;

    /**
     * Этот метод позволяет использовать подсказку ведущего
     */
    public void useleadingsHint() {
        System.out.println("USE LEADING HINT METHOD");
        this.useleadingsHintCounter++;
    }

    /**
     * Этот метод позволяет использовать подсказку замена вопроса
     * @return новый вопрос
     */
    public String useChangeQuestionHint() {
        Generator generator = new Generator();
        System.out.println("USE LEADING HINT METHOD");
        this.useChangeQuestionHintCounter++;
        return generator.extraQuestion();
    }

    /**
     * Этот метод позволяет использовать подсказку 50 на 50
     */
    public void useFiftyFiftyHint() {
        System.out.println("USE 50:50 HINT METHOD");
        this.useFiftyFiftyHintCounter++;
    }

    /**
     * Этот метод позволяет использовать подсказку право на ошибку
     */
    public void useOneMistakeRuleHint() {
        System.out.println("USE ONE MISTAKE RULE HINT METHOD");
        this.useOneMistakeRuleHintCounter++;
    }

    /**
     * Этот метод позволяет использовать подсказку звонок другу
     */
    public void useCallToFriendHint() {
        System.out.println("USE CALL TO FRIEND METHOD");
        this.useCallToFriendHintCounter++;
    }

    /**
     * Этот метод позволяет получить количество вызовов подсказки ведущего
     * @return кол-во подсказок
     */
    public int getUseleadingsHintCounter() {
        return useleadingsHintCounter;
    }

    /**
     * Этот метод позволяет получить количество вызовов подсказки замена вопросов
     * @return кол-во подсказок
     */
    public int getUseChangeQuestionHintCounter() {
        return useChangeQuestionHintCounter;
    }

    /**
     * Этот метод позволяет получить количество вызовов подсказки 50 на 50
     * @return кол-во подсказок
     */
    public int getUseFiftyFiftyHintCounter() {
        return useFiftyFiftyHintCounter;
    }

    /**
     * Этот метод позволяет получить количество вызовов подсказки право на ошибку
     * @return кол-во подсказок
     */
    public int getUseOneMistakeRuleHintCounter() {
        return useOneMistakeRuleHintCounter;
    }

    /**
     * Этот метод позволяет получить количество вызовов подсказки звонок другу
     * @return кол-во подсказок
     */
    public int getUseCallToFriendHintCounter() {
        return useCallToFriendHintCounter;
    }
}

