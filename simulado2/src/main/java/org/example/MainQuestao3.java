package org.example;

public class MainQuestao3 {
    public static void main(String[] args) {

        Questao2Questao3 questao3 = new Questao2Questao3();

        questao3.add(10);
        questao3.add(20);
        questao3.add(30);
        questao3.add(50);

        questao3.print();

        System.out.println(questao3.popFirst());

        questao3.print();
    }
}
