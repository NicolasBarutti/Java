package org.example;

public class MainQuestao2 {
    public static void main(String[] args) {

        Questao2Questao3 questao2 = new Questao2Questao3();

        questao2.add(10);
        questao2.add(8);

        questao2.print();

        System.out.println(questao2.peek());

        questao2.pop();

        questao2.print();
    }
}
