package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        public static final  String URL = "" ;
        public static final String USER = "RM554944";
        public static final String PASS = "030903";

        Pessoas primeiroCliente = new Pessoas(1l,"Nicolas",35);
        System.out.println(primeiroCliente);

        DatabaseConfig db = new DatabaseConfig(URL,USER,PASS);
        Connection connection = db.getConnection();


        String sql = "INSER INTO PESSOA(id,name,idade) Values (99, Nicolas, 18)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.executeUpdate();
    }
}