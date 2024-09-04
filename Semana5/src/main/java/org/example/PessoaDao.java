package org.example;


import java.sql.SQLException;
import java.util.List;

public interface PessoaDao {

    //Todo: Criar a Assinatura para Create
    void create(Pessoas pessoas) throws SQLException;

    //Todo: Criar a Assinatura para Read
    List<Pessoas> read();

    //Todo: Criar a Assinatura para Update
    void update(Pessoas pessoas);

    //Todo: Criar a Assinatura para Delete
    void  delete(Long id);


}
