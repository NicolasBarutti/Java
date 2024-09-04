package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final  String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl" ;
    public static final String USER = "RM554944";
    public static final String PASS = "030903";

    public static void main(String[] args) throws SQLException {

        Pessoas cliente = new Pessoas(9L,"Mariana",19);
        System.out.println(cliente);

        DatabaseConfig db = new DatabaseConfig(URL,USER,PASS);
        Connection connection = db.getConnection();


        PessoaDao pessoaDao = new PessoaDaoImplementada(connection);
        pessoaDao.create(cliente);
    }
}