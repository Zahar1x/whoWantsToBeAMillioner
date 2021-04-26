package ru.mai.whoWantsToBeAMillioner;

import java.util.ArrayList;

public class Generator {

    /**
     * Поле для хранения списка вопросов и ответов
     */
    private ArrayList<String> questionList = new ArrayList<>();

    /**
     * Этот метод позволяет получить список сгенерированных вопросов и ответов к ним
     * @return список вопросов и ответов
     */
    public ArrayList<String> getQuestionList() {
        return this.questionList;
    }

    /**
     * Этот метод генерирует первую часть вопросов
     */
    public void generateFirstPart() {
        System.out.println("generate first part of questions method");
        for (int i = 0; i < 10; i++) {
            questionList.add("Question " + i);
        }
    }

    /**
     * Этот метод генерирует вторую часть вопросов
     */
    public void generateSecondPart() {
        System.out.println("generate second part of questions method");
        for (int i = 10; i < 20; i++) {
            questionList.add("Question " + i);
        }
    }

    /**
     * Этот метод генерирует третью часть вопросов
     */
    public void generateThirdPart() {
        System.out.println("generate third part of questions method");
        for (int i = 20; i < 30; i++) {
            questionList.add("Question " + i);
        }
    }

    /**
     * Этот метод возвращает новый вопрос, при использовании подсказки замена вопроса
     * @return новый вопрос
     */
    public String extraQuestion() {
        System.out.println("Used change question hint");
        String extraQuestion = "";
        return extraQuestion;
    }
}
