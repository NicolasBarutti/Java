package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void acharDias(int dia, int mes, int ano){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter m = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(d.format(now));
        System.out.println(m.format(now));
        System.out.println(a.format(now));

    }
}
